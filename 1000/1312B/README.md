# Problem Number - 1312B Bogosort
**Problem Link:** [https://codeforces.com/problemset/problem/1312/B](https://codeforces.com/problemset/problem/1312/B)

---

## Topics

1. Sorting  
2. Greedy  
3. Implementation  

---

## Constraints

1. 1 ≤ t ≤ 100  
2. 1 ≤ n ≤ 100  
3. 1 ≤ aᵢ ≤ 1000  

---

## Intuition / Approach

1. For each test case, you are given an array of integers `a₁, a₂, ..., aₙ`.  
2. You must output a permutation of this array such that **the array is not sorted in non-decreasing order**.  
3. The simplest way to ensure that is to **sort the array in decreasing order**.  
   - If the input array is sorted in increasing order, reversing it produces a strictly decreasing order — which satisfies the condition.  
   - Even if there are duplicates, sorting in descending order ensures it’s not non-decreasing.  

**Steps:**
- Read the number of test cases `t`.
- For each test case:
  - Read `n` and the array `a`.
  - Sort the array in **decreasing order**.
  - Print the sorted array.

This works because a strictly decreasing array can never be non-decreasing.

---

## Time and Space Complexity

- **Time Complexity:** `O(n log n)` per test case (for sorting)  
- **Space Complexity:** `O(n)` for storing the array elements