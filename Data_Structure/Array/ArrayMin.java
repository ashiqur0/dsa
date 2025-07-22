/*
Array: Find Minimum Value in Array
*/

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 8, 4, 7, 5 , 6, 23};
        int minValue = arr[0];

        for (int value : arr) {
            minValue = Math.min(minValue, value);
        }

        System.out.println("Minimum value: " + minValue);
    }
}