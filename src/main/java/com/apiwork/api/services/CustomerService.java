package com.apiwork.api.services;

import com.apiwork.api.model.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    Customer findClients(Long id);

    Customer persistCustomer(Customer customer);
}
