package com.cg.kfcbank.service;

import java.util.List;

import com.cg.kfcbank.bean.Bank;
import com.cg.kfcbank.bean.Transaction;
import com.cg.kfcbank.exception.BankException;



public interface IBankService {
	
	public Bank addCustomer(Bank bank);

	public List<Bank> getAllDetails();

	public double showBalance(int accnum);
	
    public Transaction deposit(int accnum,double ammount);
	
	public Transaction withdraw(int accnum,double ammount);
	
	public Bank searchCustomer(int accNum);
	
	public Transaction fundTransfer(int accNum ,int accNum1 ,double amount);
	
	public List<Transaction> getAllTransactions(int accNum);


}
