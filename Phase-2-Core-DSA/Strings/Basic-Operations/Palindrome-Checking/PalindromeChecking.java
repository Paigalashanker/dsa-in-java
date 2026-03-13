
import java.util.Scanner;

public class PalindromeChecking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // --- Normalize: lowercase, strip non-alphanumeric characters ---
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // --- Two-pointer palindrome check ---
        int left = 0;
        int right = cleaned.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // --- Display result ---
        System.out.println("Original : " + input);
        System.out.println("Cleaned  : " + cleaned);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" IS a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}
