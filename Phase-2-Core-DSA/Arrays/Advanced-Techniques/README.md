# Advanced Array Techniques (Java)

Once you are comfortable with basic traversal, insertion, and deletion, the next step is learning **patterns** that solve many array problems efficiently.

## Core idea

Instead of brute-forcing every sub-problem, smart techniques let you:

- **Pre-compute** results so later queries are instant (Prefix Sum).
- **Track running state** to avoid re-scanning (Kadane's Algorithm).
- **Slide a window** across the array instead of checking every sub-array (Sliding Window).

## Programs in this folder

| #   | Program                     | Description                                            |
| --- | --------------------------- | ------------------------------------------------------ |
| 1   | `Prefix-Sum/`               | Build a prefix-sum array for instant range-sum queries |
| 2   | `Kadanes-Algorithm/`        | Find the maximum sum contiguous sub-array              |
| 3   | `Sliding-Window-Technique/` | Find the maximum sum of a sub-array of size `k`        |

## When to use each technique

| Technique      | Best for                                       | Time                            |
| -------------- | ---------------------------------------------- | ------------------------------- |
| Prefix Sum     | Multiple range-sum queries on a static array   | `O(n)` build + `O(1)` per query |
| Kadane's Algo  | Maximum / minimum sub-array sum                | `O(n)`                          |
| Sliding Window | Fixed-size or variable-size sub-array problems | `O(n)`                          |

## Key learning points

- All three techniques reduce a naive `O(n²)` approach down to `O(n)`.
- They appear in almost every coding interview that involves arrays.
- Master the pattern first with simple examples, then apply it to harder variants.
