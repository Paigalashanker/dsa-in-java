# Delete Loop Detection (Floyd's Algorithm)

## Problem Statement

Detect and remove cycles in a linked list using Floyd's Cycle Detection Algorithm.

## Algorithm

1. **Cycle Detection:** Two pointers (slow and fast) detect if cycle exists
2. **Find Cycle Start:** Find the node where cycle begins
3. **Remove Cycle:** Break the cycle by setting next pointer to null

## Floyd's Algorithm Steps

- Slow moves 1 step
- Fast moves 2 steps
- If they meet, cycle exists
- Find cycle start point
- Remove cycle

## Implementation

Write complete solution in `DeleteLoopDetection.java`

## Complexity

- Time: O(n)
- Space: O(1)
