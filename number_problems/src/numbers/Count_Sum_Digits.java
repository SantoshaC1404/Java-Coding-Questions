package numbers;

public class Count_Sum_Digits {
    public static void main(String[] args) {
        int number = 12345;
        int count = countDigits(number);
        int sum = sumDigits(number);
        System.out.println("Count of digits: " + count);
        System.out.println("Sum of digits: " + sum);
    }

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10; // Remove the last digit
            count++;
        }
        return count;
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }
        return sum;
    }
}
