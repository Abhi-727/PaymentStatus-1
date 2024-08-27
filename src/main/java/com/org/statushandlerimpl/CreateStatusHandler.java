package com.org.statushandlerimpl;

import com.org.dto.TransactionDto;
import com.org.serviceabstract.StatusHandler;

public class CreateStatusHandler extends StatusHandler {

	@Override
	public String tnxStatus(TransactionDto status) {
    System.out.println("CreateStatusHandler.tnxStatus()");
    
		return " returning  from createstatushandler " ;
	}

}
