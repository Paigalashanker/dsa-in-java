
public class BitwiseOperators {

    // AND (&) Operator: Returns 1 if both bits are 1
    public static int bitwiseAND(int a, int b) {
        System.out.println("AND Operation: " + a + " & " + b + " = " + (a & b));
        return a & b;
    }

    // OR (|) Operator: Returns 1 if at least one bit is 1
    public static int bitwiseOR(int a, int b) {
        System.out.println("OR Operation: " + a + " | " + b + " = " + (a | b));
        return a | b;
    }

    // XOR (^) Operator: Returns 1 if bits are different
    public static int bitwiseXOR(int a, int b) {
        System.out.println("XOR Operation: " + a + " ^ " + b + " = " + (a ^ b));
        return a ^ b;
    }

    // NOT (~) Operator: Inverts all bits
    public static int bitwiseNOT(int a) {
        System.out.println("NOT Operation: ~" + a + " = " + (~a));
        return ~a;
    }

    // Left Shift (<<) Operator: Shifts bits left, fills with 0
    // Equivalent to multiplying by 2^n
    public static int leftShift(int a, int n) {
        System.out.println("Left Shift: " + a + " << " + n + " = " + (a << n));
        return a << n;
    }

    // Right Shift (>>) Operator: Shifts bits right, preserves sign
    // Equivalent to dividing by 2^n
    public static int rightShift(int a, int n) {
        System.out.println("Right Shift: " + a + " >> " + n + " = " + (a >> n));
        return a >> n;
    }

    // Unsigned Right Shift (>>>) Operator: Shifts bits right, fills with 0
    public static int unsignedRightShift(int a, int n) {
        System.out.println("Unsigned Right Shift: " + a + " >>> " + n + " = " + (a >>> n));
        return a >>> n;
    }

    // Check if ith bit is set
    public static boolean isBitSet(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    // Set ith bit
    public static int setBit(int num, int i) {
        return num | (1 << i);
    }

    // Clear ith bit
    public static int clearBit(int num, int i) {
        return num & ~(1 << i);
    }

    // Toggle ith bit
    public static int toggleBit(int num, int i) {
        return num ^ (1 << i);
    }

    // Check if power of 2
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // Count number of set bits
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    // Get last set bit
    public static int getLastSetBit(int n) {
        return n & -n;
    }

    // Check if bit at position i is set
    public static boolean checkBit(int num, int pos) {
        return (num >> pos & 1) == 1;
    }

    public static void main(String[] args) {
        System.out.println("===== BITWISE OPERATORS =====\n");

        int a = 12; // 1100 in binary
        int b = 10; // 1010 in binary

        System.out.println("Numbers: a = " + a + " (1100), b = " + b + " (1010)\n");

        // AND Operation
        bitwiseAND(a, b);

        // OR Operation
        bitwiseOR(a, b);

        // XOR Operation
        bitwiseXOR(a, b);

        // NOT Operation
        bitwiseNOT(a);

        System.out.println();

        // Shift Operations
        System.out.println("===== SHIFT OPERATIONS =====\n");
        leftShift(5, 2);  // 5 << 2 = 20
        rightShift(20, 2); // 20 >> 2 = 5
        unsignedRightShift(-5, 1);

        System.out.println();

        // Bit Manipulation on specific positions
        System.out.println("===== BIT MANIPULATION =====\n");
        int num = 5; // 0101
        System.out.println("Original number: " + num + " (binary: 0101)\n");

        System.out.println("Bit at position 0: " + (isBitSet(num, 0) ? "Set" : "Not set"));
        System.out.println("Bit at position 1: " + (isBitSet(num, 1) ? "Set" : "Not set"));
        System.out.println("Bit at position 2: " + (isBitSet(num, 2) ? "Set" : "Not set"));

        System.out.println("\nSet bit at position 1: " + setBit(num, 1) + " (binary: 0111)");
        System.out.println("Clear bit at position 0: " + clearBit(num, 0) + " (binary: 0100)");
        System.out.println("Toggle bit at position 2: " + toggleBit(num, 2) + " (binary: 0001)");

        System.out.println();

        // Useful Techniques
        System.out.println("===== USEFUL TECHNIQUES =====\n");
        System.out.println("Is 8 power of 2? " + isPowerOfTwo(8));
        System.out.println("Is 6 power of 2? " + isPowerOfTwo(6));

        System.out.println("Set bits in 12: " + countSetBits(12));
        System.out.println("Set bits in 7: " + countSetBits(7));

        System.out.println("Last set bit of 12: " + getLastSetBit(12));
        System.out.println("Last set bit of 20: " + getLastSetBit(20));

        System.out.println();

        // Practical Examples
        System.out.println("===== PRACTICAL EXAMPLES =====\n");

        // Example 1: Check specific flag
        int flags = 13; // 1101
        System.out.println("Flags: " + flags + " (binary: 1101)");
        System.out.println("Is flag 0 enabled? " + checkBit(flags, 0));
        System.out.println("Is flag 1 enabled? " + checkBit(flags, 1));
        System.out.println("Is flag 2 enabled? " + checkBit(flags, 2));
        System.out.println("Is flag 3 enabled? " + checkBit(flags, 3));

        System.out.println();

        // Example 2: Swap numbers using XOR
        int x = 5, y = 10;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
