
import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // --- Reverse using two-pointer on a char array ---
        char[] chars = input.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String reversed = new String(chars);

        // --- Display result ---
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + reversed);

        sc.close();
    }
}
