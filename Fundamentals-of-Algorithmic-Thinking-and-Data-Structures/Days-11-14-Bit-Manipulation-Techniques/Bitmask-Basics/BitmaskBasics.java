
public class BitmaskBasics {

    // ===== BASIC BIT OPERATIONS =====
    // Set a bit at position i (0-indexed from right)
    // Operation: n | (1 << i)
    public static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // Check if bit at position i is set (1) or not (0)
    // Operation: (n >> i) & 1 or (n & (1 << i)) != 0
    public static boolean checkBit(int n, int i) {
        return ((n >> i) & 1) == 1;
    }

    // Clear (unset) a bit at position i
    // Operation: n & ~(1 << i)
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // Toggle a bit at position i
    // Operation: n ^ (1 << i)
    public static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }

    // Check if bit is set (alternative method)
    public static boolean isBitSet(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    // ===== USEFUL UTILITIES =====
    // Clear all bits to the right of position i
    public static int clearBitsRight(int n, int i) {
        return n & (~0 << (i + 1));
    }

    // Clear all bits to the left of position i
    public static int clearBitsLeft(int n, int i) {
        return n & ((1 << i) - 1);
    }

    // Clear bits in range [i, j]
    public static int clearBitsInRange(int n, int i, int j) {
        int mask = (~0 << (j + 1)) | ((1 << i) - 1);
        return n & mask;
    }

    // Update a specific bit
    public static int updateBit(int n, int i, int bit) {
        return (n & ~(1 << i)) | (bit << i);
    }

    // Get bit at position i
    public static int getBit(int n, int i) {
        return (n >> i) & 1;
    }

    // ===== ADVANCED OPERATIONS =====
    // Check if bits at position p are same as bits at position q
    public static boolean areBitsSame(int n, int p, int q) {
        return ((n >> p) & 1) == ((n >> q) & 1);
    }

    // Flip bits from i to j
    public static int flipBits(int n, int i, int j) {
        int mask = 0;
        for (int k = i; k <= j; k++) {
            mask |= (1 << k);
        }
        return n ^ mask;
    }

    // Check if two numbers have opposite bits
    public static boolean hasOppositeBits(int a, int b) {
        return (a ^ b) == -1; // All bits are different
    }

    // ===== PERMISSION/FLAG MANAGEMENT =====
    // Example: Permission system using bitmask
    // Permissions: READ=0, WRITE=1, EXECUTE=2, DELETE=3
    public static final int READ = 0;
    public static final int WRITE = 1;
    public static final int EXECUTE = 2;
    public static final int DELETE = 3;

    // Grant permission
    public static int grantPermission(int permissions, int permission) {
        return setBit(permissions, permission);
    }

    // Revoke permission
    public static int revokePermission(int permissions, int permission) {
        return clearBit(permissions, permission);
    }

    // Check permission
    public static boolean hasPermission(int permissions, int permission) {
        return checkBit(permissions, permission);
    }

    // ===== SUBSET GENERATION =====
    // Generate all subsets of a set using bitmask
    public static void generateSubsets(String[] arr) {
        int n = arr.length;
        int totalSubsets = 1 << n; // 2^n

        System.out.println("All subsets using bitmask:");
        for (int mask = 0; mask < totalSubsets; mask++) {
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("}");
        }
    }

    // ===== HELPER METHODS =====
    // Display binary representation
    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    // Display with fixed width
    public static String toBinaryFixed(int n, int width) {
        String binary = Integer.toBinaryString(n);
        while (binary.length() < width) {
            binary = "0" + binary;
        }
        return binary;
    }

    public static void main(String[] args) {
        System.out.println("===== BITMASK BASICS =====\n");

        // Basic bit operations
        System.out.println("===== BASIC BIT OPERATIONS =====\n");
        int num = 5; // Binary: 0101
        System.out.println("Original number: " + num + " (Binary: " + toBinaryFixed(num, 8) + ")\n");

        // Set bit at position 1
        int setResult = setBit(num, 1);
        System.out.println("Set bit at position 1: " + setResult + " (Binary: " + toBinaryFixed(setResult, 8) + ")");

        // Check bits
        System.out.println("Check bit at position 0: " + (checkBit(num, 0) ? "SET" : "NOT SET"));
        System.out.println("Check bit at position 1: " + (checkBit(num, 1) ? "SET" : "NOT SET"));
        System.out.println("Check bit at position 2: " + (checkBit(num, 2) ? "SET" : "NOT SET"));

        // Clear bit at position 2
        int clearResult = clearBit(num, 2);
        System.out.println("Clear bit at position 2: " + clearResult + " (Binary: " + toBinaryFixed(clearResult, 8) + ")");

        // Toggle bit at position 0
        int toggleResult = toggleBit(num, 0);
        System.out.println("Toggle bit at position 0: " + toggleResult + " (Binary: " + toBinaryFixed(toggleResult, 8) + ")");

        System.out.println();

        // Update bit operation
        System.out.println("===== UPDATE BIT OPERATION =====\n");
        System.out.println("Original number: " + num + " (Binary: " + toBinaryFixed(num, 8) + ")");
        System.out.println("Update bit 1 to 0: " + updateBit(num, 1, 0) + " (Binary: " + toBinaryFixed(updateBit(num, 1, 0), 8) + ")");
        System.out.println("Update bit 3 to 1: " + updateBit(num, 3, 1) + " (Binary: " + toBinaryFixed(updateBit(num, 3, 1), 8) + ")");

        System.out.println();

        // Clear bits in range
        System.out.println("===== CLEAR BITS IN RANGE =====\n");
        int num2 = 255; // Binary: 11111111
        System.out.println("Original number: " + num2 + " (Binary: " + toBinaryFixed(num2, 8) + ")");
        System.out.println("Clear bits from position 2 to 5: " + clearBitsInRange(num2, 2, 5)
                + " (Binary: " + toBinaryFixed(clearBitsInRange(num2, 2, 5), 8) + ")");

        System.out.println();

        // Permission Management
        System.out.println("===== PERMISSION MANAGEMENT (USER ROLES) =====\n");
        int userPermissions = 0;
        System.out.println("Initial permissions: " + toBinaryFixed(userPermissions, 8));

        // Grant permissions
        userPermissions = grantPermission(userPermissions, READ);
        System.out.println("After granting READ: " + toBinaryFixed(userPermissions, 8));

        userPermissions = grantPermission(userPermissions, WRITE);
        System.out.println("After granting WRITE: " + toBinaryFixed(userPermissions, 8));

        userPermissions = grantPermission(userPermissions, EXECUTE);
        System.out.println("After granting EXECUTE: " + toBinaryFixed(userPermissions, 8));

        // Check permissions
        System.out.println("\nPermission checks:");
        System.out.println("Has READ: " + hasPermission(userPermissions, READ));
        System.out.println("Has WRITE: " + hasPermission(userPermissions, WRITE));
        System.out.println("Has DELETE: " + hasPermission(userPermissions, DELETE));
        System.out.println("Has EXECUTE: " + hasPermission(userPermissions, EXECUTE));

        // Revoke permission
        userPermissions = revokePermission(userPermissions, WRITE);
        System.out.println("\nAfter revoking WRITE: " + toBinaryFixed(userPermissions, 8));
        System.out.println("Has WRITE: " + hasPermission(userPermissions, WRITE));

        System.out.println();

        // Subset generation
        System.out.println("===== SUBSET GENERATION =====\n");
        String[] fruits = {"Apple", "Banana", "Orange"};
        generateSubsets(fruits);

        System.out.println();

        // Bit manipulation tricks
        System.out.println("===== USEFUL BIT TRICKS =====\n");

        // Check if number is even or odd
        int testNum = 13;
        System.out.println(testNum + " is " + ((testNum & 1) == 0 ? "even" : "odd"));

        // Multiply by 2 (left shift)
        System.out.println(testNum + " << 1 = " + (testNum << 1) + " (multiply by 2)");

        // Divide by 2 (right shift)
        System.out.println(testNum + " >> 1 = " + (testNum >> 1) + " (divide by 2)");

        // Multiply by 2^n
        System.out.println(testNum + " << 3 = " + (testNum << 3) + " (multiply by 8)");

        // Check if number is power of 2
        System.out.println("Is 16 a power of 2? " + ((16 & 15) == 0));

        // Get absolute value without if (works for 32-bit)
        int neg = -5;
        int mask = neg >> 31;
        System.out.println("Absolute value of " + neg + " without if: " + ((neg + mask) ^ mask));

        System.out.println();

        // Detailed example
        System.out.println("===== DETAILED EXAMPLE =====\n");
        System.out.println("Number: 11 (Binary: " + toBinaryFixed(11, 8) + ")");
        System.out.println("Operations:");
        System.out.println("11 & (1 << 0) = " + (11 & 1) + " -> Bit 0: " + ((11 & 1) != 0 ? "SET" : "NOT SET"));
        System.out.println("11 & (1 << 1) = " + (11 & 2) + " -> Bit 1: " + ((11 & 2) != 0 ? "SET" : "NOT SET"));
        System.out.println("11 & (1 << 2) = " + (11 & 4) + " -> Bit 2: " + ((11 & 4) != 0 ? "SET" : "NOT SET"));
        System.out.println("11 & (1 << 3) = " + (11 & 8) + " -> Bit 3: " + ((11 & 8) != 0 ? "SET" : "NOT SET"));
    }
}
