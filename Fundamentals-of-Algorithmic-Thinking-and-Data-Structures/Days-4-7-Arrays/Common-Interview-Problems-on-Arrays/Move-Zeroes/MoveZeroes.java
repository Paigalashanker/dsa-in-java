
import java.util.Scanner;

public class MoveZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Read the array ---
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // --- Move non-zero elements forward ---
        int insertPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }

        // --- Fill the rest with zeroes ---
        for (int i = insertPos; i < n; i++) {
            arr[i] = 0;
        }

        // --- Display result ---
        System.out.print("After moving zeroes: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
