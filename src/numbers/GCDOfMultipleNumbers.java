package numbers;

public class GCDOfMultipleNumbers {
    public static void main(String[] args) {
        int[] arr = {24, 36, 60, 84};
        findGcd(arr);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static void findGcd(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        System.out.println("GCD of two numbers is " + result);
    }
}
