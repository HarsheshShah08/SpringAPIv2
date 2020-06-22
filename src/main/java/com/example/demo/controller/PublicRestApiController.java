package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.SpringApIsv2Application;
import com.example.demo.service.KafkaProducer;

import org.apache.logging.log4j.*;

@RestController
@RequestMapping("api/public")
public class PublicRestApiController {
	
	private static final Logger logger = LogManager.getLogger(PublicRestApiController.class);
	
	private final KafkaProducer kafkaProducer;

    @Autowired
    PublicRestApiController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.kafkaProducer.sendMessage(message);
    }

    @GetMapping("test1")
    public String test1(){
    	   	
    	logger.info("test1 - Harshesh");
    	this.kafkaProducer.sendMessage("API test1 - Harshesh");
    	return "API Test 1";
    }

    @GetMapping("test2")
    public String test2(){
    	
    	logger.info("test2 - Harshesh");
    	this.kafkaProducer.sendMessage("API test2 - Harshesh");
        return "API Test 2";
    }
    


}
