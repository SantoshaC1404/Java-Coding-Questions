package numbers;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(checkOddOrEven(90));
    }

    private static String checkOddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
