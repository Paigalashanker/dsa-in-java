
import java.util.Scanner;

public class PrefixSum {

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

        // --- Build the prefix-sum array ---
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // --- Display the prefix-sum array ---
        System.out.print("Prefix Sum Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();

        // --- Answer range-sum queries ---
        System.out.print("\nEnter number of queries: ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.print("Enter left and right index (0-based): ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum;
            if (l == 0) {
                sum = prefix[r];
            } else {
                sum = prefix[r] - prefix[l - 1];
            }

            System.out.println("Sum of arr[" + l + ".." + r + "] = " + sum);
        }

        sc.close();
    }
}
