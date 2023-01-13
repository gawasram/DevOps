package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	List<Contact> list = List.of(
				new Contact(2001L, "rahul@gmail.com" , "Rahul", 1001L),
				new Contact(2002L, "rahul@hotmail.com" , "Rahul", 1001L),
				new Contact(2003L, "rahul@protonmail.com" , "Rahul", 1001L),
				
				new Contact(2004L, "aviraj@gmail.com" , "Aviraj", 1002L),
				new Contact(2005L, "aviraj@hotmail.com" , "Aviraj", 1002L),
				
				new Contact(2006L, "pratik@hotmail.com" , "Pratik", 1003L),
				
				new Contact(2007L, "bhushan@hotmail.com" , "Bhushan", 1004L)
			);
	
	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
}
