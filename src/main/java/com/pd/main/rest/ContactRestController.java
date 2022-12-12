package com.pd.main.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pd.main.entity.Contact;
import com.pd.main.service.ContactService;

@RestController
@RequestMapping("/")
public class ContactRestController {

	@Autowired
	private ContactService service;

	@PostMapping("/contact")
	public String createContact(@RequestBody Contact Contact) {
		String status = service.saveContact(Contact);

		return status;

	}

	@GetMapping("/contacts")
	public List<Contact> getAllContacts() {
		return service.getAllContacts();

	}

	@GetMapping("/contact/{contactId}")
	public Contact getContactById(@PathVariable("contactId") Integer contactId) {
		return service.getContactById(contactId);

	}

	@PutMapping("/contact")
	public String upadteContactById(@RequestBody Contact Contact) {
		return service.updateContact(Contact);

	}

	@DeleteMapping("/contact/{contactId}")
	public String deleteContactById(@PathVariable("contactId") Integer contactId) {
		return service.deleteContactById(contactId);

	}

}
