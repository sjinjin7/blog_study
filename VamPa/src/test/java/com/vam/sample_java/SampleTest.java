package com.vam.sample_java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.config.RootConfig;
import com.vam.sample.Restaurant;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class SampleTest {

	@Autowired
	private Restaurant restaurant;
	
	@Test
	public void textExist() {
		
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("--------------------------------------");
		log.info(restaurant.getChef());
		
	}
	
	
}
