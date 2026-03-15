# Deletion at Middle (Given Index)

## What it does

Removes the element at a **user-specified index** from the array by shifting all subsequent elements one position to the left.

## Algorithm

1. Read `n` elements into an array.
2. Read the target index `k`.
3. Validate: `0 <= k < n`.
4. Shift elements left: for `i = k` to `n - 2`, set `arr[i] = arr[i + 1]`.
5. Decrease `n` by 1.
6. Print the updated array.

## Example

```
Input:  [10, 20, 30, 40, 50], index = 2
Output: [10, 20, 40, 50]
```

## Complexity

|           | Value |
| --------- | ----- |
| **Time**  | O(n)  |
| **Space** | O(1)  |
