package com.example.billingservice;

import com.example.billingservice.Feign.CustomerRestClient;
import com.example.billingservice.Feign.ProductItemRestClient;
import com.example.billingservice.model.Customer;
import com.example.billingservice.repository.BillRepository;
import com.example.billingservice.repository.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class BillingServiceApplication {
@Autowired
    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }


@Bean

 CommandLineRunner start(

            BillRepository billRepository,
       ProductItemRepository productItemRepository,
       CustomerRestClient customerRestClient,
       ProductItemRestClient productItemRestClient

    ){

        return args -> {

            Customer customer  =customerRestClient.getCustomerById(1l);
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            System.out.println(customer.getEmail());

        };
    }
}
