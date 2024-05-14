package com.techie.transactionmngt.utils;

import com.techie.transactionmngt.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {


    private static Map<String, Double> paymentMap = new HashMap<>();

    static {

        paymentMap.put("acc1",25000.0);
        paymentMap.put("acc2",8000.0);
        paymentMap.put("acc3",28000.0);
        paymentMap.put("acc4",88000.0);


    }

    public static boolean validateCreditLimit(String accNo, double paidAmount){

        if(paidAmount>paymentMap.get(accNo)){
            throw new  InsufficientAmountException("Sorry Insufficient Funds..Rob a Bank!!");
        }else {

            return  true;

        }
    }
}
