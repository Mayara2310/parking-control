package com.api.parkingcontrol;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.services.ParkingSpotService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ParkingControlApplicationTests{

	@Mock
	ParkingSpotRepository parkingSpotRepository;

	@InjectMocks
	private ParkingSpotService parkingSpotService;

	private ParkingSpotModel parkingSpotModel;

	@BeforeEach
	public void setUp() {
		parkingSpotModel = new ParkingSpotModel();

	}

}
