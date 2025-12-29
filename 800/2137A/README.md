# Problem Number - 2137A Collatz Conjecture  
**Problem Link:** [https://codeforces.com/problemset/problem/2137/A](https://codeforces.com/problemset/problem/2137/A)  

---

## Topics  
- Implementation  
- Math  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 400  
- 1 ≤ `k`, `x` ≤ 20   
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to compute the result of repeatedly applying the Collatz-like operation: multiply the number by 2, exactly `k` times, starting from `x`.  
- Since each operation doubles the number, after `k` steps the result is simply:  `n = x (2^k)`
- Instead of simulating step by step, we can directly compute the result using bit-shifting or fast exponentiation.  
- However, given the small constraint on `k` (≤ 30), even a simple loop multiplying by 2 works efficiently.  

## Time and Space Complexity  
- **Time Complexity:** `O(k)` per test case if simulated step by step, or `O(1)` if computed directly as `n = x (2^k)`.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  
