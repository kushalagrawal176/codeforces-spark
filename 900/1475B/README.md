# Problem Number - 1475B New Year's Number  
**Problem Link:** [https://codeforces.com/problemset/problem/1475/B](https://codeforces.com/problemset/problem/1475/B)  

---

## Topics
- Implementation  
- Math  
- Number Theory  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁶  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether a given number `n` can be represented as a sum of some number of 2020s and some number of 2021s.  
- Key observation:  
  - If `n` is divisible by 2020 or 2021, the answer is immediately `"YES"`.  
  - Otherwise, check if the quotient `n / 2020` (number of 2020s used) is at least as large as the remainder `n % 2020`.  
  - This ensures that leftover units can be covered by replacing some 2020s with 2021s.  
- If this condition holds, print `"YES"`, otherwise `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only division and modulus operations are performed.  
- **Space Complexity:** `O(1)`, constant extra space used.  
