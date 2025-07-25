/*
Array: Search in an Array
Search: Linear Search:

Time Complexity: O(log(n))
Space complexity: O(1)
*/

package Data_Structure.Array;

public class LinearSearch {

    public static boolean search(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 8, 4, 7, 5 , 6, 23};
        int target = 12;
        
        if (search(arr, target)) {
            System.out.println(target + " is found.");
        } else {
            System.out.println(target + " is not found.");
        }
    }
}
