package com.example.billingservice.entities;

import com.example.billingservice.model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

/**
 *
 */


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public
class ProductItem{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private long productID;
        private double price; private double quantity;
        @ManyToOne
        private Bill bill;
        @Transient
        private Product product;
}


