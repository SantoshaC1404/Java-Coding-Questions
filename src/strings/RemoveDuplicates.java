package strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        removeDuplicates(input);

        System.out.println("==================");
        removeDuplicates1(input);
    }

    /**
     * Removing duplicates means keeping only the first occurrence of each character
     * and removing any repeated characters.
     * Example:
     * Input: programming
     * Output: progamin
     */
    public static void removeDuplicates(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // check if character already exist in the string
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result = result + ch;
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("After removing duplicates: " + result);
    }

    public static void removeDuplicates1(String input) {
        boolean[] visited = new boolean[256];
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                result = result + ch;
            }
        }
        System.out.println("Original String: " + input);
        System.out.println("After removing duplicates: " + result);
    }
}
