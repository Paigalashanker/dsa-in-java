
public class PowerOfTwo {

    // Method 1: Using bitmask n & (n-1) == 0
    // Most efficient O(1) solution
    public static boolean isPowerOfTwoMethod1(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // Method 2: Using logarithm
    // Time: O(1)
    public static boolean isPowerOfTwoMethod2(int n) {
        if (n <= 0) {
            return false;
        }
        double log = Math.log(n) / Math.log(2);
        return log == Math.floor(log);
    }

    // Method 3: Using bit counting
    // Check if exactly one bit is set
    public static boolean isPowerOfTwoMethod3(int n) {
        if (n <= 0) {
            return false;
        }
        return Integer.bitCount(n) == 1;
    }

    // Method 4: Using repeated division by 2
    public static boolean isPowerOfTwoMethod4(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }

    // Get the power if number is power of 2, else -1
    // For example: 8 -> 3 (2^3 = 8)
    public static int getPower(int n) {
        if (!isPowerOfTwoMethod1(n)) {
            return -1;
        }

        int power = 0;
        while (n > 1) {
            n >>= 1;
            power++;
        }
        return power;
    }

    // Get the power using bit operations (more efficient)
    public static int getPowerBitwise(int n) {
        if (!isPowerOfTwoMethod1(n)) {
            return -1;
        }
        // Count trailing zeros = power of 2
        return Integer.numberOfTrailingZeros(n);
    }

    // Check if power of 2 using single bit check
    // A power of 2 has exactly one bit set
    public static boolean isPowerOfTwoSingleBit(int n) {
        if (n <= 0) {
            return false;
        }
        // n & (n-1) removes the rightmost set bit
        // If result is 0, only one bit was set
        return (n & (n - 1)) == 0;
    }

    // Find next power of 2
    public static int nextPowerOfTwo(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return n;
        }

        int power = 1;
        while (power < n) {
            power *= 2;
        }
        return power;
    }

    // Find next power of 2 using bit operations
    public static int nextPowerOfTwoBitwise(int n) {
        if (n <= 0) {
            return 1;
        }
        if ((n & (n - 1)) == 0) {
            return n;
        }

        int msb = Integer.highestOneBit(n);
        return msb << 1;
    }

    // Check if power of 4
    public static boolean isPowerOfFour(int n) {
        return isPowerOfTwoMethod1(n) && (getPowerBitwise(n) % 2 == 0);
    }

    // Check if power of 3 (no bit manipulation, iterative)
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println("===== POWER OF TWO =====\n");

        int[] testNumbers = {1, 2, 3, 4, 5, 8, 16, 32, 64, 100, 128, 256, 1000, 1024};

        System.out.println("Testing different methods:\n");
        System.out.println("Number\t\tMethod1\tMethod2\tMethod3\tMethod4");
        System.out.println("------\t\t-------\t-------\t-------\t-------");

        for (int num : testNumbers) {
            System.out.printf("%d\t\t", num);
            System.out.printf("%s\t", isPowerOfTwoMethod1(num));
            System.out.printf("%s\t", isPowerOfTwoMethod2(num));
            System.out.printf("%s\t", isPowerOfTwoMethod3(num));
            System.out.printf("%s\n", isPowerOfTwoMethod4(num));
        }

        System.out.println();

        // Get power values
        System.out.println("===== GET POWER VALUE =====\n");
        System.out.println("Number\tPower\tVerification(2^Power)");
        System.out.println("------\t-----\t---------------------");

        for (int num : testNumbers) {
            int power = getPowerBitwise(num);
            if (power != -1) {
                System.out.printf("%d\t%d\t%d\n", num, power, (1 << power));
            }
        }

        System.out.println();

        // Binary representation
        System.out.println("===== BINARY REPRESENTATION =====\n");
        for (int num : new int[]{1, 2, 4, 8, 16, 32}) {
            System.out.println(num + " = " + Integer.toBinaryString(num) + " (Power of 2: " + isPowerOfTwoMethod1(num) + ")");
        }

        System.out.println();

        // Understanding the bitmask trick
        System.out.println("===== UNDERSTANDING n & (n-1) =====\n");
        for (int num : new int[]{8, 12, 16, 20}) {
            System.out.println(num + " = " + Integer.toBinaryString(num));
            System.out.println((num - 1) + " = " + Integer.toBinaryString(num - 1));
            System.out.println(num + " & " + (num - 1) + " = " + (num & (num - 1)));
            System.out.println("Is power of 2: " + isPowerOfTwoMethod1(num));
            System.out.println();
        }

        // Next power of 2
        System.out.println("===== NEXT POWER OF TWO =====\n");
        int[] nums = {3, 5, 10, 25, 100, 500};
        for (int num : nums) {
            System.out.println("Next power of 2 after " + num + " is " + nextPowerOfTwoBitwise(num));
        }

        System.out.println();

        // Power of 4
        System.out.println("===== POWER OF FOUR =====\n");
        for (int num : testNumbers) {
            System.out.println(num + " is power of 4: " + isPowerOfFour(num));
        }

        System.out.println();

        // Power of 3
        System.out.println("===== POWER OF THREE =====\n");
        int[] threeNumbers = {1, 3, 9, 27, 81, 10, 18, 100};
        for (int num : threeNumbers) {
            System.out.println(num + " is power of 3: " + isPowerOfThree(num));
        }

        System.out.println();

        // Detailed example
        System.out.println("===== DETAILED EXAMPLE: 16 =====\n");
        int num = 16;
        System.out.println("Number: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Number - 1: " + (num - 1));
        System.out.println("Binary: " + Integer.toBinaryString(num - 1));
        System.out.println((num - 1) + " has only 0s where " + num + " has 1s");
        System.out.println("16 & 15 = " + (num & (num - 1)));
        System.out.println("Result is 0, so 16 is a power of 2");

        System.out.println();

        // Performance test
        System.out.println("===== PERFORMANCE COMPARISON =====\n");
        int testNum = Integer.MAX_VALUE;
        int iterations = 1000000;

        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            isPowerOfTwoMethod1(testNum);
        }
        long time1 = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            isPowerOfTwoMethod2(testNum);
        }
        long time2 = System.nanoTime() - startTime;

        System.out.println("Test number: " + testNum);
        System.out.println("Iterations: " + iterations);
        System.out.println("Bitmask method: " + time1 + " ns");
        System.out.println("Logarithm method: " + time2 + " ns");
        System.out.println("Bitmask is " + (double) time2 / time1 + "x faster");
    }
}
