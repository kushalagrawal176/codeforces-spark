# Problem Number - 2123D Binary String Battle

**Problem Link:** [https://codeforces.com/problemset/problem/2123/D](https://codeforces.com/problemset/problem/2123/D)

---

## Topics
- Strings
- Greedy
- Game Theory
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 ⋅ 10⁵ (length of binary string)  
- 1 ≤ `k` < `n`  
- Sum of `n` across all test cases ≤ 2 ⋅ 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The game is played on a binary string of length `n` with parameter `k`.  
- Alice and Bob take turns removing subsequences and substrings respectively of length `k`. Alice wins if she can remove all `1`s, otherwise Bob wins.  
- Key observations:
  - If the total number of `1`s in the string is **less than or equal to k**, Alice can remove them in one move and win immediately.  
  - If the string length `n` is **less than 2k**, Alice can always force a win because Bob won’t have enough space to counter.  
  - Otherwise, Bob has a winning strategy since Alice cannot eliminate all `1`s in her first move and Bob can block her attempts.  

Thus, the decision boils down to:
- **Alice wins** if `one ≤ k` or `n < 2k`.  
- **Bob wins** otherwise.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we count the number of `1`s in the string.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  