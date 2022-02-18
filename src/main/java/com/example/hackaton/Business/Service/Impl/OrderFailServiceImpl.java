package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.OrderFail;
import com.example.hackaton.Business.Service.interfaces.IOrderFailService;
import com.example.hackaton.Persistance.Repository.OrderFailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderFailServiceImpl implements IOrderFailService {
    OrderFailRepository repo;

    @Autowired
    public OrderFailServiceImpl(OrderFailRepository repo) {
        this.repo = repo;
    }

    @Override
    public OrderFail save(OrderFail orderFail) {
        return repo.save(orderFail);
    }
}
