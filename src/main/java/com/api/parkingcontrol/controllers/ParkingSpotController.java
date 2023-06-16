package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.services.ParkingSpotservice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    final ParkingSpotservice parkingSpotservice;

    public ParkingSpotController(ParkingSpotservice parkingSpotservice) {
        this.parkingSpotservice = parkingSpotservice;
    }
}
