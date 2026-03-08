# Find Second Largest (Java)

## What this program does

Finds the **second-largest** element in an array in a **single pass**, without sorting.

## Concept

Maintain two variables:

- `largest` — the biggest value seen so far.
- `secondLargest` — the biggest value that is strictly less than `largest`.

As you traverse, update them:

- If `arr[i] > largest`: the old `largest` becomes `secondLargest`, and `arr[i]` becomes `largest`.
- Else if `arr[i] > secondLargest` and `arr[i] != largest`: update `secondLargest`.

## Algorithm steps

1. Read `n` elements into `arr[]`.
2. Initialize `largest` and `secondLargest` to `Integer.MIN_VALUE`.
3. Loop through the array:
   - If `arr[i] > largest`, set `secondLargest = largest`, then `largest = arr[i]`.
   - Else if `arr[i] > secondLargest` and `arr[i] != largest`, set `secondLargest = arr[i]`.
4. If `secondLargest` is still `Integer.MIN_VALUE`, no second-largest exists (all elements equal).
5. Otherwise, print `secondLargest`.

## Example input/output

**Input**

```
Enter number of elements: 6
Enter 6 elements:
12 35 1 10 34 1
```

**Output**

```
Second largest element: 34
```

## Complexity

- **Time complexity:** `O(n)` — single pass
- **Space complexity:** `O(1)` — two extra variables

## Key learning points

- Sorting would work but costs `O(n log n)`. This single-pass approach is `O(n)`.
- Handle duplicates: if `arr[i] == largest`, skip it so duplicates don't become "second largest".
- Edge case: arrays with all identical elements have no second-largest.

## File

- `FindSecondLargest.java`
