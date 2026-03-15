# Big-O Cheat Sheet

## Common complexities

| Complexity   | Common pattern     | Example            |
| ------------ | ------------------ | ------------------ |
| `O(1)`       | Direct access      | Array index lookup |
| `O(log n)`   | Repeated halving   | Binary search      |
| `O(n)`       | Single traversal   | Find max in array  |
| `O(n log n)` | Divide and conquer | Merge sort         |
| `O(n^2)`     | Nested loops       | Compare all pairs  |

## Rule of thumb

- Prefer lower growth rate when two solutions are equally correct.
- For small inputs, readability still matters.
- For large inputs, complexity often decides whether a solution is practical.
