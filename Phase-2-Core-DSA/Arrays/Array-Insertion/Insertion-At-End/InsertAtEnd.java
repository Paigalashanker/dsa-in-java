
import java.util.Scanner;

public class InsertAtEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to insert at the end: ");
        int element = sc.nextInt();
        // Create a new array with one extra space        
        int[] newArr = new int[n + 1];
        // Copy the old elements to the new array        
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
            System.out.println("Copied element: " + arr[i]);

        }
        // Insert the new element at the end of the new array
        newArr[n] = element;
        System.out.println("Element inserted at the end: " + element);
        System.out.println("New array:");
        for (int i = 0; i <= n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

}
