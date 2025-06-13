// Sieve method of finding prime numbers

#include <bits/stdc++.h>
using namespace std;
#define MAX_SIZE 1000005

void SieveOfEratosthenes(vector<int>& primes) {
	bool IsPrime[MAX_SIZE];
	fill(begin(IsPrime), end(IsPrime), true);
	for (int i = 2; i * i <= MAX_SIZE; i++) {
		if (IsPrime[i] == true) {
			for (int j = i * i; j < MAX_SIZE; j += i) {
				IsPrime[j] = false;
			}
		}
	}

	for (int i = 2; i < MAX_SIZE; i++) {
		if (IsPrime[i]) {
			primes.push_back(i);
		}
	}
}

int main() {
	vector<int> primes;
	SieveOfEratosthenes(primes);

	int n = 10;
	for (int i = 0; i <= n; i++) {
		cout << primes[i] << " ";
	}
	cout << endl;

	return 0;
}