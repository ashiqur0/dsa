/*
Search: Linear Search Algorithm

Time Complexity: O(n)
Space Complexity: O(1)
*/

package Algorithm.Searchin_Algorithm.Linear_Search;

public class Linear_Search {

    public static boolean linear_Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7 };

        System.out.println((linear_Search(arr, 5) ? "Found" : "Not Found"));
        System.out.println((linear_Search(arr, 50) ? "Found" : "Not Found"));
    }
}
