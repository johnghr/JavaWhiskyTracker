package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetDistilleryByRegion(){
		List<Distillery> foundDistillery = distilleryRepository.findByRegion("Highland");
		assertEquals(3, foundDistillery.size());
	}

	@Test
	public void canGetWhiskyByYear () {
		List<Whisky> foundWhisky = whiskyRepository.findByYear(2018);
		assertEquals(6, foundWhisky.size());
	}

//	@Test
//	public void canFindByDistilleryLessThanYear() {
//		Distillery distillery1 = distilleryRepository.getOne(1l);
//		List<Whisky> foundWhisky = whiskyRepository.findByDistilleryNameAndAge("Glendronach", 2020);
//		assertEquals(1, foundWhisky.size());
//	}

}
