# Problem Number - 2127A Mix Mex Max  
**Problem Link:** [https://codeforces.com/problemset/problem/2127/A](https://codeforces.com/problemset/problem/2127/A)  

---

## Topics
- Implementation  
- Arrays  
- Math (MEX concept)  

## Constraints
- 1 ≤ `t` ≤ 500  
- 3 ≤ `n` ≤ 100  
- -1 ≤ `a[i]` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem defines an array as *good* if for every consecutive triple `(a[i], a[i+1], a[i+2])`, the following holds:   `mex([a[i], a[i+1], a[i+2]]) = max([a[i], a[i+1], a[i+2]]) - min([a[i], a[i+1], a[i+2]])`  
- Missing elements are represented by `-1`, and we can replace them with any non-negative integer.  
- Key observations:  
  - If the array contains only `-1`s, we can replace them all with the same number (e.g., `1`), and the condition holds.  
  - If after removing `-1`, the set of values is empty → always "YES".  
  - If the set has exactly one element and it is not `0` → "YES".  
  - Otherwise, if there are multiple distinct values (excluding `-1`), the condition cannot be satisfied → "NO".  
- This reduces the problem to checking the distinct non-negative values present after removing `-1`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once and insert into a set.  
- **Space Complexity:** `O(n)`, for storing distinct elements in a set.  
