# Reverse Traversal (Java)

## What this program does

Takes an array from the user and prints every element from the **end** to the **beginning**.

## Concept

A `for` loop iterates from index `n - 1` down to `0`, printing each element in reverse order.

## Algorithm steps

1. Read `n` (number of elements).
2. Read the `n` array elements.
3. Loop from `i = n - 1` down to `0`:
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
Array elements (reverse traversal):
50 40 30 20 10
```

## Complexity

- **Time complexity:** `O(n)` (visits every element once)
- **Space complexity:** `O(1)` extra space

## Key learning points

- Reverse traversal simply changes the loop direction.
- Useful when you need to process elements from the end (e.g., right-shifting before insertion).

## File

- `ReverseTraversal.java`
