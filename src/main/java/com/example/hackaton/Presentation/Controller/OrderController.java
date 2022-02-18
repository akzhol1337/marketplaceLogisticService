package com.example.hackaton.Presentation.Controller;

import com.example.hackaton.Business.Entity.Order;
import com.example.hackaton.Business.Service.interfaces.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    IOrderService service;

    @Autowired
    public OrderController(IOrderService service) {
        this.service = service;
    }

    @PostMapping("/api/neworder")
    public ResponseEntity<Order> newOrder(@RequestBody Order order){
        return ResponseEntity.ok(service.save(order));
    }

    @GetMapping("/api/orders/{page}/{maxPage}")
    public ResponseEntity<?> getOrders(@PathVariable Integer page, @PathVariable Integer pageSize){
        return ResponseEntity.ok(service.findAll(page, pageSize));
    }
}
