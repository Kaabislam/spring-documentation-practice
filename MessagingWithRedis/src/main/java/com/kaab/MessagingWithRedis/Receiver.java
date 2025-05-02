package com.kaab.MessagingWithRedis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class Receiver {

    public static final Logger logger = LoggerFactory.getLogger(Receiver.class);

    private AtomicInteger counter = new AtomicInteger();
    public void receiveMessage(String msg){
        logger.info("received < " + msg + " >");
        counter.incrementAndGet();
    }

    public int getCount(){
        return counter.get();
    }


}
