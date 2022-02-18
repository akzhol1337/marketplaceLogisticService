package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.OrderCancel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderCancelRepository extends CrudRepository<OrderCancel, Long> {
    OrderCancel save(OrderCancel orderCancel);
}
