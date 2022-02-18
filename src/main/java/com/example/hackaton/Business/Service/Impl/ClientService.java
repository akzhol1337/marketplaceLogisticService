package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.Client;
import com.example.hackaton.Business.Service.interfaces.IClientService;
import com.example.hackaton.Persistance.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService {
    ClientRepository repo;

    @Autowired
    public ClientService(ClientRepository repo) {
        this.repo = repo;
    }

    @Override
    public Client save(Client client) {
        return repo.save(client);
    }
}
