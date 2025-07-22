/*
Prime Number: Range of Prime Number

Sieve of Eratosthenes: is an efficient method to finding prime number
*/

#include <iostream>
#include <vector>
using namespace std;

void primeNumbers(vector<int>& prime, int start, int end) {

    // initialize all elements as true
    vector<bool> isPrime(end + 1, true);
        
    // Sieve of Eratosthenes
    for (int i = 2; i * i <= end + 1; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j < end + 1; j += i) {
                isPrime[j] = false; 
            }
        }
    }

    // Collect prime
    for (int i = start >= 2 ? start : 2; i < end + 1; i++) {
        if (isPrime[i]) {
            prime.push_back(i);
        }
    }
}

int main() {

    vector<int> prime;
    int start = 1, end = 10;
    primeNumbers(prime, start, end);

    for (int p : prime) {
        cout << p << " ";
    }

    return 0;
}