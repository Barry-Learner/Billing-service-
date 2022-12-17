package com.example.billingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Product {
    @Id
    private  Long id ;
    private  String name ;
    private  double price ;
    private double quantity;
}
