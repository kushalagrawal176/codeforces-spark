# Problem Number - 189A Cut Ribbon  

**Problem Link:** [https://codeforces.com/problemset/problem/189/A](https://codeforces.com/problemset/problem/189/A)  

---

## Topics  
- Dynamic Programming  
- Brute Force  
- Implementation  

## Constraints  
- 1 ≤ `n` ≤ 4000  
- 1 ≤ `a`, `b`, `c` ≤ 4000  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given a ribbon of length `n` and three possible cut lengths `a`, `b`, and `c`.  
- The goal is to maximize the number of pieces we can cut the ribbon into.  
- Brute force approach:  
  - Iterate over possible counts of pieces of length `a` and `b`.  
  - For each combination, compute the remaining length `k = n - (a*i + b*j)`.  
  - If `k` is non-negative and divisible by `c`, then we can cut `k/c` pieces of length `c`.  
  - Track the maximum number of pieces across all valid combinations.  
- This works because the constraints are small enough (`n ≤ 4000`) to allow nested loops.  

## Time and Space Complexity  
- **Time Complexity:** `O(n²)`, since we try all combinations of `i` and `j` up to `n`.  
- **Space Complexity:** `O(1)`, only a few variables are used to track counts and the maximum.  