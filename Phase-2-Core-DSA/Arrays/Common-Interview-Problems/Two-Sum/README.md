# Two Sum (Java)

## What this program does

Given an array and a **target** value, finds **two elements** whose sum equals the target and prints their indices.

## Concept

**Brute-force approach (used here for clarity):**
Check every pair `(i, j)` where `i < j`. If `arr[i] + arr[j] == target`, we found the answer.

**Optimized approach (mentioned for learning):**
Use a HashMap — for each element, check if `target - arr[i]` was seen before. This brings time complexity from `O(n²)` down to `O(n)`.

## Algorithm steps (brute force)

1. Read `n` elements and the `target`.
2. For each `i` from `0` to `n - 2`:
   - For each `j` from `i + 1` to `n - 1`:
     - If `arr[i] + arr[j] == target`, print `i` and `j`.
3. If no pair is found, print "No pair found".

## Example input/output

**Input**

```
Enter number of elements: 5
Enter 5 elements:
2 7 11 15 1
Enter target sum: 9
```

**Output**

```
Pair found at index 0 and index 1
(2 + 7 = 9)
```

## Complexity

| Approach    | Time    | Space  |
| ----------- | ------- | ------ |
| Brute force | `O(n²)` | `O(1)` |
| HashMap     | `O(n)`  | `O(n)` |

## Key learning points

- This is **the** most common array interview question (LeetCode #1).
- The brute-force solution is fine for understanding; always mention the HashMap optimization in an interview.
- Edge case: the same element cannot be used twice (use `i < j`).

## File

- `TwoSum.java`
