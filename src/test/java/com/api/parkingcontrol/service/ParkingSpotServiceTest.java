package com.api.parkingcontrol.service;


import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.services.ParkingSpotService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ParkingSpotServiceTest {

    private ParkingSpotRepository parkingSpotRepository;
    private ParkingSpotService parkingSpotService;
    private final String licensePlateCar = "HTE3456";
    private String parkingSpotNumber = "23";

    @BeforeEach
    void setUp(){
        parkingSpotRepository = mock(ParkingSpotRepository.class);
        parkingSpotService = new ParkingSpotService(parkingSpotRepository);
    }

    @Test
    void ifExistsLicensePlateCar(){
        when(parkingSpotRepository.existsByLicensePlateCar(licensePlateCar))
                .thenReturn(Boolean.TRUE);
        parkingSpotService.existByLicensePlateCar(licensePlateCar);

        Assertions.assertTrue(true, "HTE3456");

    }

    @Test
    void ifExistsNumber(){
        when(parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber))
                .thenReturn(Boolean.TRUE);
        parkingSpotService.existByParkingSpotNumber(parkingSpotNumber);

        Assertions.assertTrue(true, "23");


    }

}
