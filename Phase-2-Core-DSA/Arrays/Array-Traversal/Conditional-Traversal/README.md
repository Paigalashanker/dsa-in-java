# Conditional Traversal (Java)

## What this program does

Takes an array from the user and prints only the **even** elements.

## Concept

During traversal, an `if` condition checks each element before printing it. Only elements satisfying the condition (`arr[i] % 2 == 0`) are printed.

## Algorithm steps

1. Read `n` (number of elements).
2. Read the `n` array elements.
3. Loop from `i = 0` to `n - 1`:
   - If `arr[i] % 2 == 0`, print `arr[i]`.
4. If no even element was found, print a message.

## Example input/output

**Input**

```
Enter number of elements: 6
Enter 6 elements:
11 20 33 40 55 60
```

**Output**

```
Even elements in the array:
20 40 60
```

## Complexity

- **Time complexity:** `O(n)` (checks every element once)
- **Space complexity:** `O(1)` extra space

## Key learning points

- Conditional traversal = traversal + filter.
- The condition can be changed to filter odd numbers, negatives, multiples of a value, etc.
- A `found` flag helps handle the edge case where no element matches.

## File

- `ConditionalTraversal.java`
