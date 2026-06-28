package numbers;

public class OddOrEven {
    public static void main(String[] args) {
        String s = checkNumberOddOrEven(-18);
        System.out.println(s);
    }

    public static String checkNumberOddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
