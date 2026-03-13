# Palindrome Checking (Java)

## What this program does

Checks whether a string entered by the user is a **palindrome** — a word or phrase that reads the same forwards and backwards (ignoring case and non-alphanumeric characters).

## Concept

A palindrome reads identically in both directions.  
Examples: `"racecar"`, `"A man a plan a canal Panama"`, `"12321"`.

Steps taken before checking:

1. **Lowercase** the entire string (so `"Racecar"` equals `"racecar"`).
2. **Strip** spaces and punctuation (so `"A man, a plan"` becomes `"amanaplan"`).

Then use **two pointers** to compare characters from both ends inward.

## Algorithm steps

1. Read the input string.
2. Normalize: `cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "")`.
3. `left = 0`, `right = cleaned.length() - 1`.
4. While `left < right`:
   - If `cleaned.charAt(left) != cleaned.charAt(right)` → **not a palindrome**, break.
   - Else `left++`, `right--`.
5. Print the result.

## Example input/output

**Input**

```
Enter a string: A man a plan a canal Panama
```

**Output**

```
Original : A man a plan a canal Panama
Cleaned  : amanaplanacanalpanama
"A man a plan a canal Panama" IS a palindrome.
```

**Input**

```
Enter a string: hello
```

**Output**

```
Original : hello
Cleaned  : hello
"hello" is NOT a palindrome.
```

## Complexity

|           |                                          |
| --------- | ---------------------------------------- |
| **Time**  | `O(n)` — single pass after normalization |
| **Space** | `O(n)` — the cleaned string copy         |

## Key learning points

- Always clarify whether the palindrome check is **case-sensitive** and whether **spaces/punctuation** matter — interviewers often include these edge cases.
- Two-pointer is more efficient than reversing the string and comparing (`O(n)` versus building a new string).
- `replaceAll` with the regex `[^a-z0-9]` strips everything that is not a lowercase letter or digit.
