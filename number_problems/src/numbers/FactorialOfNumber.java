package numbers;

public class FactorialOfNumber {
    public static void main(String[] args) {
        long factorial = factorial(4);
        System.out.println("Factorial is: " + factorial);

        long factorialWithRecursion = factorialWithRecursion(6);
        System.out.println("Factorial with recursion: " + factorialWithRecursion);
    }

    public static long factorial(int number) {
        int factorial = 1;
        if (number <= 0) return 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long factorialWithRecursion(int number) {
        if (number == 0 || number == 1) return 1;
        return number * factorial(number - 1);
    }
}
