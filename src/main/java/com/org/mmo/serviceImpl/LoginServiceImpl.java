package com.org.mmo.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.mmo.dto.LoginDto;
import com.org.mmo.entities.CustomerEntity;
import com.org.mmo.entities.UserEntity;
import com.org.mmo.helper.PasswordEnc;
import com.org.mmo.mapper.LoginMapper;
import com.org.mmo.repositories.CustomerRepository;
import com.org.mmo.repositories.UserRepository;
import com.org.mmo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserRepository userRepo;	
	
	@Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	private LoginMapper loginMap;
	
	public LoginDto getLoginDetails(LoginDto loginDto) {
		UserEntity userEntity = userRepo.findByEmailId(loginDto.getEmailId());
		System.out.println("User:"+ userEntity);
		System.out.println("Enc Pass:"+ PasswordEnc.getEncodedPassword(loginDto.getPasskey()));
		System.out.println("Matcher:"+ PasswordEnc.passwordMatcher(userEntity.getPasskey(), loginDto.getPasskey()));
		
		if(userEntity==null || !PasswordEnc.passwordMatcher(userEntity.getPasskey(), loginDto.getPasskey())) {
			throw new RuntimeException("Invalid credentials");
		}
		Optional<CustomerEntity> custEntities = custRepo.findById(userEntity.getUserId());
		if(custEntities.isEmpty()) throw new RuntimeException("No customer present with given ID");
		CustomerEntity custEntity = custEntities.get();
		loginDto = loginMap.setCustDetails(custEntity);
				
		return loginDto;
	}
	
}
