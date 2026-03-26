package numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(27));
    }

    // Reverse number
    public static int reverseNumber(int n) {
        boolean negative = n < 0;
        int number = negative ? -n : n;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return negative ? -reversed : reversed;
    }
}
