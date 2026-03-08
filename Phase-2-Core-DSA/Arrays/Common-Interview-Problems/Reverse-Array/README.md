# Reverse Array (Java)

## What this program does

Reverses the elements of an array **in-place** using the two-pointer technique.

## Concept

Place one pointer at the **start** and one at the **end**. Swap the elements, then move both pointers inward. Repeat until they meet.

```
Before:  [1, 2, 3, 4, 5]
          ↑              ↑
        left            right

Step 1:  [5, 2, 3, 4, 1]   swap 1 ↔ 5
Step 2:  [5, 4, 3, 2, 1]   swap 2 ↔ 4
Done — pointers have crossed.
```

## Algorithm steps

1. Read `n` elements into `arr[]`.
2. Set `left = 0`, `right = n - 1`.
3. While `left < right`:
   - Swap `arr[left]` and `arr[right]`.
   - `left++`, `right--`.
4. Print the reversed array.

## Example input/output

**Input**

```
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
```

**Output**

```
Reversed array: 50 40 30 20 10
```

## Complexity

- **Time complexity:** `O(n)` — each element is swapped at most once
- **Space complexity:** `O(1)` — in-place, no extra array needed

## Key learning points

- The **two-pointer** pattern is one of the most powerful array techniques.
- In-place reversal avoids creating a new array, saving memory.
- This exact swap logic is used inside more complex algorithms (e.g., rotate array, palindrome check).

## File

- `ReverseArray.java`
