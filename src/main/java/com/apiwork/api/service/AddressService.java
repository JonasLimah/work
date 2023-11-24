package com.apiwork.api.service;


import com.apiwork.api.enteties.Address;

import com.apiwork.api.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    private AddressRepository repository;

    public List<Address> findAll(){
        return repository.findAll();
    }
    public Address findAddress(Long id){
        Optional<Address> obj = repository.findById(id);
        return obj.get();
    }
    public Address postAddress (Address obj){
        return repository.save(obj);
    }
}
