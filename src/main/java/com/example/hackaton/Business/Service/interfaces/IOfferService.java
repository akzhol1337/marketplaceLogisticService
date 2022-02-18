package com.example.hackaton.Business.Service.interfaces;

import com.example.hackaton.Business.Entity.Offer;
import org.springframework.data.domain.Page;
import java.util.Optional;

public interface IOfferService {
    Offer save(Offer offer);
    Optional<Offer> findById(Long id);
    Page<Offer> findAll(Integer page, Integer size);
}
