package com.loinv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loinv.entity.Category;



public interface CategoryDAO extends JpaRepository<Category, String>{
}
