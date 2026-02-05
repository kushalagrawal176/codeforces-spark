# Problem Number - 1872C Non-coprime Split  

**Problem Link:** [https://codeforces.com/problemset/problem/1872/C](https://codeforces.com/problemset/problem/1872/C)  

---

## Topics
- Number Theory  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 500  
- 1 ≤ `l` ≤ `r` ≤ 10⁷  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to split an integer `x` (where `l ≤ x ≤ r`) into two positive integers `a` and `b` such that `a + b = x` and `gcd(a, b) > 1`.  
- If `r ≤ 3`, it is impossible to find such a split, so the answer is `-1`.  
- If `l == r` and `r` is prime, then no valid split exists because any decomposition of a prime number into two positive integers will result in coprime numbers.  
- Otherwise, we can find a non-trivial divisor of `x` (or `x-1` if `x` is prime).  
  - Let `d` be the smallest divisor of `x`. Then we can split `x` into `(d, x - d)`.  
  - This guarantees that `gcd(d, x - d) = d > 1`.  
- Thus, the approach is:  
  1. If `r ≤ 3`, print `-1`.  
  2. If `l == r` and `r` is prime, print `-1`.  
  3. Otherwise, find a divisor of `r` (or `r-1` if `r` is prime) and print the split.  

## Time and Space Complexity
- **Time Complexity:**  
  - Checking primality/divisor up to `sqrt(n)` → `O(√n)` per test case.  
  - With up to `10^4` test cases, this is efficient enough.  
- **Space Complexity:** `O(1)`, only constant space used for divisor checks.  