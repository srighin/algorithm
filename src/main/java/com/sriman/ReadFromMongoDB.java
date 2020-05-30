package com.sriman;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.redisson.Redisson;
import org.redisson.api.BatchOptions;
import org.redisson.api.RBatch;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;

import static com.mongodb.client.model.Accumulators.first;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.project;
import static com.mongodb.client.model.Aggregates.sort;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.lt;
import static com.mongodb.client.model.Projections.computed;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import static com.mongodb.client.model.Sorts.descending;
import static java.util.Arrays.asList;

public class ReadFromMongoDB {

    private static MongoClient mongoClient = new MongoClient("localhost", 27017);
    private static DB conversation_db = mongoClient.getDB("cachetesting");
    private static MongoDatabase database = mongoClient.getDatabase("cachetesting");
    private static DBCollection booking_collection = conversation_db.getCollection("bookingnotification");
    private static MongoCollection<Document> mongoCollection = database.getCollection("bookingnotification");

    private static Config config = new Config();
    private static Gson gson;



    private static DBCollection metadata_collection = conversation_db.getCollection("metadata");

    public static void main(String[] args) {
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        RedissonClient redisson = Redisson.create(config);

        RBatch batch = redisson.createBatch(BatchOptions.defaults());


        BasicDBObject query = new BasicDBObject();

        BasicDBObject fields = new BasicDBObject("userID", 1).append("itineraryNumber", 1).append("expUserId", 1);
        long start = System.currentTimeMillis();
        DBCursor dbObjects = booking_collection.find(query, fields).batchSize(10000);

        List<Bson> bsons = asList(sort(descending("createdTimeStamp")), project(fields(computed("_id", -1L), include("createdTimeStamp"))), group("$_id", first("firstSalesDate", "$createdTimeStamp")));
        AggregateIterable<Document> aggregate = mongoCollection.aggregate(bsons);
        Document firstDate = aggregate.first();
        LocalDateTime triggerTime = LocalDateTime.ofInstant(Instant.ofEpochMilli((Long) firstDate.get("firstSalesDate")*1000), ZoneId.systemDefault());
        LocalDateTime today = LocalDateTime.now();

        gson = new Gson();

        while(today.isAfter(triggerTime)){
            triggerTime = triggerTime.plusDays(10);

            List<Bson> bsonsInner =  asList(match(gt("createdTimeStamp", (triggerTime.toInstant(ZoneOffset.ofTotalSeconds(0)).toEpochMilli())/1000)), match(lt("createdTimeStamp", (triggerTime.plusDays(10).toInstant(ZoneOffset.ofTotalSeconds(0)).toEpochMilli())/1000)), project(include("userID", "itineraryNumber", "expUserId")));
            AggregateIterable<Document> aggregateInner = mongoCollection.aggregate(bsonsInner);

            MongoCursor<Document> iterator = aggregateInner.iterator();
            int modulo = 0;
            while (iterator.hasNext()) {
                if(modulo%10 == 0){
                    batch.execute();
                    modulo =0;
                }
                Document next = iterator.next();
                CacheImplDocument cacheImplDocument = gson.fromJson(next.toJson(), CacheImplDocument.class);
                System.out.println(cacheImplDocument);
                batch.getMap(String.valueOf(cacheImplDocument.getExpUserId())).putAsync(cacheImplDocument.getItineraryNumber(), cacheImplDocument.getUserID());
                modulo++;
            }
           // batch.execute();
        }
        System.out.println("Time taken to excute the query: "+(System.currentTimeMillis() - start));
        mongoClient.close();
        redisson.shutdown();

    }
}
