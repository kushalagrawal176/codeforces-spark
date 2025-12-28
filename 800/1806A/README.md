# Problem Number - 1806A Walking Master  
**Problem Link:** [https://codeforces.com/problemset/problem/1806/A](https://codeforces.com/problemset/problem/1806/A)  
---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- -10^8 ≤ `a`, `b`, `c`, `d` ≤ 10^8 (coordinates of start (a, b) and target (c, d))  
- Time limit per test: 1 second  
- Memory limit per test: 1024 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to move from point `(a, b)` to `(c, d)` using a specific movement rule:  
  - Each move increases `x` by 1 and decreases `y` by 1.  
- To reach `(c, d)` from `(a, b)`, we need to adjust the `y` coordinate first.  
  - If `d < b`, it is impossible since moves only decrease `y`.  
- Otherwise, the number of moves required to align `y` is `(d - b)`.  
- After these moves, the `x` coordinate becomes `a + (d - b)`.  
- If this new `x` is still less than `c`, it is impossible to reach the target.  
- Otherwise, the total moves = `(d - b) + (a + (d - b) - c)`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic checks are performed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
