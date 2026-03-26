package numbers;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));

    }

    public static boolean isPrime(int number) {
        if (number <= 2) return false;
        if (number % 2 == 0) return false;

        int i = 2;
        while (i * i <= number) {
            if (number % i == 0) return false;
            i++;
        }
        return true;
    }

}
