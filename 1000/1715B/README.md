# Problem Number - 1715B Beautiful Array
**Problem Link:** [https://codeforces.com/problemset/problem/1715/B](https://codeforces.com/problemset/problem/1715/B)

---

## Topics
- Constructive Algorithms
- Greedy
- Math

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)
- 1 ≤ `n` ≤ $10^5$ (length of the array)
- 1 ≤ `k` ≤ $10^9$
- 0 ≤ `b` ≤ $10^9$
- 0 ≤ `s` ≤ $10^{18}$
- Sum of `n` over all test cases does not exceed $10^5$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are tasked with constructing an array of length `n` non-negative integers such that the total sum of elements is `s` and the total beauty $\sum \lfloor a[i]/k \rfloor$ equals `b`.
- **Validation Bounds**:
  - The **minimum** sum required to achieve beauty `b` is when all values are multiples of `k`, giving a total sum of $b \times k$.
  - The **maximum** sum achievable occurs when we get beauty `b` and maximize the remainder of each of the `n` elements (up to $k - 1$ per element). Thus, maximum sum = $b \times k + n \times (k - 1)$.
  - If `s` falls outside $[b \times k, b \times k + n \times (k - 1)]$, output `-1`.
- **Greedy Construction**:
  - Assign the initial base sum $b \times k$ to the first element `a[0]` to satisfy the primary requirement of beauty `b`.
  - Calculate the remaining required sum: $sum_{rem} = s - b \times k$.
  - Iterate through the array (starting from index `0`) and greedily add $\min(sum_{rem}, k - 1)$ to each element until $sum_{rem}$ becomes `0`. This guarantees no single element gets an added value of $k$ or more (which would alter the total beauty).

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, to fill and print the array elements.
- **Space Complexity:** $O(n)$ to store the generated array elements before printing, or $O(1)$ auxiliary space if printed directly.