package com.dm.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserDetails")
public class CustomerModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private String id;
	private String Password;
	public String Name;
	public String Fathers_name;
	public String Mothers_name;
	public String Email;
	public String Aadhar_card;
	public String Birthday;
	public String Gender;
	public String Phone_no;
	public String Address;
	public int approve;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFathers_name() {
		return Fathers_name;
	}
	public void setFathers_name(String fathers_name) {
		Fathers_name = fathers_name;
	}
	public String getMothers_name() {
		return Mothers_name;
	}
	public void setMothers_name(String mothers_name) {
		Mothers_name = mothers_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAadhar_card() {
		return Aadhar_card;
	}
	public void setAadhar_card(String aadhar_card) {
		Aadhar_card = aadhar_card;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getApprove() {
		return approve;
	}
	public void setApprove(int approve) {
		this.approve = approve;
	}
	public CustomerModel(String id, String password, String name, String fathers_name, String mothers_name,
			String email, String aadhar_card, String birthday, String gender, String phone_no, String address,
			int approve) {
		super();
		this.id = id;
		Password = password;
		Name = name;
		Fathers_name = fathers_name;
		Mothers_name = mothers_name;
		Email = email;
		Aadhar_card = aadhar_card;
		Birthday = birthday;
		Gender = gender;
		Phone_no = phone_no;
		Address = address;
		this.approve = approve;
	}
	
	
	
	

}
