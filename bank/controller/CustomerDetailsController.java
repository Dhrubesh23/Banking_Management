package com.dm.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dm.bank.entity.CustomerModel;
import com.dm.bank.service.CustomerDetailsService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class CustomerDetailsController {
	
	@Autowired
	CustomerDetailsService customerDetailsService;
	
	@GetMapping
	public List<CustomerModel> getAll() {
		return customerDetailsService.getClass();
	}
	
	public String createUser(@PathVariable ("id") String id) {
		return customerDetailsService.approved(id);
	}

}
