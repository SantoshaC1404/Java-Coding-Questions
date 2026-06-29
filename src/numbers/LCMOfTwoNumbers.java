package numbers;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        findLCM(12, 18);
    }

    //  find GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //  Find LCM
    static void findLCM(int num1, int num2) {
        int lcm = (num1 * num2) / gcd(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
