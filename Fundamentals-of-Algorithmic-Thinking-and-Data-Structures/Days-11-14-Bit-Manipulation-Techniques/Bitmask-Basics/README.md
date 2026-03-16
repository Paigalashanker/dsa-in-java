# Bitmask Basics

## Core Operations

1. **Set a bit:** n | (1 << i)
2. **Check a bit:** (n >> i) & 1
3. **Clear a bit:** n & ~(1 << i)
4. **Toggle a bit:** n ^ (1 << i)

## Applications

- Subset generation
- Permission/flag management
- State representation
- DP optimization

## Implementation

Write practical examples in `BitmaskBasics.java`
