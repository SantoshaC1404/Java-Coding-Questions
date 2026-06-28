package numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        checkPrime(2);
    }

    public static void checkPrime(int number) {
        if (number < -1) {
            System.out.println(number + " is not a prime number.");
            return;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");
                    return;
                }
            }
            System.out.println(number + " is a prime number.");
        }
    }
}
