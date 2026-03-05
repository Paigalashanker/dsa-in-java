# Deletion at Beginning

## What it does

Removes the **first element** (index `0`) from the array by shifting all subsequent elements one position to the left.

## Algorithm

1. Read `n` elements into an array.
2. Shift elements left: for `i = 0` to `n - 2`, set `arr[i] = arr[i + 1]`.
3. Decrease `n` by 1.
4. Print the updated array.

## Example

```
Input:  [10, 20, 30, 40, 50]
Output: [20, 30, 40, 50]
```

## Complexity

|           | Value |
| --------- | ----- |
| **Time**  | O(n)  |
| **Space** | O(1)  |
