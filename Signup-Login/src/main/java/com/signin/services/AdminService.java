package com.signin.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signin.Repository.AdminRepo;
import com.signin.entity.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo adr;
	
	public Admin saveadmin(Admin admin) {
		return adr.insert(admin);
		
	}
	
	public Admin findByAdminEmail(String adminEmail) {
		return adr.findByAdminEmail(adminEmail);
	}
	
	public Admin findById(String adminId) {
		return adr.findById(adminId).get();
		 
	}
	
//	public Admin updateByAdminId(String adminId) {
//		return adr.updateByAdminId(adminId);
//	}
	
	public void deleteByAdminId(String adminId) {
		 adr.deleteByAdminId(adminId);
	}

	

}
