package com.loinv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loinv.dao.ProductDAO;
import com.loinv.entity.Product;
import com.loinv.service.ProductService;



@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO pdao;

	@Override
	public List<Product> findAll() {
		
		return pdao.findAll();
	}

	@Override
	public Product findById(Integer id) {
		
		return pdao.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		return pdao.findByCategoryId(cid);
	}

	@Override
	public Product create(Product p) {
		return pdao.save(p);
	}

	@Override
	public Product update(Product p) {
		return pdao.save(p);
	}

	@Override
	public void delete(Integer id) {
		pdao.deleteById(id);
	}
	
	
}
