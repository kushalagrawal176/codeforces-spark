# Problem Number - 1475A Odd Divisor  
**Problem Link:** [https://codeforces.com/problemset/problem/1475/A](https://codeforces.com/problemset/problem/1475/A)  

---

## Topics  
- Bit Manipulation  
- Math  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 2 ≤ `n` ≤ 10¹⁴  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether a given number `n` has an **odd divisor greater than 1**.  
- Key observation:  
  - If `n` is a power of 2, then all its divisors are powers of 2 (hence even), so the answer is `"NO"`.  
  - Otherwise, `n` must have an odd divisor greater than 1, so the answer is `"YES"`.  
- To check if `n` is a power of 2, we can use the bitwise trick:  
  - `(n & (n - 1)) == 0` → `n` is a power of 2.  
  - Otherwise, `n` is not a power of 2.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since the check is constant time.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
