package com.amdocs.product.catalog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.product.catalog.model.Product;  

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>  
{  
}  