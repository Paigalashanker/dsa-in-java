# Prefix Sum (Java)

## What this program does

Builds a **prefix-sum array** from user input, then answers **range-sum queries** in constant time.

## Concept

A prefix-sum array `prefix[]` stores cumulative totals:

```
prefix[0] = arr[0]
prefix[1] = arr[0] + arr[1]
prefix[2] = arr[0] + arr[1] + arr[2]
...
prefix[i] = arr[0] + arr[1] + ... + arr[i]
```

Once built, the sum of any sub-array `arr[l..r]` is:

```
sum(l, r) = prefix[r] - prefix[l - 1]    (if l > 0)
           = prefix[r]                     (if l == 0)
```

## Algorithm steps

1. Read `n` elements into `arr[]`.
2. Create `prefix[]` of the same size.
3. Set `prefix[0] = arr[0]`.
4. For `i = 1` to `n - 1`: `prefix[i] = prefix[i - 1] + arr[i]`.
5. For each query `(l, r)`:
   - If `l == 0`, answer is `prefix[r]`.
   - Else, answer is `prefix[r] - prefix[l - 1]`.

## Example input/output

**Input**

```
Enter number of elements: 6
Enter 6 elements:
2 4 6 8 10 12

Enter number of queries: 2
Enter left and right index (0-based): 1 3
Enter left and right index (0-based): 0 5
```

**Output**

```
Prefix Sum Array: 2 6 12 20 30 42
Sum of arr[1..3] = 18
Sum of arr[0..5] = 42
```

## Complexity

- **Time complexity:**
  - Building prefix array: `O(n)`
  - Each range-sum query: `O(1)`
- **Space complexity:** `O(n)` for the prefix array

## Key learning points

- Without prefix sum, each range-sum query takes `O(n)`. With it, it takes `O(1)`.
- This is a classic **pre-computation** technique — spend a little time upfront to save a lot later.
- Prefix sums are the foundation for advanced topics like difference arrays, 2-D prefix sums, and more.

## File

- `PrefixSum.java`
