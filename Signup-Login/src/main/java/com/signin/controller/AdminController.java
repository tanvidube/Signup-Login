package com.signin.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.signin.entity.Admin;
import com.signin.services.AdminService;


@RestController
public class AdminController {
	
	@Autowired
	private AdminService ads;
	
	@PostMapping("/registeradmin")
	public Admin saveall(@RequestBody Admin admin) {
		return ads.saveadmin(admin);
	}
	
	@GetMapping("/getadmin")
	public  Admin getall(@PathVariable("email") String adminemail){
		return ads.findByAdminEmail(adminemail);
		
	}
	
//	@PutMapping("/update")
//	public Admin updateByAminId(@PathVariable("id") String adminId , @RequestBody Admin admin) {
//	    Admin temp = ads.findById(adminId);
//	    temp.setAdminEmail(admin.getAdminEmail());
//	    temp.setPassword(admin.getPassword());
//	   return ads.saveadmin(temp);
//	    
//	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteByAdminId(@PathVariable("id") String adminId) {
		ads.deleteByAdminId(adminId);
		return "Admin got deleted";
		
	}
	

}
