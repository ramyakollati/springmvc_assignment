package com.springmvc;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("ramya") && password.equals("kollati");
	}

}