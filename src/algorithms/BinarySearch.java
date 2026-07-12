package algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = 50;
        binarySearch(arr, key);     // Element found at index: 4

        System.out.println("\n=====Binary Search of Unsorted Array=====");
        binarySearchOfUnsortedArray(arr, key);      // Element found at index: 4
    }

    /**
     * Binary Search is a searching algorithm that finds an element in a sorted array
     * by repeatedly dividing the search range into half.
     * Important: Binary Search works only on sorted arrays.
     * <p>
     * Compare the middle element with the key.
     * <p>
     * If equal → Element found.
     * If key is smaller → Search the left half.
     * If key is larger → Search the right half.
     */
    public static void binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Element not found");
    }

    // Binary search of unsorted array
    static void binarySearchOfUnsortedArray(int[] arr, int key) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
}
