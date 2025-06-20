// Bubble Sort Algorithm
#include <bits/stdc++.h>
using namespace std;
int main() {

    int arr [] = {9, 8, 0, 3, 6, 2, 1, 7, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Before Sorting: ";
    for(int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
    
    for(int i = 0; i < n - 1; i++) {
        for(int j = 0; j < n - i - 1; j++) {
            if(arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    
    cout << "\nAfter Sorting: ";
    for(int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }

  return 0;
}