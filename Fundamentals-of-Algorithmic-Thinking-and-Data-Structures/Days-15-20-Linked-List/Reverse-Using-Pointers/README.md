# Reverse Linked List Using Pointers

## Problem Statement

Reverse a linked list using pointer manipulation.

## Approaches

1. **Iterative Reversal:** Use three pointers (prev, current, next)
2. **Recursive Reversal:** Use call stack
3. **Reverse in K Groups:** Reverse every k elements

## Iterative Approach Steps

1. Initialize prev = null, current = head
2. While current exists:
   - Store next node
   - Reverse the pointer
   - Move prev and current forward
3. Update head to prev

## Implementation

Write all three approaches in `ReverseLinkedList.java`

## Complexity (Iterative)

- Time: O(n)
- Space: O(1)
