package com.example.billingservice.repository;

import com.example.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



import java.util.List;
@EnableJpaRepositories
@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
       List<ProductItem> findByBillId(Long billID);

}
