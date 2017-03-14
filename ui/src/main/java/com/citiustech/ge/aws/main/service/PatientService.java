package com.citiustech.ge.aws.main.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citiustech.ge.aws.main.bean.PatientBean;
import com.citiustech.ge.aws.main.bean.PatientRepository;

@Service
public class PatientService {

	private static final Logger LOGGER = LoggerFactory.getLogger(PatientService.class);
	private final PatientRepository repository;

	@Autowired
	PatientService(PatientRepository repository) {
		this.repository = repository;
	}

	public PatientBean create(PatientBean pb) {
		PatientBean persisted =repository.save(pb);
		LOGGER.info("Created a new todo entry with information: {}", persisted);
		return persisted;
	}

	
	public List<PatientBean> findAll() {
        List<PatientBean> beans = repository.findAll();
        return beans;
    }
	
}
