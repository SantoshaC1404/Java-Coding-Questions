package strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "aab";
        checkPalindrome(str);
    }

    static void checkPalindrome(String str) {
        String reversed = "";
        String originalStr = str;

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        String palindromeCheck = str.equals(reversed) ? "Palindrome" : "Not Palindrome";
        System.out.println(palindromeCheck);
    }
}
