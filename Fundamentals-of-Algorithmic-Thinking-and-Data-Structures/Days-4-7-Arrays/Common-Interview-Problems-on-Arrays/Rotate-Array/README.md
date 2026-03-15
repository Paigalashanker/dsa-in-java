# Rotate Array (Java)

## What this program does

Rotates an array to the **right** by `k` positions **in-place** using the reversal algorithm.

## Concept

Right-rotating by `k` means the last `k` elements move to the front.

```
arr = [1, 2, 3, 4, 5, 6, 7]   k = 3

Step 1 — Reverse the whole array:     [7, 6, 5, 4, 3, 2, 1]
Step 2 — Reverse first k elements:    [5, 6, 7, 4, 3, 2, 1]
Step 3 — Reverse remaining elements:  [5, 6, 7, 1, 2, 3, 4]  ✓
```

Three reverses = one rotation. No extra array needed!

## Algorithm steps

1. Read `n` elements and `k`.
2. Normalize: `k = k % n` (handles `k > n`).
3. Reverse `arr[0..n-1]`.
4. Reverse `arr[0..k-1]`.
5. Reverse `arr[k..n-1]`.
6. Print the rotated array.

## Example input/output

**Input**

```
Enter number of elements: 7
Enter 7 elements:
1 2 3 4 5 6 7
Enter number of positions to rotate right: 3
```

**Output**

```
Rotated array: 5 6 7 1 2 3 4
```

## Complexity

- **Time complexity:** `O(n)` — each element is reversed at most twice
- **Space complexity:** `O(1)` — in-place (no extra array)

## Key learning points

- Don't create a new array — interviewers want the **in-place** solution.
- Always normalize `k` with `k % n` to avoid unnecessary full rotations.
- The reversal trick works for left rotation too — just reverse in a different order.
- This is LeetCode #189 — a medium-level classic.

## File

- `RotateArray.java`
