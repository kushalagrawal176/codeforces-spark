# Problem Number - 1833B Restore the Weather

**Problem Link:** [https://codeforces.com/problemset/problem/1833/B](https://codeforces.com/problemset/problem/1833/B)

---

## Topics
- Sorting
- Greedy
- Two Pointers

## Constraints
- 1 ≤ `t` ≤ $10^4$ (number of test cases)
- 1 ≤ `n` ≤ $10^5$ (length of arrays)
- 0 ≤ `k` ≤ $10^9$ (maximum absolute difference)
- $-10^9 ≤ a_i, b_i ≤ 10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array $a$ of predicted temperatures and an array $b$ of actual temperatures, where each element in $a$ can differ from its actual paired value in $b$ by at most $k$.
- Due to the properties of absolute differences and sorting, matching the smallest element of $a$ with the smallest element of $b$, the second smallest with the second smallest, and so on, satisfies the condition greedily.
- **Step 1:** Store the original indices of array $a$ so that we can restore the answer in the original order after sorting.
- **Step 2:** Sort array $a$ based on its values and sort array $b$ in non-decreasing order.
- **Step 3:** Map the sorted elements of $b$ to the original indices of $a$ using the stored index information.
- **Step 4:** Print the reconstructed array in the original order.

## Time and Space Complexity
- **Time Complexity:** $O(n \log n)$ per testcase, dominated by the sorting of arrays $a$ and $b$.
- **Space Complexity:** $O(n)$, required to store the pairs, the array $b$, and the answer array.