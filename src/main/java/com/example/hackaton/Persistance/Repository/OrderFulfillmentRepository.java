package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.OrderFulfillment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderFulfillmentRepository extends CrudRepository<OrderFulfillment, Long> {
    OrderFulfillment save(OrderFulfillment orderFulfillment);
}
