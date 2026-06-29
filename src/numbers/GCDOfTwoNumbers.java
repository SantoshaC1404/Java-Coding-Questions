package numbers;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        int gcdOfTwoNumbers = gcdOfTwoNumbers(4, 8);
        System.out.println(gcdOfTwoNumbers);
    }

    public static int gcdOfTwoNumbers(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
