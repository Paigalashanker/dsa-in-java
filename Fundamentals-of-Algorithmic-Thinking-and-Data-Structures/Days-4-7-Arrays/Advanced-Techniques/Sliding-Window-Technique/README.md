# Sliding Window Technique (Java)

## What this program does

Finds the **maximum sum of a sub-array of size `k`** using the sliding-window approach — no nested loops needed.

## Concept

Imagine a window of size `k` sliding one position to the right at each step:

```
arr:  [2, 1, 5, 1, 3, 2]    k = 3

Window 1:  [2, 1, 5]          sum = 8
Window 2:     [1, 5, 1]       sum = 7
Window 3:        [5, 1, 3]    sum = 9  ← maximum
Window 4:           [1, 3, 2] sum = 6
```

Instead of re-computing the sum from scratch each time, we:

1. **Subtract** the element leaving the window (left side).
2. **Add** the element entering the window (right side).

This keeps each step at `O(1)`, giving an overall `O(n)` solution.

## Algorithm steps

1. Read `n` elements and the window size `k`.
2. Compute the sum of the first `k` elements → `windowSum`.
3. Set `maxSum = windowSum`.
4. Slide the window: for `i = k` to `n - 1`:
   - `windowSum = windowSum + arr[i] - arr[i - k]`
   - If `windowSum > maxSum`, update `maxSum`.
5. Print `maxSum`.

## Example input/output

**Input**

```
Enter number of elements: 6
Enter 6 elements:
2 1 5 1 3 2
Enter window size k: 3
```

**Output**

```
Maximum sum of a sub-array of size 3: 9
Window: [5, 1, 3]
```

## Complexity

- **Time complexity:** `O(n)` — one pass after the initial window
- **Space complexity:** `O(1)` — only a few variables

## Key learning points

- The brute-force approach would be `O(n × k)`. Sliding window brings it down to `O(n)`.
- This is a **fixed-size** sliding window. There is also a **variable-size** variant (e.g., smallest sub-array with sum ≥ target).
- The pattern appears in many interview problems: max average sub-array, longest substring without repeating characters, etc.

## File

- `SlidingWindow.java`
