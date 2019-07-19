package com.ding.park;

import org.springframework.stereotype.Service;

@Service
public class SendKafkaService {

    public boolean send(String topic,String sendJson){
        System.out.println("sending topic="+topic+"data="+sendJson);
        System.out.println("send ok");
        return true;
    }
}
