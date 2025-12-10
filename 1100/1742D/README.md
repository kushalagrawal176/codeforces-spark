# Problem Number - 1742D Coprime  
**Problem Link:** [https://codeforces.com/problemset/problem/1742/D](https://codeforces.com/problemset/problem/1742/D)  

---

## Topics  
- Number Theory  
- Implementation  
- GCD  

## Constraints  
- 1 ≤ `t` ≤ 10  
- 2 ≤ `n` ≤ 2 × 10^5  
- 1 ≤ `aᵢ` ≤ 1000  
- Time limit per test: 3 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The task is to find the **maximum sum of indices (i + j)** such that the elements `a[i]` and `a[j]` are coprime.  
- Since each element value is bounded by 1000, we can store the **latest index** where each value appears.  
- For every pair of values `(x, y)` in the range [1, 1000]:  
  - If both appear in the array and `gcd(x, y) = 1`, compute `idx[x] + idx[y]`.  
  - Track the maximum sum across all valid pairs.  
- If no coprime pair exists, return `-1`.  
- This works because storing only the **largest index** for each value ensures we maximize `i + j`.  

---

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(n)` to process the array and record indices.  
  - `O(1000²) = O(1)` to check all pairs of values for coprimality.  
  - Overall efficient since `1000² = 1,000,000` operations is manageable.  
- **Space Complexity:** `O(1000) = O(1)`, for storing the latest index of each possible value.  

---
