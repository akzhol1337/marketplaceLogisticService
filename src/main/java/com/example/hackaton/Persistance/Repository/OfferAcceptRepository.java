package com.example.hackaton.Persistance.Repository;

import com.example.hackaton.Business.Entity.OfferAccept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferAcceptRepository extends CrudRepository<OfferAccept, Long> {
    OfferAccept save(OfferAccept offer);

}
