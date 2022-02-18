package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.OrderCancel;
import com.example.hackaton.Business.Service.interfaces.IOrderCancelService;
import com.example.hackaton.Persistance.Repository.OrderCancelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderCancelServiceImpl implements IOrderCancelService {
    OrderCancelRepository repo;

    @Autowired
    public OrderCancelServiceImpl(OrderCancelRepository repo) {
        this.repo = repo;
    }

    @Override
    public OrderCancel save(OrderCancel orderCancel) {
        return repo.save(orderCancel);
    }
}
