package com.example.hackaton.Business.Service.Impl;

import com.example.hackaton.Business.Entity.OfferAccept;
import com.example.hackaton.Business.Service.interfaces.IOfferAcceptService;
import com.example.hackaton.Persistance.Repository.OfferAcceptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OfferAcceptServiceImpl implements IOfferAcceptService {
    OfferAcceptRepository repo;

    @Autowired
    public OfferAcceptServiceImpl(OfferAcceptRepository repo) {
        this.repo = repo;
    }

    @Override
    public OfferAccept save(OfferAccept offerAccept) {
        return repo.save(offerAccept);
    }
}
