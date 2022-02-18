package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.OrderFail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderFailRepository extends CrudRepository<OrderFail, Long> {
    OrderFail save(OrderFail orderFail);
}
