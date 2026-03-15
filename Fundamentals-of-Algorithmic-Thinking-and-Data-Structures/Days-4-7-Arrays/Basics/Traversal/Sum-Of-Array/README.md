# Sum of Array (Java)

## What this program does

Takes an array from the user and calculates the **sum** of all elements.

## Concept

An accumulator variable `sum` starts at `0`. During traversal each element is added to `sum`. After the loop, `sum` holds the total.

## Algorithm steps

1. Read `n` (number of elements).
2. Read the `n` array elements.
3. Initialize `sum = 0`.
4. Loop from `i = 0` to `n - 1`:
   - `sum = sum + arr[i]`.
5. Print `sum`.

## Example input/output

**Input**

```
Enter number of elements: 5
Enter 5 elements:
10 20 30 40 50
```

**Output**

```
Sum of array elements: 150
```

## Complexity

- **Time complexity:** `O(n)` (one pass through the array)
- **Space complexity:** `O(1)` extra space (only one extra variable `sum`)

## Key learning points

- This is a classic **reduction** operation: many values → one value.
- The same pattern applies to computing product, average, count, etc.
- Be careful with integer overflow for very large arrays — consider using `long` instead of `int`.

## File

- `SumOfArray.java`
