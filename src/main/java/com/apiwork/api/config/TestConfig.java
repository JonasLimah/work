package com.apiwork.api.config;

import com.apiwork.api.enteties.Client;
import com.apiwork.api.repository.ClientRepository;
import com.apiwork.api.repository.ItemRepository;
import com.apiwork.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private OrderRepository  orderRepository;
    @Autowired
    private ItemRepository itemRepository;

    public void run(String... args) throws Exception {
        Client client = new Client("jonas");
        clientRepository.saveAll(Arrays.asList(client));
    }
}
