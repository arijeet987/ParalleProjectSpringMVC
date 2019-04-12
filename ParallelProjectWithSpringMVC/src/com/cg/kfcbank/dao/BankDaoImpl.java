package com.cg.kfcbank.dao;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.kfcbank.bean.Bank;
import com.cg.kfcbank.bean.Transaction;


@Repository
public class BankDaoImpl implements IBankDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Bank addCustomer(Bank bank)  {

	
			entityManager.persist(bank);
			entityManager.flush();
			return bank;

	}

	@Override
	public List<Bank> getAllDetails() {

		TypedQuery<Bank> query = entityManager.createQuery("SELECT b FROM Bank b", Bank.class);

		return query.getResultList();
	}

	@Override
	public double showBalance(int accnum) {
		Bank bank = entityManager.find(Bank.class, accnum);
		if (bank != null)
			return bank.getBalance();
		else
			return 0.0;

	}

	@Override
	public Transaction deposit(int accnum, double ammount) {

		Transaction transaction = null;
		Bank bank = entityManager.find(Bank.class, accnum);
		if (bank != null) 
		{
			double balance = bank.getBalance();
			balance = balance + ammount;
			bank.setBalance(balance);

			transaction = new Transaction();
			transaction.setAccountnumber(accnum);
			transaction.setAmount(ammount);
			transaction.setBalance(balance);
			transaction.setDateoftransaction(Date.valueOf(LocalDate.now()));
			transaction.setTimeoftransaction(LocalTime.now());
			transaction.setType("credited");

			entityManager.persist(transaction);
		}

		return transaction;

	}

	@Override
	public Transaction withdraw(int accnum, double ammount) {
		Transaction transaction = null;
		Bank bank = entityManager.find(Bank.class, accnum);
		if (bank != null) {
			double balance = bank.getBalance();
			balance = balance - ammount;
			if (balance > 0) {
				bank.setBalance(balance);
				transaction = new Transaction();
				transaction.setAccountnumber(accnum);
				transaction.setAmount(ammount);
				transaction.setBalance(balance);
				transaction.setDateoftransaction(Date.valueOf(LocalDate.now()));
				transaction.setTimeoftransaction(LocalTime.now());
				transaction.setType("debited");
				entityManager.persist(transaction);
			}

		}
		return transaction;
	}

	@Override
	public Bank searchCustomer(int accNum) {
		Bank bank = entityManager.find(Bank.class, accNum);

		return bank;

	}

	@Override
	public Transaction fundTransfer(int accNum, int accNum1, double amount) {

		Transaction transaction = null;
		Transaction transaction1 = null;
		Bank bank = entityManager.find(Bank.class, accNum);

		Bank bank1 = entityManager.find(Bank.class, accNum1);
		if (bank1 != null && bank != null) {
			double bal = bank.getBalance() - amount;
			if (bal > 0) {
				bank.setBalance(bal);
				bank1.setBalance(bank1.getBalance() + amount);

				transaction = new Transaction();
				transaction.setAccountnumber(accNum);
				transaction.setBalance(bal);
				transaction.setAmount(amount);
				transaction.setDateoftransaction(Date.valueOf(LocalDate.now()));
				transaction.setTimeoftransaction(LocalTime.now());
				transaction.setType("debited");
				entityManager.persist(transaction);
				
				transaction1 = new Transaction();
				transaction1.setAccountnumber(accNum1);
				transaction1.setBalance(bank1.getBalance());
				transaction1.setAmount(amount);
				transaction1.setDateoftransaction(Date.valueOf(LocalDate.now()));
				transaction1.setTimeoftransaction(LocalTime.now());
				transaction1.setType("credited");
				entityManager.persist(transaction1);
				

			}
		}
		return transaction;

	}

	@Override
	public List<Transaction> getAllTransactions(int accNum) {
		

		TypedQuery<Transaction> query = entityManager.createQuery("SELECT t FROM Transaction t where accountnumber=:baccountNumber", Transaction.class);
		if(query!=null) 
		{
		query.setParameter("baccountNumber", accNum);
		}
		return query.getResultList();
		
	}

}
