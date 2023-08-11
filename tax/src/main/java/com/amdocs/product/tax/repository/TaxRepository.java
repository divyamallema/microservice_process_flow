package com.amdocs.product.tax.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.product.tax.model.Tax;  

@Repository
public interface TaxRepository extends CrudRepository<Tax, Double>  {
	
}
