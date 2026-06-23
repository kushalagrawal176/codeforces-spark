# Problem Number - 2013B Battle for Survive

**Problem Link:** [https://codeforces.com/problemset/problem/2013/B](https://codeforces.com/problemset/problem/2013/B)

---

## Topics
- Implementation
- Math
- Greedy

---

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 2 ≤ `n` ≤ 2 ⋅ 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem provides `n` integers. The first `n-2` represent values that contribute to a cumulative sum.  
- The last two integers represent special values that interact with this sum.  
- The process is:
  1. Compute the sum of the first `n-2` numbers.
  2. Subtract this sum from the `(n-1)`-th number.
  3. Subtract the result from the `n`-th number.
- The final result after these two subtractions is the answer for each test case.  

This is essentially a straightforward implementation problem where careful handling of input and arithmetic is required.

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the first `n-2` numbers.  
- **Space Complexity:** `O(1)`, only constant space is used for accumulation.  
