package com.apiwork.api.services;

import com.apiwork.api.model.entities.Customer;
import com.apiwork.api.repositories.CustomerRepository;
import jakarta.persistence.NoResultException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findClients(Long id) {
        return customerRepository.findById(id).orElseThrow(NoResultException::new);
    }

    public Customer persistCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
