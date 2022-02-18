package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.OrderFreightReceive;
import com.example.hackaton.Business.Service.interfaces.IOrderFreightReceiveService;
import com.example.hackaton.Persistance.Repository.OrderFreightReceiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderFreightReceiveServiceImpl implements IOrderFreightReceiveService {
    OrderFreightReceiveRepository repo;

    @Autowired
    public OrderFreightReceiveServiceImpl(OrderFreightReceiveRepository repo) {
        this.repo = repo;
    }

    @Override
    public OrderFreightReceive save(OrderFreightReceive orderFreightReceive) {
        return repo.save(orderFreightReceive);
    }
}
