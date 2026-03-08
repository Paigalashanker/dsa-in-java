
import java.util.Scanner;

public class SlidingWindow {

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

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        // --- Compute sum of the first window ---
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        int bestStart = 0;   // start index of best window

        // --- Slide the window one position at a time ---
        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
                bestStart = i - k + 1;
            }
        }

        // --- Display result ---
        System.out.println("Maximum sum of a sub-array of size " + k + ": " + maxSum);

        System.out.print("Window: [");
        for (int i = bestStart; i < bestStart + k; i++) {
            System.out.print(arr[i]);
            if (i < bestStart + k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
