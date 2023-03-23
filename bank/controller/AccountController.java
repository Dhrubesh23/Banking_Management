package com.dm.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dm.bank.service.AccountService;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class AccountController {
	
	@Autowired
	AccountService service;
	
	public String createAccount(@PathVariable("id") String id) {
		return service.createAccount(id);
	}

}
