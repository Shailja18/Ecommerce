package com.luv2code.spring_boot_ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.luv2code.spring_boot_ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel ="products" ,path="products")
public interface ProductRepository extends JpaRepository<Product,Long>
{

}
