package com.techie.transactionmngt.dto;


import com.techie.transactionmngt.entity.PassengerInfo;
import com.techie.transactionmngt.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;



}
