package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.OrderFulfillment;
import com.example.hackaton.Business.Service.interfaces.IOrderFulfillmentService;
import com.example.hackaton.Persistance.Repository.OrderFulfillmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderFulfillmentServiceImpl implements IOrderFulfillmentService {
    OrderFulfillmentRepository repo;

    @Autowired
    public OrderFulfillmentServiceImpl(OrderFulfillmentRepository repo) {
        this.repo = repo;
    }

    @Override
    public OrderFulfillment save(OrderFulfillment orderFulfillment) {
        return repo.save(orderFulfillment);
    }
}
