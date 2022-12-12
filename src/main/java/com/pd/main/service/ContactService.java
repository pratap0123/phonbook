package com.pd.main.service;

import java.util.List;

import com.pd.main.entity.Contact;

public interface ContactService {

	public String saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(Integer contactId);

	public String updateContact(Contact contact);

	public String deleteContactById(Integer contactId);
}
