# Problem Number - 1328B K-th Beautiful String

**Problem Link:** [https://codeforces.com/problemset/problem/1328/B](https://codeforces.com/problemset/problem/1328/B)

---

## Topics
- Combinatorics  
- Implementation  
- Strings  
- Binary Search

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 3 ≤ `n` ≤ 10⁵  
- 1 ≤ `k` ≤ **min(2 ⋅ 10⁹, n(n-1)/2)**  
- Sum of `n` over all test cases ≤ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We need to construct the **k-th lexicographically smallest "beautiful string"** of length `n`, consisting of `'a'` and exactly two `'b'`.  
- The lexicographic order depends on the positions of the two `'b'` characters.  
- The strategy is to determine the positions of the two `'b'`s:
  - The first `'b'` is placed by finding the largest index such that the cumulative count of possible strings is ≥ `k`.  
  - The second `'b'` is placed based on the remaining offset after subtracting combinations.  
- More concretely:
  - Start with `index = 1`. While `k > index`, subtract `index` from `k` and increment `index`.  
  - After this loop, the two `'b'`s are placed at positions `n - index` and `n - k + 1` (counting from the left).  
- Fill the rest of the string with `'a'`.  

This ensures we directly compute the positions without generating all strings, keeping the solution efficient.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case in the naive construction, but since we only compute positions and print, the effective complexity is `O(n)` for output. The loop to find positions runs in `O(√k)`, which is efficient given constraints.  
- **Space Complexity:** `O(1)`, only constant extra space is used apart from the output string.  
