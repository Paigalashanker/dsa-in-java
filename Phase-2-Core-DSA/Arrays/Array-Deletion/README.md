# Array Deletion (Java)

Array deletion means removing an element from a specific position in an array.

Because arrays store elements in **contiguous memory**, you usually cannot "just delete" without moving some elements to fill the gap.

## Core idea

- If you delete from the **beginning** or **middle**, you must **shift elements to the left** to fill the gap.
- If you delete from the **end**, you simply reduce the count by one.

## Programs in this folder

- `Deletion-At-Beginning/` – delete value at index `0`
- `Deletion-At-Middle/` – delete value at a user-given index
- `Deletion-At-End/` – delete value at the end

## General algorithm steps (deletion at index `k`)

1. Start with `n` existing elements.
2. Validate index: `0 <= k < n`.
3. Shift elements left: for `i = k` up to `n - 2`, set `arr[i] = arr[i + 1]`.
4. Decrease count: `n = n - 1`.

## Complexity

- **Time**
  - Beginning / Middle: `O(n)` (shifting can move up to `n` elements)
  - End: `O(1)` (just decrement the count)
- **Extra space (besides the array itself)**: `O(1)`

## Key learning points

- Deletion requires shifting elements to fill the gap (except at the end).
- Always validate the index (`0 <= index < n`).
- Track `n` (number of valid elements) separately from array capacity.
