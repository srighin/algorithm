package com.sriman;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Random;
import java.util.UUID;


public class InsertIntoMongoDB {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        try{
            DB db = mongoClient.getDB("conversations");
            DBCollection collection = db.getCollection("bookingnotification");
            LocalDate startDate = LocalDate.of(2019, 01, 05);
            LocalDate endDate = LocalDate.of(2020, 01, 9);

            for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1))
            {
                for (int i = 0; i < 2500; i++)
                {
                    BasicDBObject document = new BasicDBObject();
                    document.put("_id", UUID.randomUUID().toString());
                    document.put("siteId", "28");
                    document.put("brand", "expedia");
                    document.put("locale", "en_US");
                    document.put("hashedPhoneNumber", "464622861974aa054ce0ae657daed9abcf8fdd144724635dee8bc7ec2cde7cfe");
                    document.put("channelType", "LINE");
                    Random rand = new Random();
                    document.put("itineraryNumber", String.valueOf(rand.nextInt(9000000) + 1000000));
                    document.put("bookingNotificationType", "FLIGHT");
                    ZoneId zoneId = ZoneId.systemDefault(); // or: ZoneId.of("Europe/Oslo");
                    long epoch = date.atStartOfDay(zoneId).toEpochSecond();
                    document.put("createdTimeStamp",epoch*1000);
                    document.put("expUserId",rand.nextInt(9000000) + 1000000);
                    document.put("deliveryEventReceived",0);
                    document.put("isPNP",true);
                    document.put("clientId","TX-BRIDGE");
                    document.put("userID",UUID.randomUUID().toString());
                    document.put("httpStatus","422");
                    document.put("reasonPhrase","Unprocessable Entity");
                    document.put("payload","{\"payload\":{\"hotelDetails\":{\"hotelId\":\"7056\",\"checkInDateTime\":{\"raw\":\"2019-10-15T15:00:00+08:00\",\"localizedShortDate\":\"2019/10/15\",\"localizedMediumDate\":\"Oct 15\",\"localizedShortTime\":\"3:00pm\",\"localizedFullDate\":\"Tue, Oct 15\",\"timeZoneOffsetSeconds\":28800,\"localized\":\"Oct 15, 2019 3:00:00 PM\"},\"checkOutDateTime\":{\"raw\":\"2019-10-16T11:00:00+08:00\",\"localizedShortDate\":\"2019/10/16\",\"localizedMediumDate\":\"Oct 16\",\"localizedShortTime\":\"11:00am\",\"localizedFullDate\":\"Wed, Oct 16\",\"timeZoneOffsetSeconds\":28800,\"localized\":\"Oct 16, 2019 11:00:00 AM\"},\"hotelPropertyInfo\":{\"name\":\"The Peninsula Hong Kong\",\"photoThumbnailURL\":\"/hotels/1000000/10000/7100/7056/a10205f1_l.jpg\",\"photoThumbnail500pixURL\":\"/hotels/1000000/10000/7100/7056/a10205f1_y.jpg\",\"photoThumbnail1000pixURL\":\"/hotels/1000000/10000/7100/7056/a10205f1_z.jpg\",\"address\":{\"city\":\"Kowloon\",\"addressLine1\":\"Salisbury Road\",\"countrySubdivisionCode\":\"\",\"postalCode\":\"\",\"countryCode\":\"HKG\",\"countryName\":\" Hong Kong SAR\",\"fullAddress\":\"Salisbury Road, Kowloon Hong Kong SAR\",\"airportCode\":\"HKG\"},\"localPhone\":\"+85-2-29202888\",\"tollFreePhone\":\"1-800-223-6800\",\"formattedPhoneNumbers\":\"Tel: 85 (2) 29202888, Fax: 85 (2) 27214399\"},\"bookingStatus\":\"BOOKED\",\"bookingStatusText\":\"Booked\",\"infositeURL\":\"https://wwwexpediacojp.trunk.sb.karmalab.net/itin.h7056.Hotel-Information?langid\\u003d1033\",\"orderNumber\":\"8052962100159\",\"numberOfNights\":1,\"rooms\":[{\"uniqueID\":\"F3C8EFBB-62CC-44FE-8D95-033594E72470_0_785820962\",\"roomRatePlanDescription\":\"Deluxe King Room\",\"refundabilityStatus\":\"REFUNDABLE\"}],\"isFreeCancellationAvailable\":false,\"inventoryType\":\"MERCHANT\"},\"phoneCountryCode\":\"81\",\"phoneAreaCode\":\"123\",\"phoneNumber\":\"4567\",\"locale\":\"en_US\",\"itin\":791409903398,\"tuid\":335917,\"expUserId\":7250004},\"conversationResponseType\":\"EXPWEB_NOTIFICATION\",\"bookingNotificationType\":\"HOTEL\",\"site\":\"28\",\"brand\":\"expedia\",\"pos\":\"us\",\"locale\":\"en_US\",\"channelType\":\"line\",\"timestamp\":1563324905569,\"retryNo\":0}");

                    collection.insert(document);
                }
            }
        } finally {
            mongoClient.close();
        }
    }
}
