package com.org.mmo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.org.mmo.entities.CustomerEntity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LoginDto {

	@Email(message="Please Enter Valid Email Address")
	private String emailId;
	
	@NotBlank(message="Please Enter Password")
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String passkey;
	
	private String custName;
	
	private int contactNo;
	
	private String address;
	
	private int rewardPoints;
	
}

/*
{
 "emailId": "vinits0804@gmail.com",
 "passkey": "user1234",
 "custName": null,
 "contactNo": 0,
 "address": null,
 "rewardPoints": 0
}
*/
