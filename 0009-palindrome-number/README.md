# 0009. Palindrome Number

## Problem Statement

Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

A palindrome number is a number that reads the same forward and backward.

---

## Examples

### Example 1

**Input:**

```text
x = 121
```

**Output:**

```text
true
```

**Explanation:**

121 reads as 121 from left to right and from right to left.

### Example 2

**Input:**

```text
x = -121
```

**Output:**

```text
false
```

**Explanation:**

From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.

### Example 3

**Input:**

```text
x = 10
```

**Output:**

```text
false
```

**Explanation:**

Reads 01 from right to left. Therefore, it is not a palindrome.

---

## Constraints

```text
-2³¹ <= x <= 2³¹ - 1
```

---

## Time Complexity

```text
O(log n)
```

## Space Complexity

```text
O(1)
```