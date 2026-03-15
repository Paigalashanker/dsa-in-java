# Common Interview Problems on Arrays (Java)

A curated set of array problems that appear frequently in coding interviews. Each problem builds on the basics (traversal, insertion, deletion) and the advanced techniques (prefix sum, Kadane's, sliding window) covered earlier.

## Programs in this folder

| #   | Problem                | Description                                                  | Difficulty |
| --- | ---------------------- | ------------------------------------------------------------ | ---------- |
| 1   | `Two-Sum/`             | Find two elements that add up to a target                    | Easy       |
| 2   | `Reverse-Array/`       | Reverse an array in-place using two pointers                 | Easy       |
| 3   | `Move-Zeroes/`         | Move all zeroes to the end while keeping order of non-zeroes | Easy       |
| 4   | `Find-Second-Largest/` | Find the second-largest element without sorting              | Easy       |
| 5   | `Rotate-Array/`        | Rotate an array to the right by `k` positions                | Medium     |

## Why these problems?

- They test your understanding of **indices, pointers, and in-place manipulation**.
- They are among the most commonly asked in interviews at top tech companies.
- Each one teaches a transferable pattern you will reuse in harder problems.

## Key patterns used

| Pattern               | Problems that use it                |
| --------------------- | ----------------------------------- |
| Two-pointer technique | Two Sum, Reverse Array, Move Zeroes |
| In-place swapping     | Reverse Array, Rotate Array         |
| Single-pass tracking  | Find Second Largest, Move Zeroes    |

## How to approach interview problems

1. **Understand** — re-read the problem, clarify edge cases.
2. **Brute force** — think of the simplest (possibly slow) solution first.
3. **Optimize** — look for patterns (sorting, hashing, two pointers, sliding window).
4. **Code** — write clean, readable code.
5. **Test** — walk through examples, check edge cases (empty array, single element, duplicates).
