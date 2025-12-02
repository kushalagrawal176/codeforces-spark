# Problem Number - 1742E Scuza  
**Problem Link:** [https://codeforces.com/problemset/problem/1742/E](https://codeforces.com/problemset/problem/1742/E)  

---

## Topics  
- Prefix Sums  
- Binary Search  
- Implementation  

---

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n`, `q` ≤ 2 × 10⁵ (array size and number of queries)  
- 1 ≤ `aᵢ` ≤ 10⁹ (array elements)  
- 0 ≤ `kᵢ` ≤ 10⁹ (query values)  
- Time limit per test: 3 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- We are given an array `a` of size `n` and `q` queries. Each query provides a value `k`.  
- For each query, we need to compute the sum of all elements `a[i]` such that `a[i] ≤ k`.  
- A naive approach (checking each query against the array) would be too slow, since `n` and `q` can be as large as 2 × 10⁵.  

### Optimized Approach  
1. **Prefix Sum Construction:**  
   - Build a prefix sum array `prefix_sum[i]` that stores the sum of the first `i` elements.  
   - This allows us to quickly compute the sum of elements up to any index.  

2. **Maximum Element Tracking:**  
   - Maintain another array `max_ele[i]` that stores the maximum element among the first `i` elements.  
   - This helps us determine how many elements are ≤ `k`.  

3. **Binary Search:**  
   - For each query `k`, use binary search on `max_ele` to find the largest index `l` such that `max_ele[l] ≤ k`.  
   - The answer for that query is then `prefix_sum[l]`.  

This approach ensures that each query is answered in **O(log n)** time after preprocessing.  

---

## Time and Space Complexity  
- **Preprocessing:** `O(n)` for building prefix sums and max arrays.  
- **Query Handling:** `O(log n)` per query using binary search.  
- **Total Time Complexity:** `O(n + q log n)` per test case.  
- **Space Complexity:** `O(n)` for storing prefix sums and max arrays.  