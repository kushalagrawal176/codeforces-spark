# Problem Number - 460A Vasya and Socks  
**Problem Link:** [https://codeforces.com/problemset/problem/460/A](https://codeforces.com/problemset/problem/460/A)  

---

## Topics
- Implementation  
- Math  
- Simulation  

## Constraints
- 1 ≤ `n` ≤ 100 (initial number of socks)  
- 2 ≤ `m` ≤ 100 (exchange rate for new socks)  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Vasya starts with `n` socks.  
- Every day he wears one sock.  
- After wearing `m` socks, he can exchange them for one new sock.  
- The problem asks for the total number of days Vasya can continue wearing socks.  
- Instead of simulating day by day, we can derive a formula:  
  - Total days = `(n * m - 1) / (m - 1)`  
- This formula accounts for the initial socks and the additional socks Vasya gains through exchanges.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since the formula is computed directly.  
- **Space Complexity:** `O(1)`, only constant extra space used.  
