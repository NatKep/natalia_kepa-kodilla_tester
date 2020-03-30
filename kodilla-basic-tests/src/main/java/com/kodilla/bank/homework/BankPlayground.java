package com.kodilla.bank.homework;

public class BankPlayground {

    private CashMachine machine;
    public int[] allMachines;  // tablica ze wszystkimi transakcjami
    private int size;

    public BankPlayground() {
        this.machine = new CashMachine();
        this.allMachines = new int[0];
        this.size = 0;
    }

        // metoda zwracająca tablicę transakcji
    public int[] getAllTransactionsArr() {
        return allMachines;
    }

    // metoda dodająca wartość transakcji do tablicy
    public void addTransactionToArr(int transactionValue) {
        this.size++;
        int[] newArr = new int[this.size];
        System.arraycopy(allMachines, 0, newArr, 0, allMachines.length);
        newArr[this.size - 1] = transactionValue;
        this.allMachines = newArr;
    }

    // metoda wykonująca transakcję w bankomacie
    public void makeTransactionInMachine(int transactionValue) {
        if (transactionValue != 0) {        // nie można wyjąć/dodać z banku 0 zł
            this.machine.add(transactionValue);  // dodaje wartość w tablicy bankomatu
            addTransactionToArr(transactionValue);  // dodaje wartość transakcji do tablicy

        }
    }

    // metoda wyciąga saldo z bankomatu pierwszego
    public int getBalanceInMachine() {
        return this.machine.getCashMachineBalance();
    }

    // metoda zwraca całkowite saldo w banku
    public int getSumBalance() {
        int balance = this.machine.getCashMachineBalance() + this.machine.getCashMachineBalance();
        return balance;
    }

    // metoda zwraca całkowitą liczbę wykonanych transakcji w banku
    public int totalNumberOfTransactions() {
        int size = this.machine.getNumberOfTransactions() + this.machine.getNumberOfTransactions();
        return size;
    }

    //   metoda zwraca liczbę transakcji związanych z wpłatą do banku
    public int totalNumberOfPositiveTransactions() {
        int number = this.machine.numberOfPositiveTransactions() + this.machine.numberOfPositiveTransactions();
        return number;
    }

    //   metoda zwraca liczbę transakcji związanych z wypłatą z banku
    public int totalNumberOfNegativeTransactions() {
        int number = this.machine.numberOfNegativeTransactions() + this.machine.numberOfNegativeTransactions();
        return number;
    }

    // metoda licząca średnią wartość wpłat do banku
    public double averageOfNumberOfPositiveTransactions() {
        int numberOfTransactions = this.machine.numberOfPositiveTransactions() + this.machine.numberOfPositiveTransactions();
        double sumOfTransactions = this.machine.getSumOfPositiveTransactions() + this.machine.getSumOfPositiveTransactions();
        double number = sumOfTransactions /  numberOfTransactions;
        return number;
    }

    // metoda licząca średnią wartość wypłat z banku
    public double averageOfNumberOfNegativeTransactions() {
        int numberOfTransactions = this.machine.numberOfNegativeTransactions() + this.machine.numberOfNegativeTransactions();
        double sumOfTransactions = this.machine.getSumOfNegativeTransactions() + this.machine.getSumOfNegativeTransactions();
        double number = sumOfTransactions /  numberOfTransactions;
        return number;
    }



}
