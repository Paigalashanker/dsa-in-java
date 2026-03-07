
import java.util.Scanner;

public class ConditionalTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even elements in the array:");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("No even elements found.");
        }
        System.out.println();

        sc.close();
    }
}
