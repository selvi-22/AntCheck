package com.example.AprilDemoMaven.model;

public class User {
	private String name;
	private Integer phoneNo;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {

	}

	public User(String name, Integer phoneNo, String email) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}

}
