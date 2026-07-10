package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50, 60};

        int key = 45;

        linearSearch(arr, key);
    }

    /**
     * Linear Search is a simple searching algorithm that checks each element of an array
     * one by one until the required element is found or the array ends.
     */
    static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                break;
            }
        }
        System.out.println("Element not found");
    }
}
