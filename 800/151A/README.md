# Problem Number - 151A Soft Drinking

**Problem Link:** [https://codeforces.com/problemset/problem/151/A](https://codeforces.com/problemset/problem/151/A)

---

## Topics
- Implementation
- Math
- Greedy

## Constraints
- 1 ≤ `n`, `k`, `l`, `c`, `d`, `p`, `nl`, `np` ≤ 1000
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks how many toasts `n` friends can make given limited resources:  
  - `k` bottles of drink, each with `l` milliliters.  
  - `c` limes, each cut into `d` slices.  
  - `p` grams of salt.  
  - Each toast requires `nl` milliliters of drink and `np` grams of salt.  
- Steps:
  1. Calculate total drink available: `k * l`.  
  2. Calculate maximum number of toasts possible from drink: `(k * l) / nl`.  
  3. Calculate maximum number of toasts possible from limes: `c * d`.  
  4. Calculate maximum number of toasts possible from salt: `p / np`.  
  5. The limiting factor is the minimum of these three values.  
  6. Divide by `n` to distribute equally among friends.  
- Example:  
  - Input: `3 4 5 10 8 100 3 10`  
  - Drink toasts = `(4*5)/3 = 6`  
  - Lime toasts = `10*8 = 80`  
  - Salt toasts = `100/10 = 10`  
  - Minimum = 6 → Each of 3 friends gets `6/3 = 2` toasts.  
  - Output: `2`

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, no extra space required.
