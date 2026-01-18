# Problem Number - 2171C1 Renako Amaori and XOR Game (easy version)  

**Problem Link:** [https://codeforces.com/problemset/problem/2171/C1](https://codeforces.com/problemset/problem/2171/C1)  

---

## Topics  
- Game Theory  
- XOR Properties  
- Implementation  
- Bitmasks

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (array length per test case)  
- `a[i]`, `b[i]` ∈ {0, 1} (binary arrays)  
- Total sum of `n` across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- We are given two binary arrays `a` and `b`.  
- The game revolves around counting the number of `1`s in both arrays (`one_1` and `one_2`).  
- At each index `i`:  
  - If `i` is even, the parity of `one_1` decides whether a swap can occur.  
  - If `i` is odd, the parity of `one_2` decides whether a swap can occur.  
- Swaps are allowed only when the parity condition is satisfied, and they adjust the counts of `one_1` and `one_2`.  
- After processing all indices:  
  - If both counts have the same parity → result is `"Tie"`.  
  - If `one_1` is odd → `"Ajisai"` wins.  
  - Otherwise → `"Mai"` wins.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since each element is processed once.  
- **Space Complexity:** `O(n)` for storing the arrays `a` and `b`.  
