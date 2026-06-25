# 75. Sort Colors

## Problem Statement

Given an array `nums` with `n` objects colored **red**, **white**, or **blue**, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order:

- Red → `0`
- White → `1`
- Blue → `2`

Use the integers `0`, `1`, and `2` to represent the colors.

> **Note:** You must solve this problem **without using the library's sort function**.

---

## Examples

### Example 1

**Input:**
```text
nums = [2,0,2,1,1,0]
```

**Output:**
```text
[0,0,1,1,2,2]
```

---

### Example 2

**Input:**
```text
nums = [2,0,1]
```

**Output:**
```text
[0,1,2]
```

---

## Constraints

- `n == nums.length`
- `1 <= n <= 300`
- `nums[i]` is either `0`, `1`, or `2`
