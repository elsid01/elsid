package com.models;

public class UsersProfile {
	//Field
	private int UserId;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	
	//Constructors
	public UsersProfile() {
		super();
		
	}

	public UsersProfile(int userId, String firstName, String lastName, String email, String userName, String password) {
		super();
		UserId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	//Getters and Setters
	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//Maybe some other Method
	
	
	

	
	
}
