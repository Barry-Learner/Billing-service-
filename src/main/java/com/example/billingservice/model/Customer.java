package com.example.billingservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Customer {
@Id
private Long id;
private String name ;
private  String email;



}
