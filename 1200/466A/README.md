# Problem Number - 466A Cheap Travel  
**Problem Link:** [https://codeforces.com/problemset/problem/466/A](https://codeforces.com/problemset/problem/466/A)  

---

## Topics
- Implementation  
- Math  
- Greedy  

## Constraints
- 1 ≤ `n` ≤ 1000 (number of rides needed)  
- 1 ≤ `m` ≤ 1000 (rides covered by a special ticket)  
- 1 ≤ `a` ≤ 1000 (cost of a single ride ticket)  
- 1 ≤ `b` ≤ 1000 (cost of a special ticket)  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum cost to buy tickets for `n` rides.  
- There are two ticket types:  
  - Single ride ticket costing `a`.  
  - Special ticket covering `m` rides costing `b`.  
- To minimize cost:  
  - Compare the cost of buying all rides as single tickets (`n * a`).  
  - Compare with buying `(n / m)` special tickets plus `(n % m)` single tickets.  
  - Also compare with buying `(n / m + 1)` special tickets (to cover all rides, even if some are unused).  
- The minimum of these three options gives the answer.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, only a few arithmetic operations and comparisons.  
- **Space Complexity:** `O(1)`, constant space used for variables.  
