package com.contact.entity;

public class Contact {
	private Long contactId;
	private String phoneNumber;
	private String emailId;
	private Long userId;
	
	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Contact(Long contactId, String phoneNumber, String emailId, Long userId) {
		super();
		this.contactId = contactId;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.userId = userId;
	}
	
	
	
}
