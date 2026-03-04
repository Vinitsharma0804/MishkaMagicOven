package com.org.mmo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SignUpDto {

	private int userId;
	
	private String userType;
	
	@NotBlank(message="Please Enter First Name")
	private String firstName;
	
	private String middleName;
	
	@NotBlank(message="Please Enter Last Name")
	private String lastName;
	
	@Email(message="Please Enter Valid Email Address")
	private String emailId;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String passkey;
	
	@NotBlank(message="Please Enter Contact Number")
	private int contactNo;
	
	@NotBlank(message="Please Enter Address")
	private String address;
	
	private String secQues;
	
	private String secAns;
	
	private int rewardPoints;
	
}

/*
 {
  "userId": ,
  "userType": "",
  "firstName": "Vinit",
  "middleName": "Jayanand",
  "lastName": "Sharma",
  "emailId": "vinits0804@gmail.com",
  "passkey": "user@1234",
  "contactNo": 123456789,
  "address": "Athlone, Ireland",
  "secQues": "",
  "secAns": "",
  "rewardPoints": 0
}
*/
