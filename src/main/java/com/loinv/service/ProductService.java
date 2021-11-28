package com.loinv.service;

import java.util.List;

import com.loinv.entity.Product;




public interface ProductService {

	List<Product> findAll();

	Product findById(Integer id);

	List<Product> findByCategoryId(String cid);

	Product create(Product p);

	Product update(Product p);

	void delete(Integer id);

}
