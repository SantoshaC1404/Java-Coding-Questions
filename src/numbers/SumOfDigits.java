package numbers;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 210;
        int sumOfDigits = sumOfDigits(num);
        System.out.println("The sum of the digits of : " + num + " is : " + sumOfDigits);
    }

    public static int sumOfDigits(int number) {
        if (number <= 0) {
            return 0;
        }
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
