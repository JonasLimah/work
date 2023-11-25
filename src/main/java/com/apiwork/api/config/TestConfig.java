package com.apiwork.api.config;


import com.apiwork.api.enteties.Client;
import com.apiwork.api.enteties.Contact;
import com.apiwork.api.repository.ClientRepository;
import com.apiwork.api.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    ContactRepository contactRepository;



    public void run(String... args) throws Exception {

    }
}
