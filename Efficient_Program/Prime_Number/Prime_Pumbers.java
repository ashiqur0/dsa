/*
Prime Number: nth Prime, First N Prime Number

Sieve of Eratosthenes: is an efficient method to finding prime number
*/

package Efficient_Program.Prime_Number;

import java.util.ArrayList;
import java.util.Collections;

public class Prime_Pumbers {

    static int size = 1000005;

    public static void primenumber(ArrayList<Integer> prime) {
        ArrayList<Boolean> isPrime = new ArrayList<>(Collections.nCopies(size, Boolean.TRUE));
        for (int i = 2;  i * i <= size; i++) {
            if (isPrime.get(i)) {
                for (int j = i * i; j < size; j += i) {
                    isPrime.set(j, false);
                }
            }
        }
        for (int i = 2;  i < size; i++) {
            if (isPrime.get(i)) {
                prime.add(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<>();
        primenumber(prime);
        for (int i = 0; i < 10; i++) {
            System.out.print(prime.get(i) + " ");
        }
    }
}
