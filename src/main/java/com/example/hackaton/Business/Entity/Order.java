package com.example.hackaton.Business.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name="clientId")
    private Client client;
    private Long fromLocationId;
    private Long toLocationId;
    private double weightKg;
    private double expectingPriceTenge;
    private Date expectingDeliveryDate;
    private Date date;

}
