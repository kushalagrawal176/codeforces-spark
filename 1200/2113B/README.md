# Problem Number - 2113B Good Start

**Problem Link:** [https://codeforces.com/problemset/problem/2113/B](https://codeforces.com/problemset/problem/2113/B)

---

## Topics
- Implementation  
- Geometry  
- Modular Arithmetic  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `w`, `h`, `a`, `b` ≤ 10⁹  
- `-a+1` ≤ `x1`, `x2` ≤ `w-1`  
- `-b+1` ≤ `y1`, `y2` ≤ `h-1`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to move from point `(x₁, y₁)` to `(x₂, y₂)` using steps of fixed size `a` horizontally and `b` vertically.  
- A valid move requires that the difference in coordinates is divisible by the step size:
  - `(x₂ - x₁)` must be divisible by `a` if moving horizontally.  
  - `(y₂ - y₁)` must be divisible by `b` if moving vertically.  
- Additionally, the parity of steps matters: both horizontal and vertical moves must be achievable in the same number of steps (even/odd parity alignment).  
- If both conditions are satisfied, the answer is **YES**, otherwise **NO**.  

### Key Observations
- If `(x₂ - x₁) % a != 0` or `(y₂ - y₁) % b != 0`, movement is impossible.  
- If divisibility holds, check whether `(x₂ - x₁)/a` and `(y₂ - y₁)/b` have the same parity.  
- This ensures that both coordinates can be reached simultaneously.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic checks are performed.  
- **Space Complexity:** `O(1)`, no extra memory required.  