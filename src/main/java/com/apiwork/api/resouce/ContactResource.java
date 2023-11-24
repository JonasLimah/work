package com.apiwork.api.resouce;

import com.apiwork.api.enteties.Address;
import com.apiwork.api.enteties.Client;
import com.apiwork.api.enteties.Contact;
import com.apiwork.api.service.AddressService;
import com.apiwork.api.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/contacts")
public class ContactResource {
    @Autowired
    private ContactService service;

    @GetMapping
    public ResponseEntity<List<Contact>> findContacts(){
        List<Contact> contact = service.findAll();
        return ResponseEntity.ok().body(contact);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Contact> findContact(@PathVariable Long id){
        Contact contact = service.findContact(id);
        return ResponseEntity.ok().body(contact);
    }
    @PostMapping(
            value = "/create", consumes = "application/json", produces = "application/json")
    public Contact createContact(@RequestBody Contact contact) {
        return service.postContact(contact);
    }

}
