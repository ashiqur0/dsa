#include <iostream>
using namespace std;

// Function to insert an element into the array
void insertElement(int arr[], int& size, int capacity, int position, int value) {
    if (size >= capacity) {
        cout << "Array is full. Cannot insert element." << endl;
        return;
    }
    if (position < 0 || position > size) {
        cout << "Invalid position. Cannot insert element." << endl;
        return;
    }

    // Shift elements to the right to make space
    for (int i = size; i > position; i--) {
        arr[i] = arr[i - 1];
    }

    // Insert the new value
    arr[position] = value;
    size++;
    cout << "Element inserted successfully." << endl;
}

// Function to delete an element from the array
void deleteElement(int arr[], int& size, int position) {
    if (size == 0) {
        cout << "Array is empty. Cannot delete element." << endl;
        return;
    }
    if (position < 0 || position >= size) {
        cout << "Invalid position. Cannot delete element." << endl;
        return;
    }

    // Shift elements to the left to fill the gap
    for (int i = position; i < size - 1; i++) {
        arr[i] = arr[i + 1];
    }

    size--;
    cout << "Element deleted successfully." << endl;
}

// Function to display the array
void displayArray(const int arr[], int size) {
    if (size == 0) {
        cout << "Array is empty." << endl;
        return;
    }
    cout << "Array elements: ";
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    const int capacity = 100; // Maximum capacity of the array
    int arr[capacity];        // Array declaration
    int size = 0;             // Current size of the array

    // Insert elements
    insertElement(arr, size, capacity, 0, 10); // Insert 10 at position 0
    insertElement(arr, size, capacity, 1, 20); // Insert 20 at position 1
    insertElement(arr, size, capacity, 1, 15); // Insert 15 at position 1
    displayArray(arr, size);

    // Delete elements
    deleteElement(arr, size, 1); // Delete element at position 1
    displayArray(arr, size);

    // Try invalid operations
    insertElement(arr, size, capacity, 10, 30); // Invalid position
    deleteElement(arr, size, 5);                // Invalid position

    return 0;
}
