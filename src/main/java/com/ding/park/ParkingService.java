package com.ding.park;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingService {
    @Autowired
    SendKafkaService sendKafkaService;
    public void inParking(InParkingData inParkingData){
        System.out.println("doing inparking process");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendKafkaService.send("topic001",inParkingData.toString());
    }
}
