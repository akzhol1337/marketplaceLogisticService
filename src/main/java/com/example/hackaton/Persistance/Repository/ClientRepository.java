package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    Client save(Client save);
    Client findByName(String name);
}
