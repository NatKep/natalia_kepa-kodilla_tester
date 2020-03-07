// Importowanie biblioteki potrzebnej do losowania liczb
import java.util.Random;

public class RandomNumbers {
    int maxNum = 0;
    int minNum = 0;
    int currentNum = 0;

    // metoda do wylosowania jednej liczby
    public int diceOneNumber() {
        Random random = new Random();
        int currentNum = random.nextInt(30) + 1;
        this.currentNum = currentNum;
        return currentNum;
    }


    //    metoda do sprawdzenia czy wylosowana liczba jest mniejsza od poprzedniej
    public int ifMinNum() {
        int temporaryNum = currentNum;  // przypisanie aktualnie wylosowanej liczby do zmiennej
        if (minNum > temporaryNum) {  // porównanie aktualnie wylosowanej liczy z poprzednią
            minNum = temporaryNum;
        }
        return minNum;
    }

    //    metoda do sprawdzenia czy wylosowana liczba jest większa od poprzedniej
    public int ifMaxNum() {
        int temporaryNum = currentNum;  // przypisanie aktualnie wylosowanej liczby do zmiennej
        if (maxNum < temporaryNum) {    // porównanie aktualnie wylosowanej liczy z poprzednią
            maxNum = temporaryNum;
        }
        return maxNum;
    }

    //  metoda do petli wykonującej się, aż suma dodanych liczb przekroczy 5000
    public int diceWhile() {
        int sum = 0;
        while (sum <= 5000) {
            int temporaryNum = diceOneNumber();  //uruchomienie metody do losowania pojedynczej losowej liczby
            ifMaxNum(); // uruchomienie metody do sprawdzenia czy wylosowana liczba jest większa od poprzedniej
            ifMinNum(); // uruchomienie metody do sprawdzenia czy wylosowana liczba jest mniejsza od poprzedniej
            sum = sum + temporaryNum;
        }
        return sum;
    }

    //    uruchomienie metod
    public static void main(String[] args) {

        RandomNumbers number = new RandomNumbers();
        int total = number.diceWhile();

        int maxNum = number.ifMaxNum();
        System.out.println("Ostateczna maxNum: " + maxNum);

        int minNum = number.ifMinNum();
        System.out.println("Ostateczna minNum: " + minNum);

        System.out.println("Ostateczna suma z losowań: " + total);

    }




}