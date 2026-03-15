# Insertion at End (Java)

## What this program does

Reads an array from the user and inserts a new element at the **end**.

Because Java arrays are fixed-size, this program creates a **new array of size `n + 1`**, copies the old elements, and then places the new value at the last index.

## Concept

- If an array has extra capacity, “insert at end” can be as simple as `arr[n] = value`.
- If the array is full (fixed-size), you typically create a bigger array and copy elements.

This program demonstrates the second approach.

## Algorithm steps (as implemented)

1. Read `n`.
2. Read `n` elements into `arr`.
3. Read `element` (the value to insert).
4. Create `newArr` of size `n + 1`.
5. Copy elements from `arr` into `newArr` (the program prints each copied element).
6. Insert at end: `newArr[n] = element`.
7. Print the new array.

## Example input/output

**Input**

```
Enter the number of elements: 3
Enter the elements:
10 20 30
Enter the element to insert at the end: 99
```

**Output**

```
Copied element: 10
Copied element: 20
Copied element: 30
Element inserted at the end: 99
New array:
10 20 30 99
```

## Complexity

- **Time complexity:** `O(n)` (copies `n` elements)
- **Space complexity:** `O(n)` (creates a new array of size `n + 1`)

## Key learning points

- Java arrays are fixed-size; “append” often requires a new array.
- Copying elements is a common pattern (also used internally by dynamic arrays like `ArrayList`).

## File

- `InsertAtEnd.java`
