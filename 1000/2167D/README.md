# Problem Number - 2167D Yet Another Array Problem

**Problem Link:** [https://codeforces.com/problemset/problem/2167/D](https://codeforces.com/problemset/problem/2167/D)

---

## Topics
- Number Theory
- GCD
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `aᵢ` ≤ 10¹⁸  
- Total sum of `n` across all test cases ≤ 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to find the **smallest integer x (2 ≤ x ≤ 10¹⁸)** such that there exists at least one element `a[i]` in the array with `gcd(a[i], x) = 1`.  
- If no such `x` exists, we must output `-1`.  

### Key Observations:
- If the **GCD of the entire array is 1**, then `x = 2` will always work, because at least one element will be coprime with 2.  
- If the **GCD of the array is greater than 1**, then every element shares a common divisor. In this case, we need to find the smallest integer `x` that is coprime with this GCD.  
- This reduces the problem to:  
  1. Compute `g = gcd(a[1], a[2], …, a[n])`.  
  2. If `g == 1`, answer is `2`.  
  3. Otherwise, find the smallest integer `x ≥ 2` such that `gcd(g, x) = 1`.  
- Since `g` can be very large (up to 10¹⁸), we don’t need to check all numbers up to 10¹⁸. It suffices to check small integers sequentially (like 2, 3, 4, …) until we find one coprime with `g`.  
- If no such number exists up to 10¹⁸ (which theoretically cannot happen because there will always be a prime not dividing `g`), we return `-1`.

## Time and Space Complexity
- **Time Complexity:**  
  - Computing GCD of the array: `O(n)`.  
  - Checking small integers up to a reasonable bound (e.g., 10⁴): `O(1)` in practice.  
  - Overall: `O(n)` per test case.  
- **Space Complexity:** `O(1)`, only storing the GCD and a few variables.  
