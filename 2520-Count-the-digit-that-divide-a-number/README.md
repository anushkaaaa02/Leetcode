# **2520. Count the Digits That Divide a Number**

## Problem Statement

Given an integer `num`, return the number of digits in `num` that divide `num`.

An integer `val` divides `num` if `num % val == 0`.

---

## Example 1

**Input:**
```text
num = 7
```

**Output:**
```text
1
```

**Explanation:**
7 divides itself, hence the answer is 1.

---

## Example 2

**Input:**
```text
num = 121
```

**Output:**
```text
2
```

**Explanation:**
121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.

---

## Example 3

**Input:**
```text
num = 1248
```

**Output:**
```text
4
```

**Explanation:**
1248 is divisible by all of its digits, hence the answer is 4.

---

## Constraints

- `1 <= num <= 10^9`
- `num` does not contain `0` as one of its digits.