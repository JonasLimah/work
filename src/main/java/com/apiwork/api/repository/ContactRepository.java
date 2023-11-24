package com.apiwork.api.repository;

import com.apiwork.api.enteties.Address;
import com.apiwork.api.enteties.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
