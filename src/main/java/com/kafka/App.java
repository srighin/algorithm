package com.kafka;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecords;

public class App {

    public static void main(String[] args) {
        runConsumer();
    }
    //https://stackoverflow.com/questions/37920923/how-to-check-whether-kafka-server-is-running
    //The ZooKeeper client interface exposes a number of commands; dump lists all the sessions and ephemeral nodes for the cluster.
    // echo dump | nc pkc-lo319.us-west-2.aws.confluent.cloud 9092 | grep brokers
    static void runConsumer() {
        Consumer<Long, String> consumer = ConsumerCreator.createConsumer();
        int noMessageFound = 0;
        while (true) {
            ConsumerRecords<Long, String> consumerRecords = consumer.poll(10);
            // 1000 is the time in milliseconds consumer will wait if no record is found at broker.
            if (consumerRecords.count() == 0) {
                noMessageFound++;
                if (noMessageFound > IKafkaConstants.MAX_NO_MESSAGE_FOUND_COUNT)
                    break;
                else
                    continue;
            }
            //print each record.
            consumerRecords.forEach(record -> {
                System.out.println("Record Key " + record.key());
                System.out.println("Record value " + record.value());
                System.out.println("Record partition " + record.partition());
                System.out.println("Record offset " + record.offset());
            });
            // commits the offset of record to broker.
            consumer.commitAsync();
        }
        consumer.close();
    }
}
