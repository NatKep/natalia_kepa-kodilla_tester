package com.kodilla.bank.homework;
import java.util.Arrays;

public class Bank {

    private CashMachine machineOne;     // bankomat pierwszy z transakcjami
    private CashMachine machineTwo;     // bankomat drugi z transakcjami

//    public Bank() {
//        this.machineOne = new CashMachine();
//        this.machineTwo = new CashMachine();
//    }

    // metoda wykonująca transakcję w bankomacie pierwszym
    public void makeTransactionInMachineOne(int transactionValue) {
        if (transactionValue != 0) {        // nie można wyjąć/dodać z banku 0 zł
            this.machineOne.add(transactionValue);  // dodaje wartość w tablicy bankomatu pierwszego
        }
    }

    // metoda wykonująca transakcję w bankomacie drugim
    public void makeTransactionInMachineTwo(int transactionValue) {
        if (transactionValue != 0) {        // nie można wyjąć/dodać z banku 0 zł
            this.machineTwo.add(transactionValue);  // dodaje wartość w tablicy bankomatu drugiego
        }
    }

    // metoda wyciąga saldo z bankomatu pierwszego
    public int getBalanceInMachineOne() {
        return this.machineOne.getCashMachineBalance();
    }

    // metoda zwraca całkowite saldo w banku
    public int getSumBalance() {
        int balance = this.machineOne.getCashMachineBalance() + this.machineTwo.getCashMachineBalance();
        return balance;
    }

    // metoda zwraca całkowitą liczbę wykonanych transakcji w banku
    public int totalNumberOfTransactions() {
        int size = this.machineOne.getNumberOfTransactions() + this.machineTwo.getNumberOfTransactions();
        return size;
    }

    //   metoda zwraca liczbę transakcji związanych z wpłatą do banku
    public int totalNumberOfPositiveTransactions() {
        int number = this.machineOne.numberOfPositiveTransactions() + this.machineTwo.numberOfPositiveTransactions();
        return number;
    }

    //   metoda zwraca liczbę transakcji związanych z wypłatą z banku
    public int totalNumberOfNegativeTransactions() {
        int number = this.machineOne.numberOfNegativeTransactions() + this.machineTwo.numberOfNegativeTransactions();
        return number;
    }

    // metoda licząca średnią wartość wpłat do banku
    public double averageOfNumberOfPositiveTransactions() {
        int numberOfTransactions = this.machineOne.numberOfPositiveTransactions() + this.machineTwo.numberOfPositiveTransactions();
        double sumOfTransactions = this.machineOne.getSumOfPositiveTransactions() + this.machineTwo.getSumOfPositiveTransactions();
        double number = sumOfTransactions /  numberOfTransactions;
        return number;
    }

    // metoda licząca średnią wartość wypłat z banku
    public double averageOfNumberOfNegativeTransactions() {
        int numberOfTransactions = this.machineOne.numberOfNegativeTransactions() + this.machineTwo.numberOfNegativeTransactions();
        double sumOfTransactions = this.machineOne.getSumOfNegativeTransactions() + this.machineTwo.getSumOfNegativeTransactions();
        double number = sumOfTransactions /  numberOfTransactions;
        return number;
    }

}
