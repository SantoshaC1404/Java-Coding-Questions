package strings;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        countVowelsAndConsonants("Hello World");
    }

    public static void countVowelsAndConsonants(String input) {
        input = input.toLowerCase();
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Vowels count: " + vowelsCount);
        System.out.println("Consonants count: " + consonantsCount);
    }
}
