package com.msa.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.msa.service2.dao.Service1Dao;
import com.msa.service2.service.KafkaProducerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Service1Controller {

	@Autowired
	Service1Dao dao;
	
	@Autowired
	KafkaProducerService producer;
	

	@RequestMapping(path = "/regist.do", method = RequestMethod.GET)
	public void test() {
		System.out.println(dao.test());
	}
	
	
	@RequestMapping(path = "/kafka.do", method = RequestMethod.GET)
	public void kafkaTest() {
		producer.send("test Message");
	}

}
