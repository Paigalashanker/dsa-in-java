
import java.util.Scanner;

public class KadanesAlgorithm {

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

        // --- Kadane's Algorithm ---
        int maxSum = arr[0];
        int currentSum = arr[0];

        int start = 0;       // start index of the best sub-array
        int end = 0;         // end index of the best sub-array
        int tempStart = 0;   // potential new start when we reset

        for (int i = 1; i < n; i++) {
            // Decide: extend the current sub-array or start fresh?
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i;          // new sub-array starts here
            } else {
                currentSum = currentSum + arr[i];
            }

            // Update best answer if needed
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // --- Display result ---
        System.out.println("Maximum Sub-array Sum: " + maxSum);

        System.out.print("Sub-array: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
