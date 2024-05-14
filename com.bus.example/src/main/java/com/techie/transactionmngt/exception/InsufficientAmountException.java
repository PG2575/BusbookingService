package com.techie.transactionmngt.exception;

public class InsufficientAmountException extends RuntimeException{
    public InsufficientAmountException(String sms){
        super(sms);

    }
}
