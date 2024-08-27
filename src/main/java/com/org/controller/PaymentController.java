package com.org.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dto.TransactionDto;
import com.org.pojo.Transaction;
import com.org.service.IPaymentStatus;

@RestController
@RequestMapping("v1/payment")
public class PaymentController {
	
	@Autowired
	private IPaymentStatus service;
	
	@Autowired
	private ModelMapper mapper;

	@PostMapping("/create")
	public String createPayment(@RequestBody Transaction transaction) {
		
		System.out.println("program execution starts : " + transaction);
		
	//converting javaobj into dto class
	TransactionDto convertDto = mapper.map(transaction, TransactionDto.class);
	System.out.println("converted from java obj to dto class " + convertDto);
		
	String status = service.createStatus(convertDto);
		
		
		return "created status " + " | " + status;
	}
}
