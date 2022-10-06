package com.signin.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.signin.entity.Admin;

@Repository
public interface AdminRepo extends MongoRepository<Admin, String> {
	
	public Admin findByAdminEmail(String adminEmail);
	public void deleteByAdminId(String adminId);
   // public Admin updateByAdminId(String adminId);
}
