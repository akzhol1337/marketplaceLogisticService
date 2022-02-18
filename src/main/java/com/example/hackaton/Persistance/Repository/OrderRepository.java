package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.Offer;
import com.example.hackaton.Business.Entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    Order save(Order order);
    Optional<Order> findById(Long id);
    Page<Order> findAll(Pageable pageable);
}

