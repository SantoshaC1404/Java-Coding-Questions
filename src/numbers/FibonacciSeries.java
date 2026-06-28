package numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Fibonacci series: ");
        fibonacciSeries(5);

        System.out.print("\nFibonacci Series using recursion: ");
        fibonacciSeries(5);

        int fibonacciSeriesOfNthTerm = fibonacciSeriesOfNthTerm(7);
        System.out.println("\nFibonacci Series of Nth Term: " + fibonacciSeriesOfNthTerm);
    }

    /**
     * Fibonacci Series of 1-N terms.
     */
    public static void fibonacciSeries(int number) {
        int first = 0, second = 1;
        for (int i = 0; i < number; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    /**
     * Fibonacci Series with Recursion
     */
    public static int fibonacciWithRecursion(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;

        return fibonacciWithRecursion(number - 1) + fibonacciWithRecursion(number - 2);
    }

    public static int fibonacciSeriesOfNthTerm(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;

        int first = 0, second = 1, next = 0;

        for (int i = 2; i <= number; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}
