# Problem Number - 2209B Array

**Problem Link:** [https://codeforces.com/problemset/problem/2209/B](https://codeforces.com/problemset/problem/2209/B)

---

## Topics
- Implementation
- Arrays
- Comparisons

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)
- 1 ≤ `n` ≤ 5000 (size of array)
- Array elements can be large, so `long long` in C++ / `long` in Java is used
- Time limit per test: 1.5 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- For each test case, we are given an array of size `n`.
- For each element `a[i]`, compare it with all subsequent elements `a[j]` where `j > i`.
- Count how many of those elements are greater (`maxi`) and how many are smaller (`mini`).
- The answer for each position `i` is `max(mini, maxi)`.
- Print these values for all positions in the array.

## Time and Space Complexity
- **Time Complexity:** `O(n²)` per test case, since for each element we compare with all subsequent elements.
- **Space Complexity:** `O(n)`, for storing the array of size `n`.
