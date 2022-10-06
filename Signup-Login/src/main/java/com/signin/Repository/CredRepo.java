package com.signin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.signin.entity.Credentials;

@Repository
public interface CredRepo extends MongoRepository<Credentials, String> {
	
	public Credentials findByUserEmail(String userEmail);
	public Credentials findByUserEmailAndPassword(String userEmail , Integer password);

}
