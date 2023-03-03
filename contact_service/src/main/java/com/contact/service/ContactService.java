package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactService {
	private List<Contact> contactList = List.of(
			new Contact(11L, "1234567890", "sanj@gmail.com", 1L),
			new Contact(22L, "2323232323", "Vijay@gmail.com", 2L)
			);
	
	public List<Contact> getContact(Long userId) {
		return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
}
