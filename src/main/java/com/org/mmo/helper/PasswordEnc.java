package com.org.mmo.helper;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEnc {

	private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	public static String getEncodedPassword(String userPass) {
		String encodedPass = passwordEncoder.encode(userPass);
		return encodedPass;
	}
	
	public static Boolean passwordMatcher(String encodedPass, String userPass) {
		boolean matches = passwordEncoder.matches(userPass, encodedPass);
		return matches;
	}
	
}
