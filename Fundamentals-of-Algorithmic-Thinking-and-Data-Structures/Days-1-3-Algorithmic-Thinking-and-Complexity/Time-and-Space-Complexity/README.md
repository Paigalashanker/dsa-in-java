# Time and Space Complexity

Complexity is used to describe how the cost of an algorithm grows as the input size grows.

## Time complexity

Time complexity measures how the number of operations changes with input size `n`.

Examples:

- Accessing an array element by index is often `O(1)`.
- Scanning every element of an array is `O(n)`.
- Using two nested loops over the same array is often `O(n^2)`.

## Space complexity

Space complexity measures how much extra memory an algorithm uses.

Examples:

- Swapping values using one temporary variable is `O(1)` extra space.
- Creating another array of size `n` is `O(n)` extra space.

## Why it matters

Two solutions can both be correct, but one can still be much better for large inputs.
