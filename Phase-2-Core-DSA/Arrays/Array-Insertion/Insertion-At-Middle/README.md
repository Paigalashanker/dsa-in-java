# Insertion at Middle (Java)

## What this program does

Takes an array from the user, asks for an **index**, and inserts a value at that index.

## Concept

To insert at a specific index `k`, elements from `k` to the end must shift right by 1 position.

## Algorithm steps

1. Read `n` (number of elements).
2. Read the `n` array elements.
3. Read `index` (`0` to `n`).
4. Validate the index.
5. Read `value`.
6. Shift elements right:
   - for `i = n` down to `index + 1`: `arr[i] = arr[i - 1]`
7. Insert: `arr[index] = value`
8. Print the updated array.

## Example input/output

**Input**

```
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
Enter index to insert (0 to 5): 2
Enter value to insert: 99
```

**Output**

```
Array after insertion:
10 20 99 30 40 50
```

## Complexity

- **Time complexity:** `O(n)` (shifts up to `n - index` elements)
- **Space complexity:**
  - Extra space: `O(1)`
  - Total array storage: `O(n)`

## Key learning points

- Index validation prevents runtime errors.
- Shifting must happen from the end to the index.

## File

- `InsertAtMiddle.java`
