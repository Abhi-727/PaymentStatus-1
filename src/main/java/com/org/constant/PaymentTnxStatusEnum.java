package com.org.constant;

import lombok.Getter;

public enum PaymentTnxStatusEnum {

	CREATED(1,"created"),
	INITIATED(2,"initiated"),
	PENDING(3,"pending"),
	SUCCESS(4,"success"),
	FAIL(5,"fail");

	@Getter
	private final int id;
	@Getter
	private final String statusName;

	//CONSTRUCTOR
	PaymentTnxStatusEnum(int id, String statusName) {
		this.id=id;
		this.statusName=statusName;
	}
	
	//Get status by id
	public static PaymentTnxStatusEnum getById(int id) {
		
	for(PaymentTnxStatusEnum status : values()) {
		if(status.getId() == id) {
		return status;
		}
	}
	System.out.println("Transaction id not found " + id);
	return null;
	
	}
	
	//get statusname by id
	public static PaymentTnxStatusEnum getNameById(String name) {
		
		for(PaymentTnxStatusEnum status : values()) {
			if(status.getStatusName().equalsIgnoreCase(name)) {
			return status;
			}
		}
		
		throw new IllegalArgumentException("status not found " + name);
	}
	
	
}
