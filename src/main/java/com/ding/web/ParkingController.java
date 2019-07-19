package com.ding.web;

import com.ding.park.InParkingData;

import com.ding.park.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ParkingController {
    @Autowired
    ParkingService parkingService;

    @RequestMapping("/inParking")
    public String inParking( InParkingData inParkingData) {
        parkingService.inParking(inParkingData);
        return "inparking ok";
    }

}