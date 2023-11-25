package com.apiwork.api.resources;

import com.apiwork.api.model.entities.Customer;
import com.apiwork.api.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerResource {

    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> findClients() {
        List<Customer> customers = customerService.findAll();
        return ResponseEntity.ok().body(customers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> findClient(@PathVariable Long id) {
        Customer customer = customerService.findClients(id);
        return ResponseEntity.ok().body(customer);
    }

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public Customer createClient(@RequestBody Customer customer) {
        return customerService.persistCustomer(customer);
    }
}
