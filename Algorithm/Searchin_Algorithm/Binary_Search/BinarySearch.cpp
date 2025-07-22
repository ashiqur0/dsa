/*
Search: Binary Search Algorithm

Time Complexity: O(n)
Space Complexity: O(1)
*/

// #include <bits/stdc++.h>
#include <iostream>
#include <vector>
using namespace std;

int binarySearch(vector<int> arr, int target) {
    int left = 0;
    int right = arr.size() - 1;

    while(left <= right) {
        int mid = (left + right) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}

int main() {

    vector<int> arr = {1, 2, 3, 4, 5, 6, 7 };
    int target = 4;

    cout << (binarySearch(arr, target) ? "Found" : "Not Found") << endl; 
    return 0;
}