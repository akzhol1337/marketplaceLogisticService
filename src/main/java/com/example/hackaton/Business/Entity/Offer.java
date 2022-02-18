package com.example.hackaton.Business.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Offer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name="deliveryCompanyId")
    private DeliveryCompany deliverCompany;
    private Double offeredPriceTenge;
    private Date date;
    @ManyToOne
    @JoinColumn(name="orderId")
    private Order orderId;
}
