package com.example.hackaton.Presentation.Controller;

import com.example.hackaton.Business.Entity.*;
import com.example.hackaton.Business.Service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Optional;

@RestController
public class OfferController {
    IOfferService offerService;
    IOfferAcceptService offerAcceptService;
    IOrderService orderService;
    IOrderCancelService orderCancelService;
    IOrderFailService orderFailService;
    IOrderFreightReceiveService orderFreightReceiveService;
    IOrderFulfillmentService orderFulfillmentService;
    IDeliveryCompanyService deliveryCompanyService;

    java.util.Date utilDate;

    @Autowired
    public OfferController(IOfferService offerService, IOfferAcceptService offerAcceptService, IOrderService orderService, IOrderCancelService orderCancelService, IOrderFailService orderFailService, IOrderFreightReceiveService orderFreightReceiveService, IOrderFulfillmentService orderFulfillmentService, IDeliveryCompanyService deliveryCompanyService) {
        this.offerService = offerService;
        this.offerAcceptService = offerAcceptService;
        this.orderService = orderService;
        this.orderCancelService = orderCancelService;
        this.orderFailService = orderFailService;
        this.orderFreightReceiveService = orderFreightReceiveService;
        this.orderFulfillmentService = orderFulfillmentService;
        this.deliveryCompanyService = deliveryCompanyService;
        utilDate = new java.util.Date();
    }

    @PostMapping("/api/newoffer")
    public ResponseEntity<Offer> newOffer(@RequestBody Offer offer){
        return ResponseEntity.ok(offerService.save(offer));
    }

    @PostMapping("/api/accept/{id}")
    public ResponseEntity<?> acceptOffer(@PathVariable Long id){
        Optional<Offer> offer = offerService.findById(id);
        if(offer.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Offer not found!");
        } else {
            OfferAccept offerAccept = new OfferAccept(null, offer.get(), new Date(utilDate.getTime()));
            offerAcceptService.save(offerAccept);
            return ResponseEntity.ok(offerAccept);
        }
    }

    @PostMapping("/api/cancel/{id}/{reason}")
    public ResponseEntity<?> cancelOrder(@PathVariable Long id, @PathVariable Integer cancelReason){
        Optional<Order> order = orderService.findById(id);
        if(order.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Order not found!");
        } else {
            OrderCancel orderCancel = new OrderCancel(null, order.get(), cancelReason, new Date(utilDate.getTime()));
            orderCancelService.save(orderCancel);
            return ResponseEntity.ok(orderCancel);
        }
    }

    @PostMapping("/api/fail/{id}/{reason}")
    public ResponseEntity<?> failOrder(@PathVariable Long id, @PathVariable Integer failReason){
        Optional<Order> order = orderService.findById(id);
        if(order.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Order not found!");
        } else {
            OrderFail orderFail = new OrderFail(null, order.get(), failReason, new Date(utilDate.getTime()));
            orderFailService.save(orderFail);
            return ResponseEntity.ok(orderFail);
        }
    }

    @PostMapping("/api/freightreceive/{id}")
    public ResponseEntity<?> freightReceiveOrder(@PathVariable Long id){
        Optional<Order> order = orderService.findById(id);
        if(order.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Order not found!");
        } else {
            OrderFreightReceive orderFreightReceive = new OrderFreightReceive(null, order.get(), new Date(utilDate.getTime()));
            orderFreightReceiveService.save(orderFreightReceive);
            return ResponseEntity.ok(orderFreightReceive);
        }
    }

    @PostMapping("/api/fulfillment/{id}")
    public ResponseEntity<?> fulfillmentOrder(@PathVariable Long id){
        Optional<Order> order = orderService.findById(id);
        if(order.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Order not found!");
        } else {
            OrderFulfillment orderFulfillment = new OrderFulfillment(null, order.get(), new Date(utilDate.getTime()));
            orderFulfillmentService.save(orderFulfillment);
            return ResponseEntity.ok(orderFulfillment);
        }
    }

    @PostMapping("/api/addDeliveryCompany")
    public ResponseEntity<?> addDeliveryCompany(@RequestBody DeliveryCompany deliveryCompany){
        return ResponseEntity.ok(deliveryCompanyService.save(deliveryCompany));
    }

    @GetMapping("/api/offers/{page}/{maxPage}")
    public ResponseEntity<?> getOffers(@PathVariable int page, @PathVariable int pageSize){
        System.out.println("haha");
        return ResponseEntity.ok(offerService.findAll(page, pageSize));
    }
}
