package bank_structure;

import exceptions.TransactionDoesExistException;
import exceptions.TransactionDoesNotExistException;

import java.util.ArrayList;

public interface Account {
    public void addTransaction(Transaction transaction) throws TransactionDoesExistException;
    public void removeTransaction(Transaction transaction) throws TransactionDoesNotExistException;
    public double calculateAccountBalance();
    public ArrayList<Transaction> getTransactionsSorted(boolean asc);
    public ArrayList<Transaction> getTransactionsByType(boolean positive);
    public void login(String accountId);
    public void logout();
}
