package strings;

public class CheckAnagram {
    public static void main(String[] args) {
        checkAnagram("listen", "silent");    // Anagrams
        //  checkAnagram("hello", "world");
    }

    /**
     * Two strings are anagrams if they contain the same characters with the same frequency,
     * but the characters can be in a different order.
     * Examples:
     * listen and silent → Anagram
     * triangle and integral → Anagram
     * hello and world → Not Anagram
     */
    public static void checkAnagram(String input1, String input2) {
        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        // Check length
        if (input1.length() != input2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] count = new int[26];
        // Count Characters
        for (int i = 0; i < input1.length(); i++) {
            count[input1.charAt(i) - 'a']++;
            count[input2.charAt(i) - 'a']--;
        }

        // Check counts
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
