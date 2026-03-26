package numbers;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        System.out.println(countDigits(125));

//        System.out.println(power(2, 3));

        System.out.println(isArmstrong(153));
    }

    // Count digits of a number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    // Calculate power
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = result * base;
        }
        return result;
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int countDigits = countDigits(number);
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += power(digit, countDigits);
            number = number / 10;
        }
        return sum == originalNumber;
    }

}
