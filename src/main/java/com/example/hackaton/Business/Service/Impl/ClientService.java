package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.Client;
import com.example.hackaton.Business.Service.interfaces.IClientService;
import com.example.hackaton.Persistance.Repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service @Slf4j
public class ClientService implements IClientService, UserDetailsService {
    ClientRepository repo;

    @Autowired
    public ClientService(ClientRepository repo) {
        this.repo = repo;
    }

    @Override
    public Client save(Client client) {
        return repo.save(client);
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Client user = repo.findByName(name);
        if(user == null) {
            log.error("User not found!");
            throw new UsernameNotFoundException("User not found!");
        } else {
            log.info("User found in the database: {}", name);
        }

        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(role -> {authorities.add(new SimpleGrantedAuthority(role.getName()));});
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), authorities);
    }
}
