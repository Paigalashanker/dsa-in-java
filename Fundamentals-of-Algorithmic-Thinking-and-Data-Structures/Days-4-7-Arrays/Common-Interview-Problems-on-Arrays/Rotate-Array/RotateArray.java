
import java.util.Scanner;

public class RotateArray {

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

        System.out.print("Enter number of positions to rotate right: ");
        int k = sc.nextInt();

        // --- Normalize k ---
        k = k % n;

        // --- Reverse-based rotation ---
        reverse(arr, 0, n - 1);      // Step 1: reverse entire array
        reverse(arr, 0, k - 1);      // Step 2: reverse first k elements
        reverse(arr, k, n - 1);      // Step 3: reverse remaining elements

        // --- Display result ---
        System.out.print("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }

    // Helper method to reverse a portion of the array
    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
