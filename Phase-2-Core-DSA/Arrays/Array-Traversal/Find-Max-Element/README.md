# Find Max Element (Java)

## What this program does

Takes an array from the user and finds the **maximum** (largest) element.

## Concept

A variable `max` is initialized to the first element. During traversal, every element is compared with `max`; if a larger value is found, `max` is updated.

## Algorithm steps

1. Read `n` (number of elements).
2. Read the `n` array elements.
3. Set `max = arr[0]`.
4. Loop from `i = 1` to `n - 1`:
   - If `arr[i] > max`, set `max = arr[i]`.
5. Print `max`.

## Example input/output

**Input**

```
Enter number of elements: 5
Enter 5 elements:
10 50 30 90 20
```

**Output**

```
Maximum element: 90
```

## Complexity

- **Time complexity:** `O(n)` (one pass through the array)
- **Space complexity:** `O(1)` extra space (only one extra variable `max`)

## Key learning points

- Initialize `max` with `arr[0]`, not `0` — the array could contain all negative numbers.
- The same pattern works for finding the minimum (change `>` to `<`).
- This is another **reduction** operation: many values → one value.

## File

- `FindMaxElement.java`
