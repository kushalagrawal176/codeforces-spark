# Problem Number - 2202A Parkour Design

**Problem Link:** [https://codeforces.com/problemset/problem/2202/A](https://codeforces.com/problemset/problem/2202/A)

---

## Topics
- Implementation  
- Math  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `x` ≤ 10⁹ 
- -10⁸ ≤ `y` ≤ 10⁸
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to design a parkour path given two integers `x` and `y`.  
- The key condition is that the sum `(x + y)` must be divisible by 3, non-negative, and large enough to cover the absolute difference in jumps.  
- Conditions:
  - `(x + y) % 3 == 0` ensures the jumps can be evenly distributed.  
  - `(x + y) >= 0` ensures feasibility (no negative steps).  
  - `(x + y) / 3 >= abs(y)` ensures that the distribution of jumps can accommodate the larger of the two values.  
- If all conditions are satisfied, the answer is **YES**, otherwise **NO**.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a few arithmetic checks are performed.  
- **Space Complexity:** `O(1)`, as no extra memory is required beyond input variables.  