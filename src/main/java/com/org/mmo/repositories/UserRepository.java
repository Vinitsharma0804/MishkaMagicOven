package com.org.mmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.org.mmo.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	@Query(value = "select coalesce(max(user_id), 0) from users", nativeQuery = true)
	public int findMaxIdOrZero();
	
	public UserEntity findByEmailId(String email);
	
}
