
import java.util.Scanner;

public class FrequencyCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // --- Count frequency of each character using ASCII indices ---
        int[] freq = new int[256];   // covers all extended ASCII characters

        for (int i = 0; i < input.length(); i++) {
            freq[(int) input.charAt(i)]++;
        }

        // --- Display result ---
        System.out.println("Character frequencies in \"" + input + "\":");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println("  '" + (char) i + "' -> " + freq[i]);
            }
        }

        sc.close();
    }
}
