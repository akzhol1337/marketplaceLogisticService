package com.example.hackaton.Business.Service.interfaces;

import com.example.hackaton.Business.Entity.Offer;
import com.example.hackaton.Business.Entity.Order;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface IOrderService {
    Order save(Order order);
    Optional<Order> findById(Long id);
    Page<Order> findAll(Integer page, Integer size);
}
