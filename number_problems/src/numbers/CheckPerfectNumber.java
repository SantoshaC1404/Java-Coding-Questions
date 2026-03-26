package numbers;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        int number = 28;
        boolean isPerfect = isPerfectNumber(number);
        System.out.println(number + " is a perfect number: " + isPerfect);
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false; // Perfect numbers are greater than 1
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }
        return sum == number; // A perfect number equals the sum of its proper divisors
    }
}
