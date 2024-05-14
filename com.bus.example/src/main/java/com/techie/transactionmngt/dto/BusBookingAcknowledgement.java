package com.techie.transactionmngt.dto;

import com.techie.transactionmngt.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusBookingAcknowledgement {


    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
