package strings;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("Hello World");
    }

    public static void reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Input String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
