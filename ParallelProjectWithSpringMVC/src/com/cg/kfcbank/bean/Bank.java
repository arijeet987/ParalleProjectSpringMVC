package com.cg.kfcbank.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="accounts")
public class Bank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int accountNumber;
	
	@NotEmpty(message="Please Enter Name")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "account holdername must contain only alphabets")
	private String accountHolderName;
	

	@NotEmpty(message="Please Enter Address")
	private String Address;
	
	@NotEmpty(message="Please Enter Contact Number")
	@Pattern(regexp = "(91|0)?[6-9][0-9]{9}",message = "contact number should not exceeds 10 digit")
	private String contactNumber;
	
	//@NotEmpty(message="Please Enter Contact Number")
	//@Pattern(regexp ="[0-9]*\\.?[0-9]*")
	private double balance;
	
	@NotEmpty(message="Please Enter EmailId")
	@Pattern(regexp = "[a-zA-Z0-9]+[@][a-zA-Z0-9]+([.][a-zA-Z]+)+",message = "please enter valid email id")
	private String email;
	
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", Address="
				+ Address + ", contactNumber=" + contactNumber + ", balance=" + balance + ", email=" + email + "]";
	}

}
