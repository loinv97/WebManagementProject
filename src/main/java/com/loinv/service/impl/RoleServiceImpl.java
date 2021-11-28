package com.loinv.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loinv.dao.RoleDAO;
import com.loinv.entity.Role;
import com.loinv.service.RoleService;



@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDAO rdao;
	
	@Override
	public List<Role> findAll() {
		return rdao.findAll(); 
	}

}
