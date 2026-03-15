# Array Insertion (Java)

Array insertion means adding a new element at a specific position in an array.

Because arrays store elements in **contiguous memory**, you usually cannot “just insert” in the middle without moving some elements.

## Core idea

- If you insert at the **beginning** or **middle**, you must **shift elements to the right** to make space.
- If you insert at the **end** (and there is free capacity), you simply place the value at the next index.

## Programs in this folder

- `Insertion-At-Beginning/` – insert value at index `0`
- `Insertion-At-Middle/` – insert value at a user-given index
- `Insertion-At-End/` – insert value at the end (append)

## General algorithm steps (insertion at index `k`)

1. Start with `n` existing elements.
2. Make sure there is **capacity** for one more element.
3. Shift elements right: for `i = n` down to `k + 1`, set `arr[i] = arr[i - 1]`.
4. Place the new value: `arr[k] = value`.
5. Increase count: `n = n + 1`.

## Complexity

- **Time**
  - Beginning / Middle: `O(n)` (shifting can move up to `n` elements)
  - End:
    - `O(1)` _if_ the array has free capacity
    - `O(n)` in this repo’s `Insertion-At-End` program because it creates a new array and copies elements
- **Extra space (besides the array itself)**
  - Beginning / Middle: `O(1)`
  - End (this repo’s implementation): `O(n)` because of the new array

## Key learning points

- Arrays are fixed-size; insertion often requires shifting.
- Always validate the index (`0 <= index <= n`).
- Track `n` (number of valid elements) separately from array capacity.
