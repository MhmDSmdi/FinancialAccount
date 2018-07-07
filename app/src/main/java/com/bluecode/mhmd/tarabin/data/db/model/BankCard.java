package com.bluecode.mhmd.tarabin.data.db.model;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

public class BankCard extends SugarRecord {

    private String cardNumber;
    private User user;
    private String expirationDate;
    private Bank bank;


    public BankCard() {
    }

    public BankCard(String cardNumber, User user, String expirationDate, Bank bank) {
        this.cardNumber = cardNumber;
        this.user = user;
        this.expirationDate = expirationDate;
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public User getUser() {
        return user;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public Bank getBank() {
        return bank;
    }
}
