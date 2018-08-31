package com.qa.indivbankingproject.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class Accounts {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "Account_number")
	private String accountNumber;
	@Column(name = "First_name")
	private String firstName;
	@Column(name = "Surname")
	private String surname;
	
	public Accounts() {}
	
	public Accounts(String accountNumber, String firstName, String surname) {
		this.accountNumber = accountNumber;
		this.firstName = firstName;
		this.surname = surname;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
