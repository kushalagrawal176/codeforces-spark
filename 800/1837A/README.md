# Problem Number - 1837A Grasshopper on a Line  
**Problem Link:** [https://codeforces.com/problemset/problem/1837/A](https://codeforces.com/problemset/problem/1837/A)  

---

## Topics  
- Number Theory  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `x` ≤ 100  
- 2 ≤ `k` ≤ 100  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to find a way for the grasshopper to jump such that the sum of jumps equals `x` and the number of jumps is not divisible by `k`.  
- A simple strategy is:  
  - If `x % k != 0`, then the grasshopper can make a single jump of length `x`. This satisfies the condition immediately.  
  - If `x % k == 0`, then we cannot use a single jump. Instead, we split `x` into two jumps: `(x - 1)` and `1`.  
    - Their sum is still `x`.  
    - Neither `(x - 1)` nor `1` is divisible by `k` simultaneously, so the condition is satisfied.  
- This greedy approach ensures the minimum number of jumps while meeting the divisibility condition.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only simple arithmetic and modulus checks are performed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
