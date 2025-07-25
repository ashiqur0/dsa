/*
Array: Search in an Array
Search: Binary Search

Time Complexity: O(log(n))
Space Complexity: O(1)
*/

package Data_Structure.Array;

public class BinarySearch {

    public static boolean search(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        while (left <= right) {
            int mid = (left + right ) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2 , 6, 19, 21, 32, 56, 86, 98};
        
        if (search(arr, 56)) {
            System.out.println("target found");
        } else {
            System.out.println("target not found");
        }
    }
}
