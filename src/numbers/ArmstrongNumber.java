package numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
        checkArmstrongNumber(153);
    }

    /**
     * An Armstrong Number is a number that is equal to the sum of its digits,
     * where each digit is raised to the power of the number of digits.
     * 153 = 1³ + 5³ + 3³ = 153 → Armstrong Number
     * 370 = 3³ + 7³ + 0³ = 370 → Armstrong Number
     * 371 = 3³ + 7³ + 1³ = 371 → Armstrong Number
     * 9474 = 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474 → Armstrong Number
     */

    static void checkArmstrongNumber(int number) {
        int original = number;
        int sum = 0;
        int digits = 0;
        int temp = number;

        // Count number of digits
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = number;

        // Calculate the sum of digits raised to the power of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum = (int) (sum + Math.pow(digit, digits));
            temp = temp / 10;
        }

        if (original == sum) {
            System.out.println(number + " Is Armstrong Number");
        } else {
            System.out.println(number + " Is Not Armstrong Number");
        }
    }
}
