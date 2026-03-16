
public class CountSetBits {

    // Method 1: Simple Iteration - Count set bits by checking each bit
    // Time Complexity: O(log n) where n is the number
    public static int countSetBitsMethod1(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    // Method 2: Right Shift and AND with 1
    // Time Complexity: O(log n)
    public static int countSetBitsMethod2(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n = n >> 1;
        }
        return count;
    }

    // Method 3: Brian Kernighan's Algorithm
    // Only iterates as many times as there are set bits
    // Time Complexity: O(k) where k is the number of set bits
    public static int countSetBitsKernighan(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);  // Clears the lowest set bit
            count++;
        }
        return count;
    }

    // Method 4: Using built-in function
    public static int countSetBitsBuiltIn(int n) {
        return Integer.bitCount(n);
    }

    // Method 5: Lookup table approach (for small numbers)
    // Time Complexity: O(1) with O(256) space
    private static int[] lookupTable = new int[256];

    static {
        // Initialize lookup table
        for (int i = 0; i < 256; i++) {
            lookupTable[i] = countSetBitsMethod1(i);
        }
    }

    public static int countSetBitsLookupTable(int n) {
        int count = 0;
        while (n > 0) {
            count += lookupTable[n & 0xFF];
            n >>>= 8;
        }
        return count;
    }

    // Count set bits from 1 to n
    public static int countSetBitsFrom1ToN(int n) {
        if (n <= 0) {
            return 0;
        }

        int count = 0;
        int powerOf2 = 1;

        while (powerOf2 <= n) {
            // Total pairs of 0s and 1s
            int completePairs = (n + 1) / (powerOf2 * 2);
            count += completePairs * powerOf2;

            // Remaining 1s
            int remainder = (n + 1) % (powerOf2 * 2);
            if (remainder > powerOf2) {
                count += remainder - powerOf2;
            }

            powerOf2 *= 2;
        }

        return count;
    }

    // Display binary representation
    public static String getBinaryString(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        System.out.println("===== COUNT SET BITS =====\n");

        int testNumbers[] = {5, 12, 15, 7, 100};

        for (int num : testNumbers) {
            System.out.println("Number: " + num + " (Binary: " + getBinaryString(num) + ")");
            System.out.println("Method 1 (Simple Iteration): " + countSetBitsMethod1(num));
            System.out.println("Method 2 (Right Shift): " + countSetBitsMethod2(num));
            System.out.println("Method 3 (Kernighan): " + countSetBitsKernighan(num));
            System.out.println("Method 4 (Built-in): " + countSetBitsBuiltIn(num));
            System.out.println("Method 5 (Lookup Table): " + countSetBitsLookupTable(num));
            System.out.println();
        }

        System.out.println("===== COUNT SET BITS FROM 1 TO N =====\n");

        int[] ranges = {5, 10, 15, 20};
        for (int n : ranges) {
            System.out.println("Count set bits from 1 to " + n + ": " + countSetBitsFrom1ToN(n));
        }

        System.out.println();

        // Detailed example
        System.out.println("===== DETAILED EXAMPLE =====\n");
        int num = 12; // Binary: 1100
        System.out.println("Number: " + num + " (Binary: " + getBinaryString(num) + ")");

        System.out.println("\nStep-by-step (Simple Iteration):");
        int temp = num;
        int step = 1;
        while (temp > 0) {
            System.out.println("Step " + step + ": " + getBinaryString(temp) + " & 1 = " + (temp & 1));
            temp >>= 1;
            step++;
        }

        System.out.println("\nResult: Set bits = " + countSetBitsMethod1(num));

        System.out.println();

        // Brian Kernighan Detailed
        System.out.println("===== KERNIGHAN'S ALGORITHM DETAIL =====\n");
        temp = 12; // Binary: 1100
        int count = 0;
        System.out.println("Original: " + getBinaryString(temp) + " = " + temp);

        while (temp > 0) {
            count++;
            temp = temp & (temp - 1);
            System.out.println("Step " + count + ": " + (temp > 0 ? getBinaryString(temp) + " = " + temp : "0"));
        }

        System.out.println("Total set bits: " + count);

        System.out.println();

        // Performance comparison
        System.out.println("===== TIME COMPLEXITY COMPARISON =====\n");
        int largeNum = Integer.MAX_VALUE;

        long startTime = System.nanoTime();
        int result1 = countSetBitsMethod2(largeNum);
        long method1Time = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        int result2 = countSetBitsKernighan(largeNum);
        long method2Time = System.nanoTime() - startTime;

        System.out.println("Simple Iteration: " + result1 + " set bits, Time: " + method1Time + " ns");
        System.out.println("Kernighan Method: " + result2 + " set bits, Time: " + method2Time + " ns");
    }
}
