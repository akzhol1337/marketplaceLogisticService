package com.example.hackaton.Presentation.Controller;

import com.example.hackaton.Business.Entity.Client;
import com.example.hackaton.Business.Service.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    IClientService clientService;

    @Autowired
    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/api/addClient")
    public ResponseEntity<?> addClient(@RequestBody Client client){
        return ResponseEntity.ok(clientService.save(client));
    }
}
