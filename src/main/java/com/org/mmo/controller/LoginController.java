package com.org.mmo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.mmo.dto.LoginDto;
import com.org.mmo.securityConfig.JwtFilter;
import com.org.mmo.service.LoginService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/v1/base")
public class LoginController {

	@Autowired 
	private LoginService loginServ; 
	
	@Autowired
	private JwtFilter jwtFilter;
	Map<String, Object> response = new HashMap();

	
	@GetMapping("/login")
	public ResponseEntity<?> getLoginDetails(@Valid @RequestBody LoginDto loginDto, BindingResult errors){
		
		if(errors.hasErrors()) {
			errors.getFieldErrors().forEach(error -> response.put(error.getField(), error.getDefaultMessage()));
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
		}
		loginDto = loginServ.getLoginDetails(loginDto);
		if (loginDto != null) {
			String jwtToken = jwtFilter.generateToken(loginDto.getEmailId());
			response.put("token", jwtToken);
			response.put("customerDetails", loginDto);
		}
		return ResponseEntity.status(HttpStatus.OK).body(response);		
	}
	
}
