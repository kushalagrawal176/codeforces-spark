# Problem Number - 1372B Omkar and Last Class of Math

**Problem Link:** [https://codeforces.com/problemset/problem/1372/B](https://codeforces.com/problemset/problem/1372/B)

---

## Topics
- Number Theory  
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10  
- 2 ≤ `n` ≤ 10⁹
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to split a given integer `n` into two positive integers `a` and `b` such that `a + b = n` and the **LCM(a, b)** is minimized.  
- Key observations:
  - If `n` is even, the optimal split is simply `n/2` and `n/2`. This ensures both numbers are equal, and their LCM is minimized.  
  - If `n` is odd, the best split comes from choosing a divisor of `n`. Specifically, if `d` is a divisor of `n`, then splitting as `(d, n - d)` gives a candidate pair.  
  - Among all divisors, the largest proper divisor of `n` yields the minimal LCM. This is because it balances the two numbers better than smaller divisors.  
- Therefore:
  - For even `n`: output `(n/2, n/2)`.  
  - For odd `n`: find the largest divisor `d` of `n` (other than `n` itself), and output `(d, n - d)`.  

## Note
- Above mentioned solution and approach is Brute Force and more intuitive.
- You can further optimise the code.
- **Hint** - No need to find LCM

## Time and Space Complexity
- **Time Complexity:**  
  - For each test case, finding the largest divisor requires checking up to `√n`.  
  - Thus, `O(√n)` per test case.  
- **Space Complexity:**  
  - `O(1)`, only constant space used for storing divisors and results.  
