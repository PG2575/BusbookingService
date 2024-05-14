package com.techie.transactionmngt.controller;

import com.techie.transactionmngt.dto.BusBookingAcknowledgement;
import com.techie.transactionmngt.dto.BusBookingRequest;
import com.techie.transactionmngt.service.BusBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/bluebus")
public class BusBookingController {


    @Autowired
    private BusBookingService service;


    @PostMapping("/bookBusTicket")
    public BusBookingAcknowledgement bookBusTicket(@RequestBody BusBookingRequest request){

        return service.bookBusTicket(request);

    }


}
