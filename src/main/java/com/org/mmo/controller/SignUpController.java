package com.org.mmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.mmo.dto.SignUpDto;
import com.org.mmo.service.SignUpService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("api/base")
public class SignUpController {

	@Autowired
	private SignUpService signUpService;
	
	@PostMapping("/signUp")
	public ResponseEntity<?> getUserDetails(@Valid @RequestBody SignUpDto signUpDto){
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "User Successfully Registered "));
	}
	
}
