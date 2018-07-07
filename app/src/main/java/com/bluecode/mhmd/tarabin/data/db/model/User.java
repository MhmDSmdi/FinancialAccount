package com.bluecode.mhmd.tarabin.data.db.model;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

import java.net.URI;
import java.util.ArrayList;

public class User extends SugarRecord {

    @Unique
    private Long id;
    private String userFirsName;
    private String userLastName;
    private URI image;
    private ArrayList<BankCard> bankCardsList;
    private ArrayList<Transaction> transactionList;
    private ArrayList<Note> noteList;

    public User() {

    }

    public User(long id, String userFirsName, String userLastName) {
        this.id = id;
        this.userFirsName = userFirsName;
        this.userLastName = userLastName;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getUserFirsName() {
        return userFirsName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public URI getImage() {
        return image;
    }

    public ArrayList<BankCard> getBankCardsList() {
        return bankCardsList;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public ArrayList<Note> getNoteList() {
        return noteList;
    }

    public void setImage(URI image) {
        this.image = image;
    }

    public void setBankCardsList(ArrayList<BankCard> bankCardsList) {
        this.bankCardsList = bankCardsList;
    }

    public void setTransactionList(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void setNoteList(ArrayList<Note> noteList) {
        this.noteList = noteList;
    }
}
