package com.apiwork.api.services;

import com.apiwork.api.model.entities.Address;

import java.util.List;

public interface AddressService {

    List<Address> findAll();

    Address findAddress(Long id);

    Address persistAddress(Address obj);
}
