# Problem Number - 1420A Cubes Sorting

**Problem Link:** [https://codeforces.com/problemset/problem/1420/A](https://codeforces.com/problemset/problem/1420/A)

---

## Topics
- Data Structures
- Sortings

## Constraints
- $1 ≤ t ≤ 1000$ (number of test cases)
- $2 ≤ n ≤ 5 \cdot 10^4$ (number of cubes)
- Sum of $n$ over all test cases does not exceed 10^5
- $1 ≤ a[i] ≤ 10^9$
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether we can sort an array of cubes in at most $\frac{n(n-1)}{2} - 1$ adjacent swaps (bubble sort style swaps).
- The maximum number of swaps required to sort any array in descending order is equal to the number of inversions (pairs `(i, j)` such that `i < j` and `a[i] > a[j]`).
- Specifically, adjacent swaps can at most reduce the number of inversions by 1 per swap. The total number of adjacent pairs is $\frac{n(n-1)}{2}$, which corresponds to a strictly decreasing array where every adjacent pair is in reverse order (`a[i-1] > a[i]`).
- If the array is strictly decreasing (i.e., every adjacent element satisfies `a[i-1] > a[i]`), the number of inversions is $\frac{n(n-1)}{2}$, and sorting it requires the maximum possible operations, which is equal to the allowed limit (meaning we cannot do it in *strictly fewer* than the maximum, so the answer is **NO**).
- If there is even one adjacent pair where `a[i-1] <= a[i]`, the total number of inversions is strictly less than the maximum, so we can always sort it within the allowed limit. Thus, the answer is **YES**.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, for iterating through the array once to check adjacent elements.
- **Space Complexity:** $O(n)$ or $O(1)$ auxiliary space, depending on whether the array elements are stored or processed on the fly.