package numbers;

public class PerfectNumber {
    public static void main(String[] args) {
        checkPerfectNumber(28);
    }

    /**
     * A Perfect Number is a number that is equal to the
     * sum of its proper divisors (excluding the number itself).
     * <p>
     * 6 = 1 + 2 + 3 → Perfect Number
     * 28 = 1 + 2 + 4 + 7 + 14 → Perfect Number
     * 12 = 1 + 2 + 3 + 4 = 10 → Not a Perfect Number
     */

    static void checkPerfectNumber(int number) {
        int sum = 0;

        if (number <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }
    }
}
