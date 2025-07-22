/*
Prime Number: Range of Prime Number

Sieve of Eratosthenes: is an efficient method to finding prime number
*/

#include <stdio.h>
#include <stdbool.h>

int primeNumber(int prime[], int start, int end) {
    bool isPrime[end + 1];

    // Set all entries true
    for (int i = 0; i < end + 1; i++) {
        isPrime[i] = true;
    }

    // Sieve of Eratosthenes
    for (int i = 2; i * i <= end + 1; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j < end + 1; j += i) {
                isPrime[j] = false;
            }
        }
    }

    // Collect prime
    int j = 0;
    for (int i = start >= 2 ? start : 2; i < end + 1; i++) {
        if (isPrime[i]) {
            prime[j++] = i;
        }
    }

    return j;
}

int main() {

    int start = 1, end = 12;
    int prim[end];
    int count = primeNumber(prim, start, end);

    for (int i = 0; i < count; i++) {
        printf("%d ", prim[i]);
    }

    return 0;
}