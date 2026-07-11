package algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.println("=====Bubble Sort of Unsorted Array=====");
        printArray(arr);
    }

    /**
     * Bubble Sort is a simple sorting algorithm that repeatedly compares
     * two adjacent elements and swaps them if they are in the wrong order.
     * This process continues until the array is sorted.
     * <p>
     * The largest element "bubbles up" to the end of the array after each pass.
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Print array elements
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
