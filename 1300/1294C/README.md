# Problem Number - 1294C Product of Three Numbers  
**Problem Link:** [https://codeforces.com/problemset/problem/1294/C](https://codeforces.com/problemset/problem/1294/C)  

---

## Topics
- Number Theory  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 100 
- 2 ≤ `n` ≤ 10⁹
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine whether a given integer `n` can be expressed as the product of **three distinct integers greater than 1**.  
- **Step 1:** Iterate through possible divisors starting from 2.  
- **Step 2:** Find the first divisor `a` of `n`, then divide `n` by `a`.  
- **Step 3:** Continue searching for another divisor `b` of the reduced number, then divide again.  
- **Step 4:** The remaining quotient becomes `c`.  
- **Step 5:** Check that `a`, `b`, and `c` are all distinct and greater than 1.  
  - If valid, print `"YES"` and the three numbers.  
  - Otherwise, print `"NO"`.  

This ensures we only need to find two divisors, and the third comes naturally from division.

## Time and Space Complexity
- **Time Complexity:** `O(√n)`, since we only check divisors up to √n.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
