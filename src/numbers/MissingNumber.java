package numbers;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        findMissingNumber(arr);

        System.out.println("\n========== Missing Number using XOR ==========");
        findMissingNumberUsingXOR(arr);
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

    static void findMissingNumberUsingXOR(int[] arr) {
        int xor1 = 0;
        int xor2 = 0;
        int number = arr.length + 1;

        // XOR of numbers from 1 to number
        for (int i = 1; i <= number; i++) {
            xor1 = xor1 ^ i;
        }

        // XOR or array elements
        for (int j : arr) {
            xor2 = xor2 ^ j;
        }

        // Missing number
        int missingNumber = xor1 ^ xor2;
        System.out.println("Missing number: " + missingNumber);
    }
}
