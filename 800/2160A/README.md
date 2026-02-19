# Problem Number - 2160A MEX Partition

**Problem Link:** [https://codeforces.com/problemset/problem/2160/A](https://codeforces.com/problemset/problem/2160/A)

---

## Topics
- Implementation
- Math
- Greedy

## Constraints
- 1 ≤ `n` ≤ 100
- 0 ≤ `a[i]` ≤ 100
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem defines a **valid partition** of a multiset as one where the **MEX (minimum excluded number)** of all subsets is the same.
- The **score** of such a partition is that common MEX value.
- We are asked to find the **minimum possible score** over all valid partitions.

### Key Insight:
- To minimize the score, we need to determine the smallest integer `x` such that not all subsets can contain `x`.
- This boils down to finding the **first integer that appears fewer than 2 times** in the array:
  - If an integer appears **0 times**, it cannot be included in any subset → **MEX = that integer**.
  - If an integer appears **exactly 1 time**, only one subset can contain it, so another subset will miss it → **MEX = that integer**.
  - If an integer appears **≥ 2 times**, we can distribute it across subsets, so it doesn’t restrict the MEX.

Thus, the answer is the **smallest integer with frequency < 2**.

## Time and Space Complexity
- **Time Complexity:** `O(n + m)`, where `m` is the maximum possible value (bounded by 101). Effectively O(n).
- **Space Complexity:** `O(m)`, for storing frequencies of numbers.