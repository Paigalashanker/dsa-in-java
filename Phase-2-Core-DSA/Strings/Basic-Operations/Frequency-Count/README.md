# Frequency Count (Java)

## What this program does

Counts how many times **each character** appears in the string entered by the user, then prints a report.

## Concept

Every character has a unique **ASCII value** (e.g. `'A'` = 65, `'a'` = 97, `'0'` = 48).  
We create an integer array of size **256** (covering all extended ASCII characters) and use each character's ASCII value as an index.

```
freq['a']++;   // same as freq[97]++
```

One pass through the string is all that is needed.

## Algorithm steps

1. Read the input string.
2. Create `int[] freq = new int[256]`.
3. For each character `c` in the string: `freq[(int) c]++`.
4. Loop from `i = 0` to `255`:
   - If `freq[i] > 0`, print `(char)i` and its count.

## Example input/output

**Input**

```
Enter a string: hello
```

**Output**

```
Character frequencies in "hello":
  'e' -> 1
  'h' -> 1
  'l' -> 2
  'o' -> 1
```

## Complexity

|           |                                                         |
| --------- | ------------------------------------------------------- |
| **Time**  | `O(n)` — single pass over the string                    |
| **Space** | `O(1)` — the `freq` array is always size 256 (constant) |

## Key learning points

- Using an array indexed by ASCII value is the classic `O(n)` approach — no `HashMap` needed for standard characters.
- For Unicode strings a `HashMap<Character, Integer>` is the more general solution.
- This technique is foundational for problems like **anagram detection**, **first unique character**, and **most frequent character**.
