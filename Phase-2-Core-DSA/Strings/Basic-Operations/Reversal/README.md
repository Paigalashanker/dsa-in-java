# String Reversal (Java)

## What this program does

Reverses a string entered by the user and prints both the original and the reversed version.

## Concept

A string is just a sequence of characters. To reverse it:

1. Convert the string to a `char[]` array.
2. Use **two pointers** — one at the start (`left`) and one at the end (`right`).
3. Swap the characters at both pointers, then move `left` forward and `right` backward.
4. Repeat until the pointers meet in the middle.

## Algorithm steps

1. Read the input string.
2. Convert to `char[]`.
3. `left = 0`, `right = length - 1`.
4. While `left < right`:
   - Swap `chars[left]` and `chars[right]`.
   - `left++`, `right--`.
5. Convert `char[]` back to `String` and print.

## Example input/output

**Input**

```
Enter a string: Hello World
```

**Output**

```
Original : Hello World
Reversed : dlroW olleH
```

## Complexity

|           |                                          |
| --------- | ---------------------------------------- |
| **Time**  | `O(n)` — each character is visited once  |
| **Space** | `O(n)` — the `char[]` copy of the string |

## Key learning points

- Java `String` objects are **immutable**, so you need a `char[]` (or `StringBuilder`) to perform in-place-style swaps.
- The two-pointer swap is the standard `O(n)` approach.
- `StringBuilder.reverse()` is a one-liner alternative, but understanding the manual approach is important for interviews.
