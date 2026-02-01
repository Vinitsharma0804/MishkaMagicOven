package com.org.mmo.mapper;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.mmo.dto.SignUpDto;
import com.org.mmo.entities.CustomerEntity;
import com.org.mmo.entities.UserEntity;

public class SignUpMapper {
	
	public static UserEntity getUserEntity(SignUpDto signUpDto) {
		UserEntity userEnt = new UserEntity();
		userEnt.setUserId(signUpDto.getUserId());
		userEnt.setEmailId(signUpDto.getEmailId());
		userEnt.setPasskey(signUpDto.getPasskey());
		userEnt.setSecurityQues(signUpDto.getSecQues());
		userEnt.setSecurityAns(signUpDto.getSecAns());
		return userEnt;
	}
	
	public static CustomerEntity getCustEntity(SignUpDto signUpDto) {
		CustomerEntity custEnt = new CustomerEntity();
		String firstName = signUpDto.getFirstName();
		String middleName = signUpDto.getMiddleName();
		String lastName = signUpDto.getLastName();
		String fullName = Stream.of(firstName, middleName, lastName)
		        .filter(name -> name != null && !name.isBlank())
		        .collect(Collectors.joining(" "));
		
		custEnt.setUserId(signUpDto.getUserId());
		custEnt.setCustName(fullName);
		custEnt.setContactNo(signUpDto.getContactNo());
		custEnt.setEmailId(signUpDto.getEmailId());
		custEnt.setAddress(signUpDto.getAddress());
		custEnt.setRewardPoints(signUpDto.getRewardPoints());
		return custEnt;
	}
	
	public static SignUpDto getSignUpDto(UserEntity userEntity) {
		SignUpDto signUp = new SignUpDto();
		signUp.setEmailId(userEntity.getEmailId());
		signUp.setPasskey(userEntity.getPasskey());
		signUp.setSecQues(userEntity.getSecurityQues());
		signUp.setSecAns(userEntity.getSecurityAns());
		return signUp;
	}
	
}
