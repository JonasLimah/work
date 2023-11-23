package com.apiwork.api.service;


import com.apiwork.api.enteties.Client;
import com.apiwork.api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;

    public List<Client> findAll(){
        return repository.findAll();
    }
    public Client findClient(Long id){
        Optional<Client> obj = repository.findById(id);
        return obj.get();
    }
}