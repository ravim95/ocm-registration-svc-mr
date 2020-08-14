package com.ibm.registration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.registration.models.Enroll;
import com.ibm.registration.models.Registration;
import com.ibm.registration.services.EnrollApi;
import com.ibm.registration.services.RegistrationApi;

@RestController
public class EnrollController {

	//@Autowired
	//RegistrationApi service;
	
    private final EnrollApi service;

    public EnrollController(EnrollApi service) {
        this.service = service;
    }

    @PostMapping(path = "/enroll")
    public Enroll register(@RequestBody Enroll enroll) {
    	return this.service.enroll(enroll);
    }
}