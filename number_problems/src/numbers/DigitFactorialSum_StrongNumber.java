package numbers;

public class DigitFactorialSum_StrongNumber {
    public static void main(String[] args) {
        int number = 145;
        boolean isStrong = isStrongNumber(number);
        System.out.println(number + " is a strong number: " + isStrong);
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10; // Get the last digit
            sum += (int) factorial(digit); // Add the factorial of the digit to the sum
            temp /= 10; // Remove the last digit
        }

        return sum == number; // A strong number equals the sum of the factorials of its digits
    }

    public static long factorial(int number) {
        long factorial = 1;
        if (number <= 0) return 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
