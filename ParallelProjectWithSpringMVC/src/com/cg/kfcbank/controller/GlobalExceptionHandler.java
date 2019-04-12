package com.cg.kfcbank.controller;


import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.cg.kfcbank.bean.Bank;
import com.cg.kfcbank.exception.BankException;



@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = {BankException.class})
    protected ModelAndView handleConflict(Exception ex) {
		ModelAndView model = new ModelAndView("error");
		model.addObject("errMsg", ex.getMessage());
		return model;
    }
}
