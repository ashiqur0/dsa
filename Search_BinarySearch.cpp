#include <bits/stdc++.h>
using namespace std;
int binarySearch(int arr[], int target) {
    int start = 0, end = sizeof(arr) / sizeof(arr[0]) - 1;
    
    while(start <= end){
        int mid = (start + end) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(target < arr[mid]) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}
int main() {

    int arr[] = {1, 2, 3, 4, 5, 6, 7 };
    int target = 4;

    int result = binarySearch(arr, target);
    if(result != -1) {
        cout << target << " found at index " << result << endl;
    } else {
        cout << target << " not found" << endl;
    }

    return 0;
}