// Importowanie biblioteki potrzebnej do losowania liczb
import java.util.Random;
import java.util.Arrays;

public class RandomNumbers {

    public static void main(String[] args) {

        int[] results = getCountOfRandomNumber();
        int biggestNumber = results[0];
        int smallestNumber = results[1];

        System.out.println("Największa wylosowana liczba to: " + biggestNumber);
        System.out.println("Największa wylosowana liczba to: " + smallestNumber);

//      wydrukuj tablicę z najmniejszą i największą wylosowaną liczbą
        System.out.println(Arrays.toString(results));
    }

    //    metoda do losowania liczb
    public static int[] getCountOfRandomNumber() {
        Random random = new Random();
        int sum = 0;
        int biggestNumber = 0;
        int smallestNumber = 0;

//      pierwsze losowanie
        int temporaryNum = random.nextInt(30)+1;
        smallestNumber = temporaryNum;
        biggestNumber = temporaryNum;

        sum = sum + temporaryNum;

//      pozostałe losowania
        while (sum <= 5000) {
            temporaryNum = random.nextInt(30)+1;

//          zapisz największą wylosowaną wartość
            if (biggestNumber < temporaryNum) {
                biggestNumber = temporaryNum;
            }

//          zapisz najmniejszą wylosowaną wartość
            if (smallestNumber > temporaryNum) {
                smallestNumber = temporaryNum;
            }
            sum = sum + temporaryNum;
        }
//      zwróć tablicę z najmniejszą i największą wylosowaną liczbą
        return new int[] {smallestNumber, biggestNumber};
    }

}