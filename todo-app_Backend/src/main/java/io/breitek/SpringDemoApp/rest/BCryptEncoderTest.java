package io.breitek.SpringDemoApp.rest;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String encodedString = bCryptPasswordEncoder.encode("password");
		
		System.out.println(encodedString);
	}

}
