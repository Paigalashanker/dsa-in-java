# Move Zeroes (Java)

## What this program does

Moves all `0`s in the array to the **end**, while keeping the **relative order** of non-zero elements unchanged. Done **in-place**.

## Concept

Use a pointer `insertPos` that tracks where the next non-zero element should go.

1. Walk through the array.
2. Every time you see a non-zero value, place it at `insertPos` and increment `insertPos`.
3. After the loop, fill the remaining positions with `0`.

```
Before:  [0, 1, 0, 3, 12]

Pass 1 — move non-zeroes forward:
         [1, 3, 12, 3, 12]   insertPos = 3

Pass 2 — fill rest with 0:
         [1, 3, 12, 0, 0]
```

## Algorithm steps

1. Read `n` elements into `arr[]`.
2. Set `insertPos = 0`.
3. For `i = 0` to `n - 1`:
   - If `arr[i] != 0`, set `arr[insertPos] = arr[i]` and `insertPos++`.
4. For `i = insertPos` to `n - 1`:
   - Set `arr[i] = 0`.
5. Print the result.

## Example input/output

**Input**

```
Enter number of elements: 5
Enter 5 elements:
0 1 0 3 12
```

**Output**

```
After moving zeroes: 1 3 12 0 0
```

## Complexity

- **Time complexity:** `O(n)` — two passes (can also be done in one pass with swaps)
- **Space complexity:** `O(1)` — in-place

## Key learning points

- This is LeetCode #283 — a very popular easy-level interview question.
- The key insight is maintaining a **write pointer** (`insertPos`) that is always ≤ the read pointer.
- One-pass variant: instead of two passes, swap `arr[i]` with `arr[insertPos]` whenever `arr[i] != 0`.

## File

- `MoveZeroes.java`
