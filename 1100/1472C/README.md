# Problem Number - 1472C Long Jumps  
**Problem Link:** [https://codeforces.com/problemset/problem/1472/C](https://codeforces.com/problemset/problem/1472/C)  

---

## Topics
- Dynamic Programming  
- Greedy  
- Implementation  

---

## Constraints
- 1 ≤ `t` ≤ 10000 (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10^5 (array length per test case)  
- 1 ≤ `a[i]` ≤ 10^9 (jump length at each position)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- You are given an array `a` where each element represents the jump length from that position.  
- Starting at index `i`, you gain `a[i]` points and then jump to `i + a[i]`.  
- If the jump goes outside the array, the game ends.  
- The task is to find the **maximum score achievable** starting from any index.  

### Approach:
1. Define `dp[i]` as the maximum score starting at index `i`.  
   - Base case: `dp[i] = a[i]`.  
   - Transition: If `i + a[i] < n`, then `dp[i] += dp[i + a[i]]`.  
2. Iterate from right to left so that future states (`dp[j]`) are already computed when needed.  
3. Track the global maximum across all `dp[i]`.  

This ensures that each position is processed once, and the solution is efficient for large `n`.  

---

## Time and Space Complexity
- **Time Complexity:** O(n) per test case, since each index is processed once.  
- **Space Complexity:** O(n), for storing the DP array.  
