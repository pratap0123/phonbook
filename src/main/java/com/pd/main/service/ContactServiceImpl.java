package com.pd.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.main.dao.ContactRepository;
import com.pd.main.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public String saveContact(Contact contact) {
		Contact save = repo.save(contact);
		if (save.getContactId() != null) {
			return "Contact Saved";
		} else {
			return "Contact Not Saved";
		}
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> contact = repo.findById(contactId);
		if (contact.isPresent()) {
			return contact.get();
		} else {
			return null;
		}
	}

	@Override
	public String updateContact(Contact contact) {

		if (repo.existsById(contact.getContactId())) {
			contact = repo.save(contact);
			return "Updated Successfully";
		} else {

			return "No Record Found";
		}

	}

	@Override
	public String deleteContactById(Integer contactId) {

		if (repo.existsById(contactId)) {

			repo.deleteById(contactId);
			return " Record Deleted";
		} else {
			return "No Record Found";

		}
	}
}
