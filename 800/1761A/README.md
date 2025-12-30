# Problem Number - 1761A Two Permutations  
**Problem Link:** [https://codeforces.com/problemset/problem/1761/A](https://codeforces.com/problemset/problem/1761/A)  

---

## Topics
- Implementation  
- Math  
- Conditional Logic  

## Constraints
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `a`, `b` ≤ `n` ≤ 100
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether two permutations of length `n` can be constructed such that:  
  - The length of the longest common prefix of `p` and `q` is `a`.  
  - The length of the longest common suffix of `p` and `q` is `b`.   
- Observations:  
  - If both `a` and `b` equal `n`, then it is always possible → `"YES"`.  
  - If either `a` or `b` equals `n` but not both, then it is impossible → `"NO"`.  
  - Otherwise, check if there is enough space (`n - a - b ≥ 2`) to arrange the permutations without conflict. If yes → `"YES"`, else `"NO"`.  
- Approach:  
  - Read values of `n`, `a`, and `b`.  
  - Apply the above conditions directly using simple if-else checks.  
  - Print `"YES"` or `"NO"` accordingly.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only a few arithmetic checks are performed per test case.  
- **Space Complexity:** `O(1)`, no extra space apart from variables.  
