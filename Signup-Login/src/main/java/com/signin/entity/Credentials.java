package com.signin.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UserCredentials")
public class Credentials {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String UserId;
	private String UserEmail;
	private Integer password;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public Credentials(String userId, String userEmail, Integer password) {
		super();
		UserId = userId;
		UserEmail = userEmail;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserEmail=" + UserEmail + ", password=" + password + "]";
	}
	
	
	

}
