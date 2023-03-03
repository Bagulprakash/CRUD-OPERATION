package com.prakash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
