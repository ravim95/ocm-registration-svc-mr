package com.ibm.registration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.ibm.registration.models.Registration;
import com.ibm.registration.services.RegistrationApi;

@RestController
public class RegistrationController {

	//@Autowired
	//RegistrationApi service;
	
    private final RegistrationApi service;

    public RegistrationController(RegistrationApi service) {
        this.service = service;
    }

    @PostMapping(path = "/register")
    public Registration register(@RequestBody Registration registration) {
    	return this.service.register(registration);
    }
}