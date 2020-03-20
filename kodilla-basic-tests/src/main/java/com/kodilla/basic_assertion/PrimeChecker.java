package com.kodilla.basic_assertion;

public class PrimeChecker {

//    public boolean isPrime(int number) {
//        boolean  isTrue = false;
//        if (number <= 1) {  // liczby mniejsze od 1 i równe 1 nie są pierwsze
//            isTrue = false;
//        }
//        else if (number == 2) { // liczba 2 jest liczbą pierwszą
//            isTrue = true;
//        }
//        else if (number % 2  == 0) { // pozostałe liczby podzielne przez 2 nie są pierwsze
//            isTrue = false;
//        }
//        else if (number / 1 == number && number / number == 1) {
//            isTrue = true;
//        }
//        return isTrue;
//    }

        private int count;

        public boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public int getCount() {
            return count;
        }

        public void incrementCount() {
            this.count++;
        }

}
