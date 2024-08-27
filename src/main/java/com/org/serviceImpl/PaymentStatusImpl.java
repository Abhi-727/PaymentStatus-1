package com.org.serviceImpl;

import org.springframework.stereotype.Component;

import com.org.constant.PaymentTnxStatusEnum;
import com.org.dto.TransactionDto;
import com.org.service.IPaymentStatus;

@Component
public class PaymentStatusImpl implements IPaymentStatus {

	@Override
	public String createStatus(TransactionDto dto) {
	
		System.out.println("PaymentStatusImpl.createStatus()" + dto);
		
		PaymentTnxStatusEnum getstatus = PaymentTnxStatusEnum.getById(dto.getTxnStatusId());
		System.out.println("status id : " + getstatus.getId() + " statusname : " + getstatus.getStatusName());
		
		return "from paymentserviceImpl class " ; 
	}

}
