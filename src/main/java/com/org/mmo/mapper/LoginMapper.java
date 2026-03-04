package com.org.mmo.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.mmo.dto.LoginDto;
import com.org.mmo.entities.CustomerEntity;

@Component
public class LoginMapper {

	public LoginDto setCustDetails(CustomerEntity custEntity) {
		
		LoginDto loginDto = new LoginDto();
		loginDto.setCustName(custEntity.getCustName());
		loginDto.setAddress(custEntity.getAddress());
		loginDto.setContactNo(custEntity.getContactNo());
		loginDto.setRewardPoints(custEntity.getRewardPoints());

		return loginDto;
	}

}
