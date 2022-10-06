package com.signin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.signin.entity.Credentials;
import com.signin.services.CredService;

@RestController
public class CredController {
	
	@Autowired
	private CredService credser;
	
	
	@PostMapping("/register/")
	public Credentials registeruser(@RequestBody Credentials cre) throws Exception {
		String temp = cre.getUserEmail();
		if(temp != null && !"".equals(temp)) {
			Credentials cd = credser.fetchuserId(temp);
			if(cd !=null) {
				throw new Exception("user with" +temp+" is already present");
			}
		}
		
		Credentials cred = null;
		cred = credser.saveuser(cre);
		return cred;
		
	}
	
	@PostMapping("/login")
	public Credentials loginUser(@RequestBody Credentials cred) throws Exception{
		String temp = cred.getUserEmail();
		Integer password = cred.getPassword();
		Credentials cd = null;
		if(temp !=null  && password != null) {
			cd = credser.fetchuserIdAndPassword(temp, password);
		}
		if (cd== null) {
			throw new Exception ("bad credentials");
			
		}
		return cd;
		}
	
	

}
