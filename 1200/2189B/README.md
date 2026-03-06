# Problem Number - 2189B The Curse of the Frog  

**Problem Link:** [https://codeforces.com/problemset/problem/2189/B](https://codeforces.com/problemset/problem/2189/B)  

---

## Topics
- Greedy  
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `a`, `b`, `c` ≤ 10⁶  
- 1 ≤ `x` ≤ 10¹⁸  
- Sum of `n` over all test cases ≤ 10⁵  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Each spell is defined by three integers `(a, b, c)`.  
- Casting the spell `b` times contributes:  
  - **Guaranteed damage:** `(b - 1) * a`  
  - **Potential extra damage:** `a * b - c`  
- The frog initially accumulates guaranteed damage from all spells.  
- If this guaranteed damage is already ≥ `x`, the answer is `0` (no extra casts needed).  
- Otherwise, we need to check the maximum possible extra damage (`maxVal`).  
  - If `maxVal ≤ 0`, it means no spell can increase damage further → answer is `-1`.  
  - Otherwise, we calculate how many additional casts are required: `casts = ⌈ (x - temp) / maxVal ⌉`  
  - This is implemented as `(x - temp + maxVal - 1) / maxVal` to avoid floating-point operations.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through all spells.  
- **Space Complexity:** `O(1)`, only a few variables are used for accumulation and tracking maximum values.  