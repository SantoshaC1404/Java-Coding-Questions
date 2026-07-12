package algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Selection Sort");

        selectionSort(arr);     //  11 12 22 25 64

        // Print array elements
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /**
     * Selection Sort is a simple sorting algorithm that repeatedly finds the
     * smallest element from the unsorted part of the array and places it at the beginning.
     * <p>
     * Unlike Bubble Sort, Selection Sort makes only one swap per pass.
     * <p>
     * Algorithm
     * Assume the first unsorted element is the smallest.
     * Compare it with all the remaining elements.
     * Find the smallest element.
     * Swap it with the first unsorted element.
     * Repeat for the remaining array until it is sorted.
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume the current element is the minimum
            int minIndex = i;

            // Find the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
