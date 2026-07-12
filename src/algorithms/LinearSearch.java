package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50, 60};

        int key = 50;

        linearSearch(arr, key);
    }

    /**
     * Linear Search is a simple searching algorithm that checks each element of an array
     * one by one until the required element is found or the array ends.
     */
    static void linearSearch(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        } else {
            System.out.println("Found");
        }
    }
}
