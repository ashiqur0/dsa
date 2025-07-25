package Data_Structure.Array;

public class ArrayOperations {
    public static void main(String[] args) {
        // Initialize an array
        int[] arr = new int[10];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 1;
        arr[4] = 3;
        int currentSize = 5; // Tracks how many elements are actually in the array

        System.out.println("Original Array:");
        traverseArray(arr, currentSize);

        // Insert operation
        System.out.println("\nAfter inserting 10 at position 2:");
        currentSize = insertElement(arr, currentSize, 10, 2);
        traverseArray(arr, currentSize);

        // Delete operation
        System.out.println("\nAfter deleting element at position 3:");
        currentSize = deleteElement(arr, currentSize, 3);
        traverseArray(arr, currentSize);

        // Update operation
        System.out.println("\nAfter updating element at position 1 to 7:");
        updateElement(arr, currentSize, 1, 7);
        traverseArray(arr, currentSize);

        // Search operation
        System.out.println("\nSearching for element 8:");
        int position = searchElement(arr, currentSize, 8);
        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found in the array");
        }
    }

    // Method to traverse and print array elements
    public static void traverseArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to insert an element at a specific position
    public static int insertElement(int[] arr, int size, int element, int position) {
        if (size == arr.length) {
            System.out.println("Array is full. Cannot insert.");
            return size;
        }
        
        if (position < 0 || position > size) {
            System.out.println("Invalid position.");
            return size;
        }

        // Shift elements to make space for the new element
        for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = element;
        return size + 1;
    }

    // Method to delete an element at a specific position
    public static int deleteElement(int[] arr, int size, int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position.");
            return size;
        }

        // Shift elements to fill the gap
        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[size - 1] = 0; // Optional: clear the last element
        return size - 1;
    }

    // Method to update an element at a specific position
    public static void updateElement(int[] arr, int size, int position, int newValue) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position.");
            return;
        }
        arr[position] = newValue;
    }

    // Method to search for an element (linear search)
    public static int searchElement(int[] arr, int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }
}