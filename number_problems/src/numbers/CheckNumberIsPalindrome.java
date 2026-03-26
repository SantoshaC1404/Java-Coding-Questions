package numbers;

public class CheckNumberIsPalindrome {
    public static void main(String[] args) {
        int number = 12321;
        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindromes
        if (number < 0) return false;

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit
            number /= 10; // Remove the last digit
        }

        return originalNumber == reversedNumber; // Check if original and reversed are the same
    }
}
