package com.cg.kfcbank.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.kfcbank.bean.Bank;
import com.cg.kfcbank.bean.Transaction;
import com.cg.kfcbank.dao.IBankDao;
import com.cg.kfcbank.exception.BankException;

@Service
@Transactional
public class BankServiceImpl implements IBankService {

	@Autowired
	private IBankDao bankdao ;
	
	public IBankDao getBankdao() {
		return bankdao;
	}

	public void setBankdao(IBankDao bankdao) {
		this.bankdao = bankdao;
	}

	
	
	@Override
	public Bank addCustomer(Bank bank) 
	{
		// TODO Auto-generated method stub
		
			return bankdao.addCustomer(bank);
		
		
			
		}
	

	@Override
	public List<Bank> getAllDetails() {
		// TODO Auto-generated method stub
	
		return bankdao.getAllDetails();
	}
	@Override
	public double showBalance(int accnum)
	{
		return bankdao.showBalance(accnum);

	}

	@Override
	public Transaction deposit(int accnum, double ammount) {
		// TODO Auto-generated method stub
		return bankdao.deposit(accnum, ammount);
	}

	@Override
	public Transaction withdraw(int accnum, double ammount) {
		// TODO Auto-generated method stub
		return bankdao.withdraw(accnum, ammount);
	}

	@Override
	public Bank searchCustomer(int accNum) {
		// TODO Auto-generated method stub
		return bankdao.searchCustomer(accNum);
	}

	@Override
	public Transaction fundTransfer(int accNum, int accNum1, double amount) {
		// TODO Auto-generated method stub
		return bankdao.fundTransfer(accNum, accNum1, amount);
	}

	@Override
	public List<Transaction> getAllTransactions(int accNum) {
		// TODO Auto-generated method stub
		return bankdao.getAllTransactions(accNum);
	}

}
