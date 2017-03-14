package com.citiustech.ge.aws.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.citiustech.ge.aws.main.bean.PatientBean;
import com.citiustech.ge.aws.main.service.PatientService;



@Controller
public class PatientController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PatientController.class);
	private final PatientService patientService;

	@Autowired
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping("/create" )
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<PatientBean> create(@RequestBody PatientBean pb) {
		LOGGER.info("Creating a new patient entry with information: {}", pb);
		
		PatientBean created = patientService.create(pb);
		LOGGER.info("Created a new patient entry with information: {}", created);
		return new ResponseEntity<PatientBean>(created,HttpStatus.OK);
	}
/*
	@GetMapping
	List<PatientBean> findAll() {
		LOGGER.info("Finding all  entries");

		List<PatientBean> beans = patientService.findAll();
		LOGGER.info("Found {} beans entries", beans.size());
		return beans;
	}*/

}
