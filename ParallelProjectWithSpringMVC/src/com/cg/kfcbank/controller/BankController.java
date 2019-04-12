package com.cg.kfcbank.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.kfcbank.bean.Bank;
import com.cg.kfcbank.bean.Transaction;
import com.cg.kfcbank.exception.BankException;
import com.cg.kfcbank.service.IBankService;



@Controller
public class BankController {
	
	@Autowired
	private IBankService service;

	
	
	public IBankService getService() {
		return service;
	}

	public void setService(IBankService service) {
		this.service = service;
	}

	@RequestMapping("/showLoginPage")
	public String showLoginPage() {
		return "loginForm";
	}
	
	@RequestMapping("/validateLogin")
	public ModelAndView validateLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
		ModelAndView mv = null;
		String msg = "Authentication failed!!!please try Again...";
		if("admin".equals(username) && "java".equals(password))
		{
			mv = new ModelAndView("showBankOperationPage");
		}
		else
		{
			mv = new ModelAndView("loginForm");
			mv.addObject("message", msg);
		}
		return mv;
	}
	
	@RequestMapping("/showBankOperationPage")
	public String showBankOperationPage() 
	{
		
		return "showBankOperationPage";
	}
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomerForm() {
		
		Bank bank = new Bank();
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("addCustomerForm", "bank", bank);
	}
	
	@RequestMapping("/addSuccessCustomer")
	public ModelAndView addTrainee(@ModelAttribute("bank") @Valid Bank bank,
			BindingResult result) {
		ModelAndView mv = null;

		if (!result.hasErrors()) {
			bank = service.addCustomer(bank);
			mv = new ModelAndView("addSuccess");
			mv.addObject("accountNumber", bank.getAccountNumber());
			mv.addObject("accountHolderName" , bank.getAccountHolderName());
			} else {
			mv = new ModelAndView("addCustomerForm","bank",bank);
		}

		return mv;
	}
	@RequestMapping("/showAllDetails")
	public ModelAndView showAllDetails() {
	
		List<Bank> bank = service.getAllDetails();
		return new ModelAndView("showAllDetailsPage","bank",bank);
	}
	@RequestMapping("/showBalanceForm")
	public ModelAndView showBalanceForm() {
		
		Bank bank = new Bank();
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("showBalanceForm", "bank", bank);
	}
	
	@RequestMapping("/showBalance")
	public ModelAndView showBalance(@RequestParam("accountNumber") int accountNumber) 
	{
		double balance= service.showBalance(accountNumber); 
		if(balance!= 0.0) {
		return new ModelAndView("showBalanceForm","message",balance);
		}
		else {
			return new ModelAndView("showBalanceForm","message","Account number is not present please enter valid account number!!!!");
		}
}
	@RequestMapping("/ShowWithdrawForm")
	public ModelAndView withdrawForm() {
		
		Bank bank = new Bank();
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("ShowWithdrawForm", "bank", bank);
	}
	@RequestMapping("/showWithdraw")
	public ModelAndView withDraw(@RequestParam("accountNumber") int accountNumber,@RequestParam("amount") double ammount) 
	{
		ModelAndView mv = null;
		Transaction transaction = new Transaction();
		transaction = service.withdraw(accountNumber, ammount);
		if(transaction!=null)
		{
			String withdraw = "withdraw successfully done!!!Transaction details are given below";
			mv =  new ModelAndView("SuccesTransaction");
			mv.addObject("withdraw", withdraw);
			mv.addObject("transaction",transaction);
		}
		else
			mv =  new ModelAndView("ShowWithdrawForm","message","Sorry!!Your withdraw can't be done!!!");
		return mv;
	
}
	@RequestMapping("/ShowDepositForm")
	public ModelAndView ShowDepositForm() {
		
		Bank bank = new Bank();
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("ShowDepositForm", "bank", bank);
	}
	@RequestMapping("/showDeposit")
	public ModelAndView Deposit(@RequestParam("accountNumber") int accountNumber,@RequestParam("amount") double ammount) 
	{
		ModelAndView mv = null;
		Transaction transaction = new Transaction();
		transaction = service.deposit(accountNumber, ammount);
		if(transaction!=null)
		{
			String deposit = "Deposit successfully done!!!Transaction details are given below";
			mv =  new ModelAndView("SuccesTransaction");
			mv.addObject("deposit", deposit);
			mv.addObject("transaction",transaction);
		}
		else
		
			mv = new ModelAndView("ShowDepositForm","message","Sorry!!Your deposit can't be done!!!");
		
		return mv;
		
}
	@RequestMapping("/searchForm")
	public ModelAndView searchForm() {
		
		Bank bank = new Bank();
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("searchCustomerForm", "bank", bank);
	}
	@RequestMapping("/searchCustomer")
	public ModelAndView searchCustomer(@RequestParam("accountNumber") int accountNumber) {
		
		ModelAndView mv = null;
		Bank bank = service.searchCustomer(accountNumber);
		if(bank!=null)
		mv =  new ModelAndView("showCustomerPage","bank",bank);
		else
		mv = new ModelAndView("searchCustomerForm", "message", "Please enter Valid Account number!!!!");
		
		return mv;
	}
	@RequestMapping("/fundTransferForm")
	public ModelAndView fundTransferForm() {
		
		Bank bank = new Bank();
		// Add the attribute to the model and set the viewname and return it
		return new ModelAndView("fundTransferForm", "bank", bank);
	}
	@RequestMapping("/fundTransfer")
	public ModelAndView fundtransferSuccess(@RequestParam("accountNumber") int accountNumber , @RequestParam("accountNumber1") int accountNumber1,@RequestParam("amount") double amount) {
		
		ModelAndView mv = null;
		Transaction transaction = new Transaction();
		transaction = service.fundTransfer(accountNumber, accountNumber1, amount);
	  if(transaction!=null)
		mv =  new ModelAndView("SuccesTransaction","transaction",transaction);
	
	  else
		mv = new ModelAndView("fundTransferForm", "message", "invalid account number or insufficient balance!!!!");
		
		return mv;
	}
	@RequestMapping("/printTransactionForm")
	public ModelAndView printTransactionsForm() {
		
		Transaction transaction = new Transaction();
		return new ModelAndView("printTransactionForm", "transaction", transaction);
	}
	
	@RequestMapping("/printTransactions")
	public ModelAndView printTransactions(@RequestParam("accountNumber") int accountNumber) {
		
		ModelAndView mv = null;
		List<Transaction> transactions= service.getAllTransactions(accountNumber);
	  if(transactions!=null)
		mv =  new ModelAndView("printAllTransactions","transactions",transactions);
	
	  else
		mv = new ModelAndView("printTransactionForm", "message", "invalid account number!!!!");
		
		return mv;
	}
	
}