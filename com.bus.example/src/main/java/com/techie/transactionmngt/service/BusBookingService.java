package com.techie.transactionmngt.service;


import com.techie.transactionmngt.dto.BusBookingAcknowledgement;
import com.techie.transactionmngt.dto.BusBookingRequest;
import com.techie.transactionmngt.entity.PassengerInfo;
import com.techie.transactionmngt.entity.PaymentInfo;
import com.techie.transactionmngt.repository.PassengerInfoRepository;
import com.techie.transactionmngt.repository.PaymentInfoRepository;
import com.techie.transactionmngt.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class BusBookingService {


    @Autowired
    private PassengerInfoRepository passengerInfoRepository;


    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    


    @Transactional
    public BusBookingAcknowledgement bookBusTicket(BusBookingRequest request){

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());

        paymentInfo.setPassengerId(passengerInfo.getPId());

        paymentInfo.setAmount(passengerInfo.getFare());

        paymentInfoRepository.save(paymentInfo);

        return new BusBookingAcknowledgement("SUCCESS",passengerInfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],passengerInfo);


    }

}
