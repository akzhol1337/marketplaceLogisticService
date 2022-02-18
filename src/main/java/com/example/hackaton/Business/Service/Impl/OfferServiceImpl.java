package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.Offer;
import com.example.hackaton.Business.Entity.Order;
import com.example.hackaton.Business.Service.interfaces.IOfferService;
import com.example.hackaton.Business.Service.interfaces.IOrderService;
import com.example.hackaton.Persistance.Repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Service
public class OfferServiceImpl implements IOfferService {

    OfferRepository repo;

    @Autowired
    public OfferServiceImpl(OfferRepository repo) {
        this.repo = repo;
    }

    @Override
    public Offer save(Offer offer) {
        return repo.save(offer);
    }

    @Override
    public Optional<Offer> findById(Long id) {
        return repo.findById(id);
    }
    @Override
    public Page<Offer> findAll(Integer page, Integer size) {
        return repo.findAll(PageRequest.of(page, size));
    }
}
