package com.apiwork.api.resouce;

import com.apiwork.api.enteties.Client;
import com.apiwork.api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
    @Autowired
    private ClientService clientService;
    @GetMapping
    public ResponseEntity<List<Client>> findClient(){
        List<Client> list = clientService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findClient(@PathVariable Long id){
        Client user = clientService.findClient(id);
        return ResponseEntity.ok().body(user);
    }
}
