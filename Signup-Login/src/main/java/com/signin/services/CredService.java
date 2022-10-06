package com.signin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signin.Repository.CredRepo;
import com.signin.entity.Credentials;

@Service
public class CredService {
	
	@Autowired
	private CredRepo credrepo;
	
	public Credentials saveuser(Credentials user) {
		return credrepo.save(user);
	}
	
	public Credentials fetchuserId(String userEmail) {
		return credrepo.findByUserEmail(userEmail);
	}
	
	public Credentials fetchuserIdAndPassword(String userEmail , Integer password) {
		return credrepo.findByUserEmailAndPassword(userEmail, password);
		
	}

}
