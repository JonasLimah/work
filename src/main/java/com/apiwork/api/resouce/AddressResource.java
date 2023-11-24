package com.apiwork.api.resouce;

import com.apiwork.api.enteties.Address;
import com.apiwork.api.enteties.Client;
import com.apiwork.api.enteties.Contact;
import com.apiwork.api.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressResource {
    @Autowired
    private AddressService service;

    @GetMapping
    public ResponseEntity<List<Address>> findAddresses(){
        List<Address> addresses = service.findAll();
        return ResponseEntity.ok().body(addresses);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> findAddress(@PathVariable Long id){
        Address address = service.findAddress(id);
        return ResponseEntity.ok().body(address);
    }
    @PostMapping(
            value = "/create", consumes = "application/json", produces = "application/json")
    public Address createAddress(@RequestBody Address address) {
        return service.postAddress(address);
    }

}
