
public class FindUniqueElement {

    // Method 1: Using XOR (Most Efficient)
    // XOR Properties: a^a = 0, a^0 = a, XOR is commutative and associative
    // Time: O(n), Space: O(1)
    public static int findUniqueXOR(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

    // Method 2: Using HashMap frequency count
    // Time: O(n), Space: O(n)
    public static int findUniqueHashMap(int[] arr) {
        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find unique element
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }

    // Method 3: Using sorting
    // Time: O(n log n), Space: O(1) if we consider sorting in-place
    public static int findUniqueSorting(int[] arr) {
        java.util.Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    // Extended: Find single number when all others appear 3 times
    // Only XOR doesn't work, we need bit counting
    public static int findUniqueTimes3(int[] arr) {
        int[] bitCount = new int[32];

        // Count set bits at each position
        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }

        int result = 0;
        // Reconstruct the number
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }

    // Extended: Find two unique numbers when all others appear twice
    // Time: O(n), Space: O(1)
    public static void findTwoUnique(int[] arr) {
        // XOR all elements
        int xorAll = 0;
        for (int num : arr) {
            xorAll ^= num;
        }

        // Find a set bit (any set bit will do)
        int setBit = xorAll & -xorAll;

        // Partition elements into two groups based on the set bit
        int num1 = 0, num2 = 0;
        for (int num : arr) {
            if ((num & setBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        System.out.println("Two unique numbers: " + num1 + " and " + num2);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("===== FIND UNIQUE ELEMENT =====\n");

        // Test Case 1: Basic example
        int[] arr1 = {2, 4, 2, 3, 4};
        System.out.println("Test Case 1:");
        printArray(arr1);
        System.out.println("Unique element (XOR): " + findUniqueXOR(arr1));
        System.out.println("Unique element (HashMap): " + findUniqueHashMap(arr1));
        System.out.println("Unique element (Sorting): " + findUniqueSorting(arr1.clone()));
        System.out.println();

        // Test Case 2
        int[] arr2 = {1, 1, 2, 2, 3};
        System.out.println("Test Case 2:");
        printArray(arr2);
        System.out.println("Unique element (XOR): " + findUniqueXOR(arr2));
        System.out.println();

        // Test Case 3
        int[] arr3 = {5, 5, 7, 5, 7, 7};
        System.out.println("Test Case 3:");
        printArray(arr3);
        System.out.println("Unique element (XOR): " + findUniqueXOR(arr3));
        System.out.println();

        // Test Case 4: Single element
        int[] arr4 = {42};
        System.out.println("Test Case 4:");
        printArray(arr4);
        System.out.println("Unique element (XOR): " + findUniqueXOR(arr4));
        System.out.println();

        System.out.println("===== EXTENDED PROBLEMS =====\n");

        // Unique number appearing once when others appear 3 times
        System.out.println("Find unique when others appear 3 times:");
        int[] arr5 = {1, 1, 1, 2, 3, 3, 3};
        printArray(arr5);
        System.out.println("Unique element: " + findUniqueTimes3(arr5));
        System.out.println();

        // Find two unique numbers
        System.out.println("Find two unique numbers when others appear twice:");
        int[] arr6 = {1, 2, 1, 3, 2, 5};
        printArray(arr6);
        findTwoUnique(arr6);
        System.out.println();

        // Detailed example showing XOR operations
        System.out.println("===== DETAILED XOR EXPLANATION =====\n");
        int[] arr7 = {4, 4, 7, 7, 3};
        System.out.println("Array: [4, 4, 7, 7, 3]");
        System.out.println("Operations:");

        int result = 0;
        for (int num : arr7) {
            int prevResult = result;
            result ^= num;
            System.out.println(prevResult + " ^ " + num + " = " + result);
        }

        System.out.println("\nUnique element: " + result);
        System.out.println();

        // Performance test
        System.out.println("===== PERFORMANCE COMPARISON =====\n");
        int[] largeArr = new int[1000000];
        for (int i = 0; i < largeArr.length - 1; i += 2) {
            largeArr[i] = i / 2;
            largeArr[i + 1] = i / 2;
        }
        largeArr[largeArr.length - 1] = 999999; // Unique element

        // XOR Method
        long startTime = System.nanoTime();
        int res1 = findUniqueXOR(largeArr);
        long xorTime = System.nanoTime() - startTime;

        // HashMap Method
        startTime = System.nanoTime();
        int res2 = findUniqueHashMap(largeArr);
        long hashTime = System.nanoTime() - startTime;

        System.out.println("Array size: " + largeArr.length);
        System.out.println("XOR Method: Result = " + res1 + ", Time = " + xorTime + " ns");
        System.out.println("HashMap Method: Result = " + res2 + ", Time = " + hashTime + " ns");
        System.out.println("XOR is " + (double) hashTime / xorTime + "x faster");
    }
}
