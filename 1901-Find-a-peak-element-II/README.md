# **LeetCode 1901 - Find a Peak Element II**

## 📌 Problem Statement
Given an `m × n` matrix `mat` where no two adjacent cells are equal, return the position of **any peak element**.

A **peak element** is a cell that is **strictly greater** than its adjacent neighbors (up, down, left, and right).

The required time complexity is **O(m log n)** or **O(n log m)**.

---

## 💡 Intuition
Instead of checking every cell, we can apply **Binary Search** on the columns.

For each middle column:
- Find the maximum element in that column.
- Compare it with its left and right neighbors.
- If it is greater than both, it is a peak.
- Otherwise, move towards the side having the larger neighbor because a peak is guaranteed to exist there.

This reduces the search space by half in every iteration.

---

## 🚀 Algorithm
1. Initialize `low = 0` and `high = numberOfColumns - 1`.
2. While `low <= high`:
   - Find the middle column.
   - Find the row having the maximum value in that column.
   - Compare it with its left and right neighbors.
   - If it is greater than both, return its coordinates.
   - If the left neighbor is greater, search in the left half.
   - Otherwise, search in the right half.
3. Return the peak position.

---

## ⏱️ Complexity Analysis
- **Time Complexity:** `O(m × log n)`
- **Space Complexity:** `O(1)`

---

## 🏷️ Topics
- Binary Search
- Matrix
- Divide and Conquer

---

## ✅ Key Takeaway
The matrix is **not sorted**, but Binary Search still works because we are searching on the **columns** and using the direction of a larger neighboring element to safely eliminate half of the search space in every step.