# Problem Number - 1506C Double-ended Strings

**Problem Link:** [https://codeforces.com/problemset/problem/1506/C](https://codeforces.com/problemset/problem/1506/C)

---

## Topics
- Strings
- Dynamic Programming
- Implementation

## Constraints
- 1 ≤ `t` ≤ 100 
- 1 ≤ `|a|`, `|b|` ≤ 20  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to minimize the number of operations required to make two strings equal by deleting characters from either end of both strings.
- Brute Force Approach:
    - generate all substrings and store in map and compare lengths
- The key observation is that the optimal solution depends on the **longest common substring** between the two strings.
- If the longest common substring has length `L`, then we can keep this substring in both strings and delete the rest.
- The number of deletions (operations) is: $ (|a| - L) + (|b| - L) $

- Thus, the problem reduces to finding the **Longest Common Substring (LCS)** length between the two strings.
- This can be solved using dynamic programming:
  - Define `dp[i][j]` as the length of the longest common suffix of `a[0..i-1]` and `b[0..j-1]`.
  - If `a[i-1] == b[j-1]`, then `dp[i][j] = dp[i-1][j-1] + 1`.
  - Otherwise, `dp[i][j] = 0`.
  - Track the maximum value of `dp[i][j]` across all indices to get the longest common substring length.

## Time and Space Complexity
- **Time Complexity:** `O(|a| × |b|)` per test case, since we compare all pairs of characters.  
- **Space Complexity:** `O(|a| × |b|)` for the DP table, but can be optimized to O(min(|a|, |b|)) using rolling arrays.  
