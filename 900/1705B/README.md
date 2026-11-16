# Problem Number - 1705B Mark the Dust Sweeper

**Problem Link:** [https://codeforces.com/problemset/problem/1705/B](https://codeforces.com/problemset/problem/1705/B)

---

## Topics
- Greedy
- Implementation

## Constraints
- $1 ≤ t ≤ 10^4$ (Number of test cases)
- $2 ≤ n ≤ 2 \cdot 10^5$ (Sum of $n$ over all test cases does not exceed $2 \cdot 10^5$)
- $0 ≤ a_i ≤ 10^9$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array of length $n$ where we can choose any element $a_i$ (where $1 \le i < n$) that is greater than 0, decrease it by 1, and increase the first available zero element to its right by 1.
- Our goal is to make all elements from index 1 to $n-1$ equal to 0 by moving dust to the final element ($n$-th element).
- To minimize operations:
  - Any non-zero element already present needs to be moved, contributing its value to the total operations.
  - Any zero encountered *after* we have started encountering non-zero elements (i.e., `sum != 0`) represents an empty slot we must pass through or fill, which costs an extra operation (incrementing `sum`).
  - We ignore the very last element ($n$-th element) during our loop because it acts as the final destination collector for all the dust.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, as we iterate through the array of size $n$ once.
- **Space Complexity:** $\mathcal{O}(1)$, as we only use a few variables for accumulation.