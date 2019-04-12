package com.cg.kfcbank.bean;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import oracle.sql.DATE;

@Entity
@Table(name="transactions")
public class Transaction 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int transactionid;
	private int accountnumber;
	private double amount;
	private double balance;
	private Date dateoftransaction;
	private LocalTime timeoftransaction;
	private String type;
	
	
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public Date getDateoftransaction() {
		return dateoftransaction;
	}
	public void setDateoftransaction(Date date) {
		this.dateoftransaction = date;
	}
	public LocalTime getTimeoftransaction() {
		return timeoftransaction;
	}
	public void setTimeoftransaction(LocalTime timeoftransaction) {
		this.timeoftransaction = timeoftransaction;
	}

	
	

}
