#include <bits/stdc++.h>
using namespace std;

void insertElement(int arr[], int &size, int capacity, int position , int value) {
    if(size >= capacity) {
        cout << "Array is full. Cannot insert element" << endl;
        return;
    }

    if(position < 0 || position > size) {
        cout << "Invalid position. Cannot insert element" << endl;
        return;
    }

    for(int i = size; i > position; i--) {
        arr[i] = arr[i - 1];
    }

    arr[position] = value;
    size++;
    cout << "Element inserted successfully" << endl;
}

void deleteElement(int arr[], int &size, int position) {
    if(size == 0) {
        cout << "Array is empty. Element connot delete" << endl;
        return;
    }

    if(position < 0 || position >= size) {
        cout << "Invalid position. Element cannot delete" << endl;
        return;
    }

    for(int i=position; i<size; i++) {
        arr[i] = arr[i+1];
    }

    size--;

    cout << "Element deleted successfully" << endl; 
}

bool isFound(int arr[], int size, int value) {
    for(int i=0; i<size; i++) {
        if(arr[i] == value) {
            return true;
        }
    }
    
    return false;
}

int main() {

    //[1] Create Array:- way 1: Initialize at the declaration time
    int arr[] = {2, 3, 4};

    // // Array size 
    // int size = sizeof(arr) / sizeof(arr[0]);
    // cout << size << endl;
    
    // way 2: Initialize each element
    int arr2[3];
    arr2[0] = 2;
    arr2[1] = 3;
    arr2[2] = 4;
    
    // // way 3:
    // int n;
    // cin >> n;
    // int arr3[n];
    // for(int i = 0; i < n; i++) {
    //     cin >> arr3[i];
    // }

    // //[2]: Access Array Element:
    // cout << arr[0] << endl; // 2

    //[3]: Update Array Element:
    arr[0] = 10;

    //[4]: Insert Array Element:
    int capacity = 10;
    int arr4[capacity];
    int size = 0;
    insertElement(arr4, size, capacity, 0, 10);
    insertElement(arr4, size, capacity, 1, 20);
    insertElement(arr4, size, capacity, 2, 30);
    for(int i=0; i<size; i++) {
        cout << arr4[i] << " ";
    }
    
    //[5]: Eelete Array Element:
    deleteElement(arr4, size, 1);
    for(int i=0; i<size; i++) {
        cout << arr4[i] << " ";
    }
    cout << endl;

    // [6]: Search Element
    int item = 10;
    if(isFound(arr4, size, item)) {
        cout << item << " is found in the array" << endl;
    } else {
        cout << item << " is not found" << endl;
    }

    // [7] Sort Array
    arr4[2] = 90;
    arr4[3] = 60;
    arr4[4] = 80;
    arr4[5] = 70;
    arr4[6] = 40;
    arr4[7] = 20;
    arr4[8] = 50;
    arr4[9] = 0;
    size = sizeof(arr4) / sizeof(arr4[0]);

    for(int i=0; i<size-1; i++) {       // bubble sort algorithm
        for(int j = 0; j < size - i - 1; j++) {
            if(arr4[j] > arr4[j+1]) {
                int temp = arr4[j];
                arr4[j] = arr4[j+1];
                arr4[j+1] = temp;
            }
        }
    }

    for(int i=0; i<size; i++) {
        cout << arr4[i] << " ";
    }
    
    return 0;
}