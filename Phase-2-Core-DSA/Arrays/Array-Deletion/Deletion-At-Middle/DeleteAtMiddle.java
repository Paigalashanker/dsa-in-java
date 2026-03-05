
import java.util.Scanner;

public class DeleteAtMiddle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the index to delete (0 to " + (n - 1) + "): ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
        } else {
            System.out.println("\nArray before deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // Shift elements to the left from the given index
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // reduce the count

            System.out.println("\nArray after deleting element at index " + index + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
