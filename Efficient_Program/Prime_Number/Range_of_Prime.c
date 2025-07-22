/*
Prime Number: Range of Prime Number

Sieve of Eratosthenes: is an efficient method to finding prime number
*/

#include <stdio.h>
#include <stdbool.h>
#define START 1
#define END 12

int primeNumber(int prime[]) {
    bool isPrime[END];

    // Set all entries true
    for (int i = 0; i < END; i++) {
        isPrime[i] = true;
    }

    // Sieve of Eratosthenes
    for (int i = 2; i * i <= END; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j < END; j += i) {
                isPrime[j] = false;
            }
        }
    }

    // Collect prime
    int j = 0;
    for (int i = START >= 2 ? START : 2; i < END; i++) {
        if (isPrime[i]) {
            prime[j++] = i;
        }
    }

    return j;
}

int main() {

    int prim[END];
    int count = primeNumber(prim);

    for (int i = 0; i < count; i++) {
        printf("%d ", prim[i]);
    }

    return 0;
}