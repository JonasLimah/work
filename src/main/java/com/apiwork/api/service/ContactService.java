package com.apiwork.api.service;


import com.apiwork.api.enteties.Address;
import com.apiwork.api.enteties.Client;
import com.apiwork.api.enteties.Contact;
import com.apiwork.api.repository.AddressRepository;
import com.apiwork.api.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;

    public List<Contact> findAll(){
        return repository.findAll();
    }
    public Contact findContact(Long id){
        Optional<Contact> obj = repository.findById(id);
        return obj.get();
    }
    public Contact postContact (Contact obj){
        return repository.save(obj);
    }

}
