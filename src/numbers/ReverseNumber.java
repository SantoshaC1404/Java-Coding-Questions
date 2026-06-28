package numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(23);
    }

    public static void reverseNumber(int number) {
        int reversedNumber = 0;
        System.out.println("Original number: " + number);
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }
}
