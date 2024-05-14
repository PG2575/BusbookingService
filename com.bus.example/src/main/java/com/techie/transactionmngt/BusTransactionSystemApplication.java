package com.techie.transactionmngt;

import com.techie.transactionmngt.dto.BusBookingAcknowledgement;
import com.techie.transactionmngt.dto.BusBookingRequest;
import com.techie.transactionmngt.service.BusBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableTransactionManagement
public class BusTransactionSystemApplication {




	public static void main(String[] args) {
		SpringApplication.run(BusTransactionSystemApplication.class, args);
	}

}
