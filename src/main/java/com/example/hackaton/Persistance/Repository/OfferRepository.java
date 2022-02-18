package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.Offer;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


@Repository
public interface OfferRepository extends CrudRepository<Offer, Long> {
    Offer save(Offer offer);
    Page<Offer> findAll(Pageable pageable);
}
