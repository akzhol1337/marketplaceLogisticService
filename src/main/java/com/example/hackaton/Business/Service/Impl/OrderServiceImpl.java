package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.Order;
import com.example.hackaton.Business.Service.interfaces.IOrderService;
import com.example.hackaton.Persistance.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService {
    OrderRepository repo;

    @Autowired
    public OrderServiceImpl(OrderRepository repo) {
        this.repo = repo;
    }

    @Override
    public Order save(Order order) {
        return repo.save(order);
    }

    @Override
    public Optional<Order> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Page<Order> findAll(Integer page, Integer size) {
        return repo.findAll(PageRequest.of(page, size));
    }
}
