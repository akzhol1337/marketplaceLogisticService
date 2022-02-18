package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.DeliveryCompany;
import com.example.hackaton.Business.Service.interfaces.IDeliveryCompanyService;
import com.example.hackaton.Persistance.Repository.DeliveryCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class DeliveryCompanyServiceImpl implements IDeliveryCompanyService {
    DeliveryCompanyRepository repo;

    @Autowired
    public DeliveryCompanyServiceImpl(DeliveryCompanyRepository repo) {
        this.repo = repo;
    }

    @Override
    public DeliveryCompany save(DeliveryCompany deliveryCompany) {
        return repo.save(deliveryCompany);
    }
}
