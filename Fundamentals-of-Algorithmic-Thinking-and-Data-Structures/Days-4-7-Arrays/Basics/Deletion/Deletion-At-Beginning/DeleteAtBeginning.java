
import java.util.Scanner;

public class DeleteAtBeginning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray before deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Shift all elements one position to the left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--; // reduce the count

        System.out.println("\nArray after deleting element at the beginning :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
