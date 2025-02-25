package com.deliveryboy.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.AppConstants;

import org.springframework.kafka.core.KafkaTemplate;


@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String ,String> KafkaTemplate;
	 
	private Logger logger= LoggerFactory.getLogger(KafkaService.class);
	
	public boolean updateLocation(String location) {
		this.KafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
		this.logger.info("location message produced");
		return true;
	}
}
