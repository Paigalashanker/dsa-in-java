# Insertion at Beginning (Java)

## What this program does

Takes an array from the user and inserts a new value at the **beginning** (index `0`).

## Concept

To insert at the beginning, every existing element must move one position to the right.

## Algorithm steps

1. Read `n` (number of elements).
2. Read the `n` array elements.
3. Read `value` (the number to insert).
4. Shift elements right (from last to first):
   - for `i = n` down to `1`: `arr[i] = arr[i - 1]`
5. Insert at beginning: `arr[0] = value`
6. Print the updated array.

## Example input/output

**Input**

```
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
Enter value to insert at beginning: 99
```

**Output**

```
Array after insertion:
99 10 20 30 40 50
```

## Complexity

- **Time complexity:** `O(n)` (shifts `n` elements)
- **Space complexity:**
  - Extra space: `O(1)` (shifting happens inside the same array)
  - Total array storage: `O(n)`

## Key learning points

- Right-shifting must be done from the end to avoid overwriting values.
- Insertion at index `0` is the worst case for shifting.

## File

- `InsertAtBeginning.java`
