# Problem Number - 230B T-primes  

**Problem Link:** [https://codeforces.com/problemset/problem/230/B](https://codeforces.com/problemset/problem/230/B)  

---

## Topics  
- Number Theory  
- Primality Testing (testing if number is prime or not)
- Math Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10⁵  
- 1 ≤ `n` ≤ 10¹²  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- A **T-prime** is defined as a number that has exactly three distinct divisors.  
- Observation:  
  - If a number `n` is a perfect square of a prime number, then it has exactly three divisors: `1`, `p`, and `p^2`.  
  - Example: `n = 9 = 3²` → divisors are {1, 3, 9}.  
- Approach:  
  - For each input number `n`:  
    1. Compute `a = sqrt(n)`.  
    2. Check if `a * a == n` (to confirm `n` is a perfect square).  
    3. If true, check if `a` is prime.  
    4. If both conditions hold → print `"YES"`. Otherwise → print `"NO"`.  
- Efficient primality test:  
  - Handle small cases directly.  
  - Eliminate multiples of 2 and 3.  
  - Check divisibility up to `sqrt(n)` using increments of 6 (`i` and `i+2`).  

## Time and Space Complexity  
- **Time Complexity:**  
  - For each query, checking square root is `O(1)`.  
  - Primality test runs in `O(√a)`, where `a = sqrt(n)`.  
  - Overall per test case: `O(√√n)`.  
  - With `n ≤ 10¹²`, `√n ≤ 10⁶`, so primality check is efficient.  
- **Space Complexity:** `O(1)`, only a few variables are used.  