package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;


public class BankPlaygroundTestSuite {

    @Test       // test metody sprawdzającej saldo w bankomacie pierwszym (liczby dodatnie i ujemne)
    public void checkBalanceInMachineOne() {
        BankPlayground machineOne = new BankPlayground();
        machineOne.makeTransactionInMachine(1);
        machineOne.makeTransactionInMachine(2);
        machineOne.makeTransactionInMachine(2);
        machineOne.makeTransactionInMachine(-4);
        machineOne.makeTransactionInMachine(-6);

        int balance = machineOne.getBalanceInMachine();
        int balanceArr[] = machineOne.getAllTransactionsArr();
        System.out.println(balance);

        // wydrukuj tablicę wszystkich transakcji
        System.out.println(Arrays.toString(balanceArr));
        assertEquals(-5, balance);
    }

    @Test       // test metody dodającej zero do salda w banku
    public void numberOfTransactionsIsZero() {
        BankPlayground bank = new BankPlayground();
        bank.makeTransactionInMachine(0);
        int size = bank.totalNumberOfTransactions();

        assertEquals(0, size);
    }

    @Test       // test metody sprawdzających liczbę wykonanych transakcji w banku
    public void numberOfTransactions() {
        BankPlayground bank = new BankPlayground();
        bank.makeTransactionInMachine(0);
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(-10);
        bank.makeTransactionInMachine(50);
        bank.makeTransactionInMachine(70);
        bank.makeTransactionInMachine(-800);
        bank.makeTransactionInMachine(30);
        bank.makeTransactionInMachine(20);

        int size = bank.totalNumberOfTransactions();
        assertEquals(7, size);
    }



    @Test       // test metody zwracającej łączne saldo w banku
    public void totalBalance() {
        BankPlayground bank = new BankPlayground();
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(-20);
        bank.makeTransactionInMachine(10);

        int balance = bank.getSumBalance();
        assertEquals(20, balance);
    }

    @Test       // test sprawdzający metodę zwracającą liczbę wpłat do banku
    public void totalNumberOfPositiveTransactions() {
        BankPlayground bank = new BankPlayground();
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(-20);
        bank.makeTransactionInMachine(10);

        int numberOfTransactions = bank.totalNumberOfPositiveTransactions();
        assertEquals(4, numberOfTransactions);
    }

    @Test       // test sprawdzający metodę zwracającą liczbę wypłat z banku
    public void totalNumberOfNegativeTransactions() {
        BankPlayground bank = new BankPlayground();
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(-1);
        bank.makeTransactionInMachine(10);
        bank.makeTransactionInMachine(-20);
        bank.makeTransactionInMachine(10);

        int numberOfTransactions = bank.totalNumberOfNegativeTransactions();
        assertEquals(2, numberOfTransactions);
    }


    @Test   // test sprawdzający metodę liczącą średnią sumę wpłat do banku
    public void averageOfNumberOfPositiveTransactions() {
        BankPlayground bank = new BankPlayground();
        bank.makeTransactionInMachine(130);
        bank.makeTransactionInMachine(-100);
        bank.makeTransactionInMachine(527);
        bank.makeTransactionInMachine(-20);
        bank.makeTransactionInMachine(350);

        double sumOfTransactions = bank.averageOfNumberOfPositiveTransactions();
        System.out.println(sumOfTransactions);
        assertEquals(335.66, sumOfTransactions, 0.01);
    }

    @Test   // test sprawdzający metodę liczącą średnią sumę wypłat z banku
    public void averageOfNumberOfNegativeTransactions() {
        BankPlayground bank = new BankPlayground();
        bank.makeTransactionInMachine(130);
        bank.makeTransactionInMachine(-103);
        bank.makeTransactionInMachine(527);
        bank.makeTransactionInMachine(-20);
        bank.makeTransactionInMachine(350);

        double sumOfTransactions = bank.averageOfNumberOfNegativeTransactions();
        System.out.println(sumOfTransactions);
        assertEquals(-61.5, sumOfTransactions, 0.01);
    }


}
