package strings;

public class StringFrequencyCount {
    public static void main(String[] args) {
        frequencyCount("programming");
    }

    public static void frequencyCount(String input) {
        int[] frequency = new int[256];

        // Count frequency
        for (int i = 0; i < input.length(); i++) {
            frequency[input.charAt(i)]++;
        }

        // Print frequency of each unique character
        for (int i = 0; i < input.length(); i++) {
            if (frequency[input.charAt(i)] != 0) {
                System.out.println(input.charAt(i) + " : " + frequency[input.charAt(i)]);
                frequency[input.charAt(i)] = 0;   // Avoid printing duplicates
            }
        }
    }
}
