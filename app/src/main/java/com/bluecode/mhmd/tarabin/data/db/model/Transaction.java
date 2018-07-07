package com.bluecode.mhmd.tarabin.data.db.model;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

public class Transaction extends SugarRecord {

    @Unique
    private Long id;
    private String value;
    private String day;
    private String date;
    private BankCard bankCard;
    private User user;
    private String description;
    private TransactionType transactionType;
    private boolean isImportant;
    private boolean isSaved;

    public Transaction() {
    }

    public Transaction(Long id, String value, String day, String date, BankCard bankCard, User user, String description, TransactionType transactionType) {
        this.id = id;
        this.value = value;
        this.day = day;
        this.date = date;
        this.bankCard = bankCard;
        this.user = user;
        this.description = description;
        this.transactionType = transactionType;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getDay() {
        return day;
    }

    public String getDate() {
        return date;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public User getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public void setSaved(boolean saved) {
        isSaved = saved;
    }

    enum  TransactionType {
        DEFICIT,
        DEPOSIT;
    }
}
