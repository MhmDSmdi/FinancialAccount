package com.bluecode.mhmd.tarabin.data.db;

import com.bluecode.mhmd.tarabin.data.db.model.Note;
import com.bluecode.mhmd.tarabin.data.db.model.Transaction;
import com.bluecode.mhmd.tarabin.data.db.model.User;

import java.util.Date;
import java.util.List;

public interface DbHelper {
    Transaction getTransactionByDate(Date date);
    List<Transaction> getAllTransactionByUser(Long userId);
    List<Transaction> getAllTransaction();
    boolean deleteTransaction(Long transactionId);
    boolean saveTransaction(Transaction transaction);
    User getUserById(Long userId);
    List<User> getAllUser();
    boolean deleteUser(Long userId);
    boolean saveUser(User user);
    List<Note> getAllNoteByUser(Long userId);
    boolean deleteNote(Long noteId);
    boolean saveNote(Note note);

}
