# Problem Number - 2125C Count Good Numbers

**Problem Link:** [https://codeforces.com/problemset/problem/2125/C](https://codeforces.com/problemset/problem/2125/C)

---

## Topics
- Number Theory  
- Inclusion-Exclusion Principle  
- Implementation  
- Math  

## Constraints
- 1 ≤ t ≤ 1000  
- 2 ≤ n, m ≤ 10¹⁸
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem asks us to count "good numbers" in a given range `[n, m]`.  
- A number is considered **good** if it is **not divisible by 2, 3, 5, or 7**.  
- To solve this efficiently, we use the **Inclusion-Exclusion Principle**:
  - Start with all numbers up to `n`.  
  - Subtract those divisible by 2, 3, 5, or 7.  
  - Add back those divisible by pairs (LCM of two primes).  
  - Subtract those divisible by triples (LCM of three primes).  
  - Add back those divisible by all four (LCM of 2, 3, 5, 7 = 210).  
- This gives us a function `solve(x)` that counts good numbers up to `x`.  
- The answer for range `[n, m]` is `solve(m) - solve(n - 1)`. 

### Formula:
**solve(n) = n 
         - n/2 - n/3 - n/5 - n/7
         + n/6 + n/10 + n/14 + n/15 + n/21 + n/35
         - n/30 - n/42 - n/70 - n/105
         + n/210**

## Time and Space Complexity
- **Time Complexity:** `O(1)` per query, since the formula directly computes the count using division.  
- **Space Complexity:** `O(1)`, only constant space is used.  
