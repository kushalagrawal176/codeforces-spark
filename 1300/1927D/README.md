# Problem Number - 1927D Find the Different Ones!  
**Problem Link:** [https://codeforces.com/problemset/problem/1927/D](https://codeforces.com/problemset/problem/1927/D)  

---

## Topics
- Arrays  
- Implementation  
- Preprocessing  
- Query Handling  
- Binary Search

---

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (array length)  
- 1 ≤ `a[i]` ≤ 10⁶ (array elements)  
- 1 ≤ `q` ≤ 2 × 10⁵ (number of queries)  
- 1 ≤ `l` ≤ `r` ≤ `n`   
- Time limit per test: 5 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to answer queries about finding two different elements in a subarray `[l, r]`.  
- If all elements in the range are equal, the answer is `-1 -1`. Otherwise, we must output two indices where the values differ.  
- A direct approach (checking each query naively) would be too slow because of large constraints.  
- To optimize:
  - Preprocess the array to store, for each index `i`, the nearest position `j > i` where `a[i] != a[j]`.  
  - This can be done in a single pass using two pointers.  
  - For each query `(l, r)`, check if the precomputed `ans[l]` lies within `r`.  
    - If yes, output `(l, ans[l])`.  
    - Otherwise, output `-1 -1`.  
- This ensures queries are answered in **O(1)** after preprocessing.  

---

## Time and Space Complexity
- **Preprocessing Complexity:** `O(n)`, single pass through the array.  
- **Query Complexity:** `O(1)` per query.  
- **Total Complexity:** `O(n + q)` per test case.  
- **Space Complexity:** `O(n)`, for storing the `ans[]` array.  
