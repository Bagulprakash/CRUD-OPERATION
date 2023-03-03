package com.prakash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakash.entity.Contact;
import com.prakash.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;

	@Override
	public String upsert(Contact contact) {
		Contact save = repo.save(contact);
		return "Success";
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contact getContact(int cid) {
		Optional<Contact> findById = repo.findById(cid);
		if (findById.isPresent()) {

			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int cid) {
		// repo.deleteById(cid);      //Hard Delete
		Optional<Contact> findById = repo.findById(cid);
		if (findById.isPresent()) {
			Contact contact = findById.get();  // Soft Delete
			contact.setActiveSW("N");
			repo.save(contact);

		}

		return "Success";
	}

}
