# Problem Number - 1986C Update Queries

**Problem Link:** [https://codeforces.com/problemset/problem/1986/C](https://codeforces.com/problemset/problem/1986/C)

---

## Topics
- Greedy
- Sorting
- Strings
- Data Structures

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n, m \le 2 \times 10^5$
- Sum of $n$ and sum of $m$ over all test cases do not exceed $2 \times 10^5$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem provides a string `s` of length `n`, an array of indices where updates should happen, and a string `c` of length `m` containing characters to be used for updates.
- To make the resulting string lexicographically smallest, we should place the smallest available characters from string `c` into the specified update indices.
- Since duplicate indices can be present in the query array, using a `std::set` (or sorting and removing duplicates) ensures we only update each unique index once.
- We then sort string `c` in ascending order so that the smallest characters are readily accessible.
- By iterating through the unique target indices in increasing order, we replace the characters in `s` using the smallest characters from `c` sequentially.

## Time and Space Complexity
- **Time Complexity:** $O(m \log m + n)$, due to sorting the indices and character string `c`, alongside linear traversals.
- **Space Complexity:** $O(n + m)$, required to store the strings and unique indices set.