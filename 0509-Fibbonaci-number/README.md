# **509. Fibonacci Number**

## Problem Statement

The Fibonacci numbers, commonly denoted as `F(n)`, form a sequence such that each number is the sum of the two preceding ones, starting from `0` and `1`.

```text
F(0) = 0
F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1
```

Given `n`, calculate `F(n)`.

---

## Example 1

**Input:**
```text
n = 2
```

**Output:**
```text
1
```

**Explanation:**
`F(2) = F(1) + F(0) = 1 + 0 = 1`

---

## Example 2

**Input:**
```text
n = 3
```

**Output:**
```text
2
```

**Explanation:**
`F(3) = F(2) + F(1) = 1 + 1 = 2`

---

## Example 3

**Input:**
```text
n = 4
```

**Output:**
```text
3
```

**Explanation:**
`F(4) = F(3) + F(2) = 2 + 1 = 3`

---

## Constraints

- `0 <= n <= 30`