# Basic Traversal (Java)

## What this program does

Takes an array from the user and prints every element from the **beginning** to the **end**.

## Concept

A simple `for` loop iterates from index `0` to `n - 1`, printing each element in order.

## Algorithm steps

1. Read `n` (number of elements).
2. Read the `n` array elements.
3. Loop from `i = 0` to `n - 1`:
   - Print `arr[i]`.

## Example input/output

**Input**

```
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
```

**Output**

```
Array elements (basic traversal):
10 20 30 40 50
```

## Complexity

- **Time complexity:** `O(n)` (visits every element once)
- **Space complexity:** `O(1)` extra space

## Key learning points

- This is the simplest form of array traversal.
- The loop variable `i` acts as the index to access each element.

## File

- `BasicTraversal.java`
