package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;  // tablica ze zrealizowanymi transakcjami w bankomacie
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    // metoda dodająca wartość wykonanej transakcji w bankomacie do tablicy
    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    // metoda zwracająca tablicę wykonanych transakcji w bankomacie
    public int[] getTransactions() {
        return transactions;
    }

    // metoda zwracająca liczbę transakcji w bankomacie
    public int getNumberOfTransactions() {
        return size;
    }

    // metoda zwracająca saldo w bankomacie
    public int getCashMachineBalance() {
        int balance = 0;
        for (int i = 0; i < transactions.length; i++) {
            balance = balance + transactions[i];
        }
        return balance;
    }

    // metoda zwracająca liczbę transakcji związanych z wpłatą do bankomatu
    public int numberOfPositiveTransactions() {
        int number = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                number++;
            }
        }
        return number;
    }

    // metoda zwracająca liczbę transakcji związanych z wypłatą z bankomatu
    public int numberOfNegativeTransactions() {
        int number = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                number++;
            }
        }
        return number;
    }

    // metoda licząca sumę wartości wpłat do bankomatu
    public int getSumOfPositiveTransactions() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum = sum + transactions[i];
            }
        }
        return sum;
    }

    // metoda licząca sumę wartości wypłat z bankomatu
    public int getSumOfNegativeTransactions() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum = sum + transactions[i];
            }
        }
        return sum;
    }

}
