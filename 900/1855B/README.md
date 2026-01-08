# Problem Number - 1855B Longest Divisors Interval  
**Problem Link:** [https://codeforces.com/problemset/problem/1855/B](https://codeforces.com/problemset/problem/1855/B)  

---

## Topics
- Number Theory  
- Divisors  
- Math
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10¹⁸  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the longest interval starting from 1 where every integer divides `n`.  
- In other words, we want the largest `k` such that `n % i == 0` for all `i` in `[1, k]`.  
- The approach is straightforward:  
  - Start from `x = 1`.  
  - While `n % x == 0`, increment `x`.  
  - Once we find an `x` that does not divide `n`, the answer is `x - 1`.  
- This works because the interval must be consecutive starting from 1, so the first non-divisor breaks the chain.  

## Time and Space Complexity
- **Time Complexity:** `O(k)`, where `k` is the length of the longest divisor interval. In practice, this is efficient because `k` is small compared to `n`.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  
