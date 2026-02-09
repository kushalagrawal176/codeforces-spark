# Problem Number - 1360D Buying Shovels  
**Problem Link:** [https://codeforces.com/problemset/problem/1360/D](https://codeforces.com/problemset/problem/1360/D)  

---

## Topics
- Number Theory  
- Divisors  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n` ≤ 10⁹  
- 1 ≤ `k` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of shovels in a package such that the total number of shovels `n` can be bought using packages of size at most `k`.  
- This boils down to finding a divisor of `n` that does not exceed `k`.  
- If `d` is a divisor of `n`, then `n/d` is also a divisor. One of them will represent the package size, and the other will represent the number of packages.  
- We want the package size to be ≤ `k`. Among all valid divisors, we choose the one that minimizes the number of packages (`n/d`).  
- To find divisors efficiently, iterate `i` from `1` to `√n`:
  - If `i` divides `n`, check both `i` and `n/i`.  
  - If either is ≤ `k`, update the answer with the corresponding number of packages.  
- This ensures we find the minimum possible number of packages.  

## Time and Space Complexity
- **Time Complexity:** `O(√n)`, since we only check divisors up to √n.  
- **Space Complexity:** `O(1)`, as only a few variables are used.  
