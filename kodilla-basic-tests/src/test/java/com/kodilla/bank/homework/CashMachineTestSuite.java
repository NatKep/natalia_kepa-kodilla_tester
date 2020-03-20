package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMachineTestSuite {

    @Test       // test czy tablica jest pusta gdy nie ma żadnych transakcji
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test       // test dodawania transakcji do tablicy
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-5);
        cashMachine.add(-2);

//        int[] array = cashMachine.getTransactions();
//        System.out.println(Arrays.toString(array));

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(-5, transactions[0]);
        assertEquals(-2, transactions[1]);
    }

    @Test       // test pokazujący czy po dwóch transakcjach wielkość tablicy jest równa 2
    public void shouldReturnTwoTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-5);
        cashMachine.add(-2);

        int transactionNumber = cashMachine.getNumberOfTransactions();
        assertEquals(2, transactionNumber);

    }

    @Test       // test sprawdzający saldo przy dodaniu liczby ujemnej
    public void shouldReturnMinusTen() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-15);
        cashMachine.add(5);

        int balance = cashMachine.getCashMachineBalance();
        assertEquals(-10, balance);
    }

    @Test       // test sprawdzający liczbę transakcji związanych z wpłatą
    public void returnNumberOfPositiveTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-5);
        cashMachine.add(10);
        cashMachine.add(5);
        int number = cashMachine.numberOfPositiveTransactions();
        assertEquals(2, number);
    }

    @Test       // test sprawdzający liczbę transakcji związanych z wypłatą
    public void numberOfNegativeTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-5);
        cashMachine.add(10);
        cashMachine.add(5);
        int number = cashMachine.numberOfNegativeTransactions();
        assertEquals(1, number);
    }

    @Test
    public void sumOfPositiveTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-5);
        cashMachine.add(10);
        cashMachine.add(5);
        cashMachine.add(500);
        int sum = cashMachine.getSumOfPositiveTransactions();
        assertEquals(515, sum);

    }

    @Test
    public void sumOfNegativeTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-5);
        cashMachine.add(10);
        cashMachine.add(5);
        cashMachine.add(-500);
        int sum = cashMachine.getSumOfNegativeTransactions();
        assertEquals(-505, sum);

    }

}
