package numbers;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calling methods
        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);

        scanner.close();
    }

    // Method to find GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Method to find LCM
    public static int findLCM(int a, int b) {
        int gcd = findGCD(a, b);
        return (a / gcd) * b;
    }

    // Recursive GCD
    /*
    static int gcdRec(int a, int b) {
        return b == 0 ? a : gcdRec(b, a % b);
    }
    */

}
