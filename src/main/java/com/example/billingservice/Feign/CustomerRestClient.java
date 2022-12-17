package com.example.billingservice.Feign;


import com.example.billingservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CUSTOMER-SERVICE")
@EnableJpaRepositories
public interface CustomerRestClient {

    @GetMapping(path = "/customers/{id}")
    public Customer getCustomerById(@PathVariable(name = "id") Long id);

}
