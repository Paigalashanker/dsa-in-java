
import java.util.Scanner;

public class InsertAtMiddle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index to insert (0 to " + n + "): ");
        int index = sc.nextInt();
        if (index < 0 || index > n) {
            System.out.println("Invalid index.");
            sc.close();
            return;
        }

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        n++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
