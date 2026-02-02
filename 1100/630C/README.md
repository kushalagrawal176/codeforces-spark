# Problem Number - 630C Lucky Numbers  
**Problem Link:** [https://codeforces.com/problemset/problem/630/C](https://codeforces.com/problemset/problem/630/C)  

---

## Topics
- Implementation  
- Math  
- Combinatorics

---

## Constraints
- 1 ≤ `n` ≤ 55  
- Time limit per test: 0.5 second  
- Memory limit: 64 megabytes  

---

## Intuition / Approach
- The problem defines **lucky numbers** as numbers consisting only of digits `7` and `8`.  
- For this specific task, the sequence of lucky numbers can be represented using powers of 2.  
- The array `a[i]` is precomputed as `2^i`.  
- The answer for a given `n` is simply the sum of the first `n` powers of 2 (excluding `a[0]`).  
- Mathematically, this is equivalent to:  The formula is: $\text{Sum} = 2^1 + 2^2 + \dots + 2^n = 2^{n+1} - 2$  
- This formula allows us to compute the result directly without storing all powers.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` if computed iteratively, or `O(1)` if using the closed-form formula.  
- **Space Complexity:** `O(1)`, since only a few variables are needed.  
