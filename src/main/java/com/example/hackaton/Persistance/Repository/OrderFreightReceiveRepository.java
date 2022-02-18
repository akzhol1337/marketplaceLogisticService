package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.OrderFreightReceive;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderFreightReceiveRepository extends CrudRepository<OrderFreightReceive, Long> {
    OrderFreightReceive save(OrderFreightReceive orderFreightReceive);
}
