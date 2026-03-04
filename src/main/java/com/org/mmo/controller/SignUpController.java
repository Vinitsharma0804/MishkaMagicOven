package com.org.mmo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.mmo.dto.SignUpDto;
import com.org.mmo.dto.Response;
import com.org.mmo.service.SignUpService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/v1/base")
public class SignUpController {

	@Autowired
	private SignUpService signUpService;
	
	@PostMapping("/signUp")
	public ResponseEntity<?> getUserDetails( @RequestBody SignUpDto signUpDto){
		System.out.println("Entering getUserDetails in SignUpController");
		try {
		signUpDto = signUpService.getUserRegistered(signUpDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "User Successfully Registered "));
	
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("message", "Server error occured, kindly contact technical team."));
		}
	}
	
	
}
