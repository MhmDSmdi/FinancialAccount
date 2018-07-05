package com.bluecode.mhmd.tarabin.data.db.model;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

public class BankCard extends SugarRecord {

    @Unique
    private long id;
    private String cardNumber;
    private User user;
    private String expirationDate;
    private Bank bank;


    public BankCard() {
    }

    public BankCard(long id, String cardNumber, User user, String expirationDate, Bank bank) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.user = user;
        this.expirationDate = expirationDate;
        this.bank = bank;
    }

    @Override
    public Long getId() {
        return id;
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
