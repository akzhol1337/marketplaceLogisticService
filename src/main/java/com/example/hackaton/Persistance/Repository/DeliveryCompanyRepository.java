package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.DeliveryCompany;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryCompanyRepository extends CrudRepository<DeliveryCompany, Long> {
    DeliveryCompany save(DeliveryCompany deliveryCompany);
}
