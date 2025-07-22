/*
Prime Number: Range of Prime Number

Sieve of Eratosthenes: is an efficient method to finding prime number
*/

package Efficient_Program.Prime_Number;

import java.util.ArrayList;
import java.util.Collections;

public class Range_of_Prime {

    public static void primeNumber(ArrayList<Integer> prime, int start, int end) {
        ArrayList<Boolean> isPrime = new ArrayList<>(Collections.nCopies(end + 1, Boolean.TRUE));
        for (int i = 2; i * i <= end; i++) {
            if (isPrime.get(i)) {
                for (int j = i * i; j < end + 1; j += i) {
                    isPrime.set(j, false);
                }
            }
        }

        for (int i = start >= 2 ? start : 2; i <= end; i++) {
            if (isPrime.get(i)) {
                prime.add(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<>();
        primeNumber(prime, 1, 30);

        for (int num : prime) {
            System.out.print(num + " ");
        }
    }
}