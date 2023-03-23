package com.dm.bank.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "accountdetails")
public class AccountDetailsModel {
	
	private String id;
	private String User_id;
	private String Name;
	private String Account_number;
	private String Ifsc_number;
	private String Phone_number;
	private String Email;
	private String Adhar;
	
	public AccountDetailsModel () {
		
	}

	public AccountDetailsModel(String id, String user_id, String name, String account_number, String ifsc_number,
			String phone_number, String email, String adhar) {
		super();
		this.id = id;
		User_id = user_id;
		Name = name;
		Account_number = account_number;
		Ifsc_number = ifsc_number;
		Phone_number = phone_number;
		Email = email;
		Adhar = adhar;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_id() {
		return User_id;
	}

	public void setUser_id(String user_id) {
		User_id = user_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAccount_number() {
		return Account_number;
	}

	public void setAccount_number(String account_number) {
		Account_number = account_number;
	}

	public String getIfsc_number() {
		return Ifsc_number;
	}

	public void setIfsc_number(String ifsc_number) {
		Ifsc_number = ifsc_number;
	}

	public String getPhone_number() {
		return Phone_number;
	}

	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAdhar() {
		return Adhar;
	}

	public void setAdhar(String adhar) {
		Adhar = adhar;
	}
	
	

}
