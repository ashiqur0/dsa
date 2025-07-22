/*
Bubble Sort: Sort Array Elements

Time Complexity: Ω(n), Θ(n^2), O(n^2)
Space Complexity: O(1)
*/

package Algorithm.Sorting_Algorithm.Bubble_Sort;

public class Bubble_Sort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; 
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 0, 3, 6, 2, 1, 7, 4, 5};

        System.out.print("Before Sorting: ");
        printArray(arr);

        sort(arr);
        
        System.out.print("After Sorting: ");
        printArray(arr);
    }
}
