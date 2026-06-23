# Power of Three

## Problem Statement

Given an integer `n`, return `true` if it is a power of three. Otherwise, return `false`.

An integer `n` is a power of three if there exists an integer `x` such that:

```text
n == 3^x
```

---

## Example 1

### Input
```text
n = 27
```

### Output
```text
true
```

### Explanation
```text
27 = 3^3
```

---

## Example 2

### Input
```text
n = 0
```

### Output
```text
false
```

### Explanation
```text
There is no x where 3^x = 0.
```

---

## Example 3

### Input
```text
n = -1
```

### Output
```text
false
```

### Explanation
```text
There is no x where 3^x = -1.
```

---

## Constraints

```text
-2^31 <= n <= 2^31 - 1
```
