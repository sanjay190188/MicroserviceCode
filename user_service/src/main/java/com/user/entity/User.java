package com.user.entity;

import java.util.List;

public class User {
	private Long userId;
	private String firstName;
	private String LastName;
	private List<Contact> contacts;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public User(Long userId, String firstName, String lastName, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		LastName = lastName;
		this.contacts = contacts;
	}
	public User(Long userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		LastName = lastName;
	}
	
	
	
	
}
