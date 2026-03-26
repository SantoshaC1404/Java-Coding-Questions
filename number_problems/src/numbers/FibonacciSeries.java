package numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacciSeries(7);
        System.out.println();

        int nthFibonacci = nthFibonacci(7);
        System.out.println("nth Fibonacci: " + nthFibonacci);
    }

    // Print first n Fibonacci numbers
    public static void printFibonacciSeries(int number) {
        int firstTerm = 0, secondTerm = 1;
        for (int i = 0; i < number; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    // Nth Fibonacci (0-indexed)
    public static int nthFibonacci(int number) {
        int firstTerm = 0, secondTerm = 1;
        if (number <= 1) {
            return number;
        }
        for (int i = 2; i <= number; i++) {
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return secondTerm;
    }

}
