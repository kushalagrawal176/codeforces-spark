# Problem Number - 1451B Non-Substring Subsequence

**Problem Link:** [https://codeforces.com/problemset/problem/1451/B](https://codeforces.com/problemset/problem/1451/B)

---

## Topics
- Greedy
- Strings
- Two pointers

## Constraints
- $1 \le t \le 100$ (test cases)
- $2 \le n \le 100$ (length of string $s$)
- $1 \le q \le 100$ (queries per test case)
- $1 \le l < r \le n$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given a binary string $s$ of length $n$ and $q$ queries, each specifying a range $[l, r]$ (1-indexed) representing a substring $s[l \dots r]$.
- We need to check if there exists a **subsequence** of $s$ that is equal to $s[l \dots r]$ *and* has length strictly greater than $(r - l + 1)$ (i.e., a subsequence that is not a *contiguous* substring, which effectively means using at least one character outside the range $[l, r]$).
- A subsequence matches $s[l \dots r]$ and extends beyond it if and only if we can match the first character of the substring $s[l]$ with some occurrence of $s[l]$ in the prefix $s[1 \dots l-1]$, OR match the last character $s[r]$ with some occurrence of $s[r]$ in the suffix $s[r+1 \dots n]$.
- For each query $(l, r)$ (0-indexed converted as $l-1$ and $r-1$):
  - Check if character `s[l]` appears anywhere in the prefix `s[0 ... l-1]`.
  - Check if character `s[r]` appears anywhere in the suffix `s[r+1 ... n-1]`.
  - If either condition holds, output `YES`; otherwise, output `NO`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per query in the worst case (using substring search/prefix/suffix scan, or $O(n^2)$ total for all queries per test case, which easily passes for $n, q \le 100$). Can be optimized to $O(n)$ total precomputation per test case, or direct linear scan per query.
- **Space Complexity:** $O(n)$ for storing the string and substring views.