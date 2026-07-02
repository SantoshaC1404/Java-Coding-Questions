package numbers;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        findMissingNumber(arr);
    }

    static void findMissingNumber(int[] arr) {
        int number = arr.length + 1;
        int expectedSum = number * (number + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);

    }
}
