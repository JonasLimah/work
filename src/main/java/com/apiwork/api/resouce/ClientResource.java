package com.apiwork.api.resouce;

import com.apiwork.api.enteties.Client;
import com.apiwork.api.enteties.Contact;
import com.apiwork.api.service.ClientService;
import com.apiwork.api.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<List<Client>> findClients(){
        List<Client> clients = service.findAll();
        return ResponseEntity.ok().body(clients);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findClient(@PathVariable Long id){
        Client client = service.findClients(id);
        return ResponseEntity.ok().body(client);
    }
    @PostMapping(
            value = "/create", consumes = "application/json", produces = "application/json")
    public Client createClient(@RequestBody Client client) {
        return service.postClient(client);
    }


}
