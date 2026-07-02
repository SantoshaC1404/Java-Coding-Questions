package strings;

public class WordsCount {
    public static void main(String[] args) {
        String str = "Hello World";
        countWords(str);
    }

    static void countWords(String str) {
        int count = 0;
        if (str == null || str.isEmpty()) {
            System.out.println("Empty String");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Count a word when a non-space character
            // is at the beginning or follows a space
            if (str.charAt(i) != ' ') {
                if (i == 0 || str.charAt(i - 1) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Count: " + count);
    }
}
