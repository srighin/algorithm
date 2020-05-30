package com.sriman;

import org.redisson.Redisson;
import org.redisson.api.BatchOptions;
import org.redisson.api.BatchResult;
import org.redisson.api.RBatch;
import org.redisson.api.RFuture;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class TestRedis {

    private static Config config = new Config();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        RedissonClient redisson = Redisson.create(config);
        int counter = 0;

        RBatch batch = redisson.createBatch(BatchOptions.defaults());
        while(counter++<1000){
            batch.getMap(UUID.randomUUID().toString()).fastPutAsync(Math.random(), Math.random()+100);
            batch.execute();
        }



        redisson.shutdown();
    }
}
