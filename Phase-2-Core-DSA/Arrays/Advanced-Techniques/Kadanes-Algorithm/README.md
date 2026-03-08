# Kadane's Algorithm (Java)

## What this program does

Finds the **maximum sum contiguous sub-array** in an array that may contain both positive and negative numbers.

## Concept

Instead of checking every possible sub-array (`O(n²)`), Kadane's Algorithm makes a single pass:

- Keep a running sum (`currentSum`).
- At each element, decide: **start fresh** from this element, or **extend** the previous sub-array.
- Track the best sum seen so far (`maxSum`).

The key decision at every index `i`:

```
currentSum = max(arr[i], currentSum + arr[i])
```

If adding `arr[i]` to the running total is worse than starting over from `arr[i]`, we start over.

## Algorithm steps

1. Read `n` elements into `arr[]`.
2. Set `maxSum = arr[0]` and `currentSum = arr[0]`.
3. Loop from `i = 1` to `n - 1`:
   - `currentSum = max(arr[i], currentSum + arr[i])`
   - `maxSum = max(maxSum, currentSum)`
4. Print `maxSum`.

## Example input/output

**Input**

```
Enter number of elements: 8
Enter 8 elements:
-2 -3 4 -1 -2 1 5 -3
```

**Output**

```
Maximum Sub-array Sum: 7
Sub-array: [4, -1, -2, 1, 5]
```

_(The sub-array from index 2 to 6 has the maximum sum: 4 + (-1) + (-2) + 1 + 5 = 7)_

## Complexity

- **Time complexity:** `O(n)` — single pass
- **Space complexity:** `O(1)` — only a few variables

## Key learning points

- Kadane's reduces the brute-force `O(n²)` to `O(n)` by remembering just enough state.
- It is a classic example of **dynamic programming** on arrays.
- To also print the sub-array, track the `start` and `end` indices whenever `maxSum` updates.
- Variant: to find the **minimum** sub-array sum, flip the `max` calls to `min`.

## File

- `KadanesAlgorithm.java`
