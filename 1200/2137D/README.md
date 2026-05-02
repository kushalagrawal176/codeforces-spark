# Problem Number - 2137D Replace with Occurrences  

**Problem Link:** [https://codeforces.com/problemset/problem/2137/D](https://codeforces.com/problemset/problem/2137/D)  

---

## Topics
- Implementation  
- Arrays  
- Hashing / Maps  

---

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (array size per test case)  
- 1 ≤ `bᵢ` ≤ `n` (array elements)  
- Sum of `n` across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- We are given an array `b` of length `n`. Each element `b[i]` specifies the size of the group that index `i` must belong to.  
- The task is to construct an array `a` such that:  
  - Each group of size `x` (where `x = b[i]`) is assigned the same label.  
  - The number of occurrences of `x` in `b` must be divisible by `x`. Otherwise, it is impossible to partition into valid groups.  

### Steps:
1. **Group positions by value:**  
   Use a map from value `x` → list of indices where `b[i] = x`.  

2. **Check divisibility condition:**  
   For each group size `x`, verify that the number of positions collected is divisible by `x`.  
   - If not divisible, output `-1`.  

3. **Assign labels:**  
   Traverse each group of indices in chunks of size `x`.  
   - Assign a unique label (incrementing counter) to all indices in that chunk.  

4. **Output the array `a`:**  
   Print the constructed array after processing all groups.  

---

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` per test case, since we process each element once and assign labels.  

- **Space Complexity:**  
  - `O(n)` for storing positions and result array.  
  - Efficient within given constraints.  
