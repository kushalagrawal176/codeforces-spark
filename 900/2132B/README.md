# Problem Number - 2132B The Secret Number

**Problem Link:** [https://codeforces.com/problemset/problem/2132/B](https://codeforces.com/problemset/problem/2132/B)

---

## Topics
- Implementation  
- Number Theory  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 11 ≤ `n` ≤ 10¹⁸  
- **Time limit per test:** 2 seconds  
- **Memory limit per test:** 256 megabytes  

## Intuition / Approach
- Vadim thinks of a number `x` and appends a positive number of zeros to it, forming `y`.  
- He then spreads the number as `n = x + y`.  
- The task is to find all possible values of `x` for a given `n`.  

### Key Observations:
- `y` is always `x * 10^k` for some `k ≥ 1`.  
- Thus, `n = x + x * 10^k = x * (10^k + 1)`.  
- This means `x = n / (10^k + 1)` if and only if `n % (10^k + 1) == 0`.  
- We need to check all possible values of `k` (powers of 10) until `n / (10^k + 1) > 0`.  

### Steps:
1. Iterate over increasing powers of 10 (`d = 10, 100, 1000, ...`).  
2. For each `d`, check if `n % (d + 1) == 0`.  
3. If true, then `x = n / (d + 1)` is a valid candidate.  
4. Collect all valid `x` values in ascending order.  
5. If no valid `x` exists, output `0`.  

## Time and Space Complexity
- **Time Complexity:** `O(log₁₀(n))`, since we only check divisors of the form `10^k + 1` up to `n`.  
- **Space Complexity:** `O(log₁₀(n))`, for storing valid `x` values.  