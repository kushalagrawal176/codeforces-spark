# Problem Number - 2154B Make it Zigzag  

**Problem Link:** [https://codeforces.com/problemset/problem/2154/B](https://codeforces.com/problemset/problem/2154/B)  

---

## Topics
- Greedy  
- Implementation  
- Arrays  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (array length)  
- 1 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 1.5 seconds  
- Memory limit: 256 megabytes  

## Note
- All the steps done are based on **0 indexing**
- Problem definition is as per **1 based indexing**.

## Intuition / Approach
- The task is to transform the array into a **zigzag sequence** where elements at even indices are strictly smaller than their neighbors **(0-based indexing)**.  
- For each element at an even index `i`, we must ensure:
  - `a[i] < a[i-1]` (if `i-1` exists)  
  - `a[i] < a[i+1]` (if `i+1` exists)  
- we can perform following operations any number of times:
  - **operation 1** - replace `a[i]` by prefix max up to `i` **max(a[0], a[1], a[2], ..., a[i])**
  - **operation 2** - decrease `a[i]` by 1
- Find minimum number of times we need to perform operation 2 to satisfy above condition. We don't need to minimize number of operation 1.  
- Odd indices can be adjusted greedily to maintain the maximum seen so far, ensuring the zigzag property holds.  
- Even indices can be adjusted greedily by operation 2.

### Steps:
1. Traverse the array and track the maximum value encountered.  
2. For odd indices, set them to the running maximum (to maintain the zigzag structure).  
3. For even indices, check both neighbors:
   - If `a[i] >= a[i+1]`, reduce `a[i]` by `(a[i] - a[i+1] + 1)`.  
   - If `a[i] >= a[i-1]`, reduce `a[i]` by `(a[i] - a[i-1] + 1)`.  
4. Accumulate the total reductions as the answer.  

This greedy approach ensures minimal operations while satisfying the zigzag condition.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the array once.  
- **Space Complexity:** `O(n)` for storing the array.  
