# Array Traversal (Java)

Array traversal means visiting every element of an array exactly once. It is the most fundamental array operation and serves as the building block for searching, filtering, aggregation, and many other algorithms.

## Core idea

- Use a loop (usually `for`) to access each element by its index.
- You can traverse **forward** (index `0` → `n-1`) or **backward** (index `n-1` → `0`).
- While traversing you can **read**, **print**, **accumulate**, or **compare** elements.

## Programs in this folder

| #   | Program                  | Description                                                 |
| --- | ------------------------ | ----------------------------------------------------------- |
| 1   | `Basic-Traversal/`       | Print every element from start to end                       |
| 2   | `Reverse-Traversal/`     | Print every element from end to start                       |
| 3   | `Conditional-Traversal/` | Print only elements that satisfy a condition (even numbers) |
| 4   | `Sum-Of-Array/`          | Calculate the sum of all elements                           |
| 5   | `Find-Max-Element/`      | Find the maximum element in the array                       |

## General algorithm (forward traversal)

1. Start with index `i = 0`.
2. Access `arr[i]` and perform the desired operation.
3. Increment `i` by `1`.
4. Repeat until `i == n`.

## Complexity

| Operation                 | Time   | Extra Space |
| ------------------------- | ------ | ----------- |
| Basic / Reverse traversal | `O(n)` | `O(1)`      |
| Conditional traversal     | `O(n)` | `O(1)`      |
| Sum of array              | `O(n)` | `O(1)`      |
| Find max element          | `O(n)` | `O(1)`      |

> Every traversal visits each element at most once, so all variants are **O(n)** time and **O(1)** extra space.

## Key learning points

- Traversal is the foundation of almost every array algorithm.
- Forward vs. reverse traversal is controlled by the loop direction.
- Combining traversal with a condition gives you **filtering**.
- Combining traversal with an accumulator gives you **reduction** (sum, max, min, count, etc.).
