package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test       // test metody sprawdzającej saldo w bankomacie pierwszym
    public void checkBalanceInMachineOne() {
        Bank bank = new Bank();
        bank.makeTransactionInMachineOne(1);
        bank.makeTransactionInMachineOne(2);
        bank.makeTransactionInMachineOne(2);
        bank.makeTransactionInMachineOne(-4);
        bank.makeTransactionInMachineOne(-6);

        int balance = bank.getBalanceInMachineOne();
        assertEquals(-5, balance);
    }

    @Test       // test metody dodającej zero do salda w banku
    public void numberOfTransactionsIsZero() {
        Bank bank = new Bank();
        bank.makeTransactionInMachineOne(0);
        bank.makeTransactionInMachineTwo(0);
        int size = bank.totalNumberOfTransactions();

        assertEquals(0, size);
    }

    @Test       // test metody sprawdzających liczbę wykonanych transakcji w banku
    public void numberOfTransactions() {
        Bank bank = new Bank();
        bank.makeTransactionInMachineOne(0);
        bank.makeTransactionInMachineOne(10);
        bank.makeTransactionInMachineOne(-10);
        bank.makeTransactionInMachineOne(50);
        bank.makeTransactionInMachineTwo(70);
        bank.makeTransactionInMachineTwo(-800);
        bank.makeTransactionInMachineTwo(30);
        bank.makeTransactionInMachineTwo(20);

        int size = bank.totalNumberOfTransactions();
        assertEquals(7, size);
    }



    @Test       // test metody zwracającej łączne saldo w banku
    public void totalBalance() {
        Bank bank = new Bank();
        bank.makeTransactionInMachineOne(10);
        bank.makeTransactionInMachineOne(10);
        bank.makeTransactionInMachineTwo(10);
        bank.makeTransactionInMachineTwo(-20);
        bank.makeTransactionInMachineOne(10);

        int balance = bank.getSumBalance();
        assertEquals(20, balance);
    }

    @Test       // test sprawdzający metodę zwracającą liczbę wpłat do banku
    public void totalNumberOfPositiveTransactions() {
        Bank bank = new Bank();
        bank.makeTransactionInMachineOne(10);
        bank.makeTransactionInMachineOne(10);
        bank.makeTransactionInMachineTwo(10);
        bank.makeTransactionInMachineTwo(-20);
        bank.makeTransactionInMachineOne(10);

        int numberOfTransactions = bank.totalNumberOfPositiveTransactions();
        assertEquals(4, numberOfTransactions);
    }

    @Test       // test sprawdzający metodę zwracającą liczbę wypłat z banku
    public void totalNumberOfNegativeTransactions() {
        Bank bank = new Bank();
        bank.makeTransactionInMachineOne(10);
        bank.makeTransactionInMachineOne(-1);
        bank.makeTransactionInMachineTwo(10);
        bank.makeTransactionInMachineTwo(-20);
        bank.makeTransactionInMachineOne(10);

        int numberOfTransactions = bank.totalNumberOfNegativeTransactions();
        assertEquals(2, numberOfTransactions);
    }


    @Test   // test sprawdzający metodę liczącą średnią sumę wpłat do banku
    public void averageOfNumberOfPositiveTransactions() {
        Bank bank = new Bank();
        bank.makeTransactionInMachineOne(130);
        bank.makeTransactionInMachineOne(-100);
        bank.makeTransactionInMachineTwo(527);
        bank.makeTransactionInMachineTwo(-20);
        bank.makeTransactionInMachineOne(350);

        double sumOfTransactions = bank.averageOfNumberOfPositiveTransactions();
        System.out.println(sumOfTransactions);
        assertEquals(335.66, sumOfTransactions, 0.01);
    }

    @Test   // test sprawdzający metodę liczącą średnią sumę wypłat z banku
    public void averageOfNumberOfNegativeTransactions() {
        Bank bank = new Bank();
        bank.makeTransactionInMachineOne(130);
        bank.makeTransactionInMachineOne(-103);
        bank.makeTransactionInMachineTwo(527);
        bank.makeTransactionInMachineTwo(-20);
        bank.makeTransactionInMachineOne(350);

        double sumOfTransactions = bank.averageOfNumberOfNegativeTransactions();
        System.out.println(sumOfTransactions);
        assertEquals(-61.5, sumOfTransactions, 0.01);
    }

}
