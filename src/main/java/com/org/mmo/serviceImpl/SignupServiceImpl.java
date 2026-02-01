package com.org.mmo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.mmo.dto.SignUpDto;
import com.org.mmo.entities.CustomerEntity;
import com.org.mmo.entities.UserEntity;
import com.org.mmo.helper.IDGenerator;
import com.org.mmo.helper.PasswordEnc;
import com.org.mmo.mapper.SignUpMapper;
import com.org.mmo.repositories.CustomerRepository;
import com.org.mmo.repositories.UserRepository;
import com.org.mmo.service.SignUpService;

@Service
public class SignupServiceImpl implements SignUpService{

	@Autowired
	private IDGenerator idGenerator;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private CustomerRepository custRepo;
	
	public SignUpDto getUserRegistered(SignUpDto signUpDto) {
		try{
			int userId = idGenerator.generateUserId();
			signUpDto.setUserId(userId);
			UserEntity userEntity = SignUpMapper.getUserEntity(signUpDto);
			CustomerEntity custEntity = SignUpMapper.getCustEntity(signUpDto);
			userEntity.setPasskey(PasswordEnc.getEncodedPassword(userEntity.getPasskey()));
			userEntity = userRepo.save(userEntity);
			custEntity = custRepo.save(custEntity);
		}catch(Exception e){
			throw e;
		}
		return signUpDto;
	}
	
}
