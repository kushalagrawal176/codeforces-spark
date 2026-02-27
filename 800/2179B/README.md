# Problem Number - 2179B Blackslex and Showering

**Problem Link:** [https://codeforces.com/problemset/problem/2179/B](https://codeforces.com/problemset/problem/2179/B)

---

## Topics
- Greedy
- Implementation
- Arrays

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 3 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ 100 
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives an array of floor numbers `a[1..n]`. The time taken to move is the sum of absolute differences between consecutive floors.
- Blackslex can **skip visiting at most one floor** to minimize the total time.
- First, compute the total time `z = Σ |a[i] - a[i+1]|` for all consecutive pairs.
- If we skip:
  - The **first floor**: subtract `|a[0] - a[1]|`.
  - The **last floor**: subtract `|a[n-2] - a[n-1]|`.
  - Any **middle floor `a[i]`**:  
    - Remove `|a[i-1] - a[i]| + |a[i] - a[i+1]|`  
    - Add `|a[i-1] - a[i+1]|` (direct connection after skipping).
- The minimum possible time is the smallest among these options.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we compute the total sum once and then check each possible skip in a single pass.  
- **Space Complexity:** `O(n)` for storing the array, though only `O(1)` extra space is used for calculations.
