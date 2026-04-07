# Problem Number - 2166B Tab Closing  

**Problem Link:** [https://codeforces.com/problemset/problem/2166/B](https://codeforces.com/problemset/problem/2166/B)  

---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `b` ≤ `a`, `n` ≤ 10⁹ 
- Time limit per test: 1.5 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a scenario where you have two values `a` and `b`, and a multiplier `n`.  
- You need to determine whether closing tabs can be done in **1 step** or requires **2 steps**.  
- The key condition is:
  - If `n * b <= a` (meaning the total effect of `n` tabs with value `b` does not exceed `a`)  
  - Or if `b >= a` (the second value is already greater or equal to the first),  
  - Then the answer is `1`.  
- Otherwise, it requires `2`.  
- This boils down to a simple comparison check, making the solution very efficient.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a constant number of comparisons are made.  
- **Space Complexity:** `O(1)`, as no extra space is required beyond input variables.  