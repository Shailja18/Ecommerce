package com.luv2code.spring_boot_ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.luv2code.spring_boot_ecommerce.entity.ProductCategory;


//Name of JSON entry collection resourcerel  and path showing from path=" "
@CrossOrigin
@RepositoryRestResource(collectionResourceRel ="productcategory" ,path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long>{

	
}
