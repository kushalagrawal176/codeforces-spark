# Problem Number - 2116A Gellyfish and Tricolor Pansy

**Problem Link:** [https://codeforces.com/problemset/problem/2116/A](https://codeforces.com/problemset/problem/2116/A)

---

## Topics
- Games
- Greedy

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `a`, `b`, `c`, `d` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem provides four integers `a, b, c, d` for each test case.  
- We need to determine whether the smallest among them belongs to the "Gellyfish group" (`b` or `d`) or the "Flower group" (`a` or `c`).  
- Steps:
  1. Compute the minimum of the four numbers.
  2. If the minimum is either `b` or `d`, output **"Gellyfish"**.
  3. Otherwise, output **"Flower"**.
- This is a straightforward comparison problem with no complex math or data structures involved.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we only compute the minimum of four numbers and check conditions.  
- **Space Complexity:** `O(1)`, as no extra memory is required beyond a few variables.