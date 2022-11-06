package com.chase.payment.Model;

import javax.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue
    @Column
    private long Id;
    @Column
    private String business;
    @Column
    private String accountNum;
    @Column
    private String cardHolder;
    @Column
    private String cardNumber;
    @Column
    private String expirationDate;
    @Column
    private String cvv;

    public Payment(String business, String accountNum, String customerName, String creditCardNum, String expDate,
            String cvv) {
        this.business = business;
        this.accountNum = accountNum;
        this.cardHolder = customerName;
        this.cardNumber = creditCardNum;
        this.expirationDate = expDate;
        this.cvv = cvv;
    }
    public Payment(){

    }

    
}
