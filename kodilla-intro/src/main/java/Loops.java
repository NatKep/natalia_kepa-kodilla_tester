public class Loops {




    public static void main (String[] args) {

        int arr[] = {1, 2, 3, 4};
        int total = sum(arr);       //uruchamia metodę dodawania liczb w tablicy
        System.out.println(total);  //drukuje wynik powyższej metody

        // while loop
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }



    }

    // metoda do dodania liczb w tablicy arr
    public static int sum (int tablica[]) {
        int sum = 0;
        for (int i = 0; i < tablica.length; i++) {
            sum = sum + tablica[i];
        }
        return sum;
    }





    }

