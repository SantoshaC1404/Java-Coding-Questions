package numbers;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int number = 4;
        int factorialOfNumber = factorialOfNumber(number);
        System.out.println("Factorial of " + number + " is: " + factorialOfNumber);

        System.out.println("Factorial with Recursion: " + factorialWithRecursion(number));
    }

    public static int factorialOfNumber(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialWithRecursion(int number) {
        if (number == 0 || number == 1) return 1;
        return number * factorialWithRecursion(number - 1);
    }
}
