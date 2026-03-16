# Dummy Node Technique

## Concept

Use a dummy node pointing to the head to simplify edge case handling.

## Advantages

1. Eliminates special cases for head node
2. Cleaner and more readable code
3. Easier to handle insertion/deletion at beginning
4. Reduces bug potential

## Applications

1. Remove duplicates from sorted list
2. Remove specific element
3. Merge sorted lists
4. Reorder list operations

## Pattern

```
Node dummy = new Node(0);
dummy.next = head;
Node current = dummy;
// Perform operations
return dummy.next;
```

## Implementation

Write practical examples in `DummyNodeTechnique.java`
