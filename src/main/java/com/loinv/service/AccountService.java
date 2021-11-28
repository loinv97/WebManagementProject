package com.loinv.service;

import java.util.List;

import com.loinv.entity.Account;



public interface AccountService {
	
	Account findById(String username);
	List<Account> getAdministrators();
	List<Account> findAll();
}
