/*
Prime Number: nth Prime, First N Prime Number

Sieve of Eratosthenes: is an efficient method to finding prime number
*/

#include <stdio.h>
#include <stdbool.h>
#define SIZE 10

int primeNumber(int prime[]) {
    bool isPrime[SIZE];

    // Set all entries to true
    for (int i = 0; i < SIZE; i++) {
        isPrime[i] = true;
    }

    // Sieve of Eratosthenes
    for (int i = 2; i * i <= SIZE; i++) {
		if (isPrime[i]) {
			for (int j = i * i; j < SIZE; j += i) {
				isPrime[j] = false;
			}
		}
	}

    // collect prime numbers
    int j = 0;
	for (int i = 2; i < SIZE; i++) {
		if (isPrime[i]) {
			prime[j++] = i;
		}
	}

    return j;
}

int main() {

    int prime[SIZE];
    int count = primeNumber(prime);

    for (int i = 0; i < count; i++) {
        printf("%d ", prime[i]);
    }

    return 0;
}