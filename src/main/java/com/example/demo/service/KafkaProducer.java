package com.example.demo.service;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class KafkaProducer {
	
	   private static final Logger logger = LogManager.getLogger(KafkaProducer.class);
	    private static final String TOPIC = "MySecondTopicForDemo";

	    @Autowired
	    private KafkaTemplate<String, String> kafkaTemplate;

	    public void sendMessage(String message) {
	        logger.info(String.format("#### -> Producing message -> %s", message));
	        this.kafkaTemplate.send(TOPIC, message);
	    }

}
