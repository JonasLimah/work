package com.apiwork.api.resources;

import com.apiwork.api.model.entities.Address;
import com.apiwork.api.services.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/addresses")
public class AddressResource {

    private final AddressService addressService;

    public AddressResource(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping
    public ResponseEntity<List<Address>> findAddresses() {
        List<Address> addresses = addressService.findAll();
        return ResponseEntity.ok().body(addresses);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Address> findAddress(@PathVariable Long id) {
        Address address = addressService.findAddress(id);
        return ResponseEntity.ok().body(address);
    }

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public Address createAddress(@RequestBody Address address) {
        return addressService.persistAddress(address);
    }
}
