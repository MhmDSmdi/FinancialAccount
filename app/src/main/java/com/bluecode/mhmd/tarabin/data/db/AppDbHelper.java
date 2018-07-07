package com.bluecode.mhmd.tarabin.data.db;

import com.bluecode.mhmd.tarabin.data.db.model.Note;
import com.bluecode.mhmd.tarabin.data.db.model.Transaction;
import com.bluecode.mhmd.tarabin.data.db.model.User;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AppDbHelper implements DbHelper {

    @Override
    public Transaction getTransactionByDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        return (Transaction) Transaction.find(Transaction.class, "date = ", format);
    }

    @Override
    public List<Transaction> getAllTransactionByUser(Long userId) {
        User user = (User) User.find(User.class, "id = ", userId.toString());
        return user.getTransactionList();
    }

    @Override
    public List<Transaction> getAllTransaction() {
        List<Transaction> transactionList = Transaction.listAll(Transaction.class);
        return transactionList;
    }

    @Override
    public boolean deleteTransaction(Long transactionId) {
        Transaction transactionDeleted = Transaction.findById(Transaction.class, transactionId);
        Transaction.delete(transactionDeleted);
        return true;
    }

    @Override
    public boolean saveTransaction(Transaction transaction) {
        Transaction.save(transaction);
        return true;
    }

    @Override
    public User getUserById(Long userId) {
        User user = User.findById(User.class, userId);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> userList = User.listAll(User.class);
        return userList;
    }

    @Override
    public boolean deleteUser(Long userId) {
        User user = User.findById(User.class, userId);
        User.delete(user);
        return true;
    }

    @Override
    public boolean saveUser(User user) {
        User.save(user);
        return true;
    }

    @Override
    public List<Note> getAllNoteByUser(Long userId) {
        User user = User.findById(User.class, userId);
        return user.getNoteList();
    }

    @Override
    public boolean deleteNote(Long noteId) {
        Note note = Note.findById(Note.class, noteId);
        Note.delete(note);
        return true;
    }

    @Override
    public boolean saveNote(Note note) {
        Note.save(note);
        return true;
    }
}
