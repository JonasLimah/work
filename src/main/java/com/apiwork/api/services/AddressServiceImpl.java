package com.apiwork.api.services;

import com.apiwork.api.model.entities.Address;
import com.apiwork.api.repositories.AddressRepository;
import jakarta.persistence.NoResultException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository repository;

    public AddressServiceImpl(AddressRepository repository) {
        this.repository = repository;
    }

    public List<Address> findAll() {
        return repository.findAll();
    }

    public Address findAddress(Long id) {
        return repository.findById(id).orElseThrow(NoResultException::new);
    }

    public Address persistAddress(Address obj) {
        return repository.save(obj);
    }
}
