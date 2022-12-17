package com.example.billingservice.Feign;


import com.example.billingservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.QueryParam;
@EnableJpaRepositories

@FeignClient(name = "INVENTORY-SERVICE")

public interface ProductItemRestClient {
@GetMapping(path = "/products")
    PagedModel<Product> pageProducts(
            @QueryParam(value = "page") int page,

            @QueryParam(value = "size") int size);

@GetMapping(path = "/products/{id}")
    Product getProductById(@PathVariable Long id );
}
