// Binary Search Algorithm

#include <bits/stdc++.h>
using namespace std;
int binarySearch(int arr[], int size, int target) {
    int left = 0;
    int right = size - 1;
    while(left <= right) {
        int mid = (left + right) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}

int main() {

    int arr[] = {1, 2, 3, 4, 5, 6, 7 };
    int target = 4;
    int size = sizeof(arr) / sizeof(arr[0]);
    int result = binarySearch(arr, size, target);
    if(result != -1) {
        cout << target << " found at index " << result << endl;
    } else {
        cout << target << " not found" << endl;
    }

    return 0;
}