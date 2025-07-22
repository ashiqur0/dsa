/*
Bubble Sort: Sort Array Elements

Time Complexity: Ω(n), Θ(n^2), O(n^2)
Space Complexity: O(1)
*/

#include <bits/stdc++.h>
using namespace std;

void sort(int arr[], int size) {
    for(int i = 0; i < size - 1; i++) {
        for(int j = 0; j < size - i - 1; j++) {
            if(arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void printArray(int arr[], int size) {
    for(int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
}

int main() {
    
    int arr [] = {9, 8, 0, 3, 6, 2, 1, 7, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Before Sorting: ";
    printArray(arr, size);

    sort(arr, size);
    
    cout << "\nAfter Sorting: ";
    printArray(arr, size);

  return 0;
}