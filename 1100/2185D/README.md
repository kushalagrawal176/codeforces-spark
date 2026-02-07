# Problem Number - 2185D OutOfMemoryError

**Problem Link:** [https://codeforces.com/problemset/problem/2185/D](https://codeforces.com/problemset/problem/2185/D)

---

## Topics
- HashMap / Unordered Map
- Implementation
- Simulation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n`, `m` ≤ 2 ⋅ 10⁵  
- 1 ≤ `h` ≤ 10⁹  
- 0 ≤ `a[i]` ≤ `h`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given an initial array `a` of size `n`.  
- Then we perform `m` operations, each operation updates a specific index by adding a value `c`.  
- The twist: if **any updated value exceeds `h`**, the entire map of updates is cleared (reset).  
- Approach:
  1. Store updates in a map (`unordered_map` in C++ or `HashMap` in Java).
  2. For each operation:
     - If the index has not been updated before, set it to `a[b] + c`.
     - Otherwise, add `c` to the existing updated value.
     - If the updated value exceeds `h`, clear the map immediately.
  3. After all operations, print the final array:
     - If an index exists in the map, print its updated value.
     - Otherwise, print the original value from `a`.

This direct simulation matches the problem requirements.

## Time and Space Complexity
- **Time Complexity:** `O(n + m)` per test case, since we process all operations and then print the array.  
- **Space Complexity:** `O(n)`, for storing updates in the map.  
