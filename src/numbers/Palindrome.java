package numbers;

public class Palindrome {
    public static void main(String[] args) {
        palindrome(-323);
    }

    public static void palindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        if (reversedNumber == originalNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
