# Problem Number - 2055B Crafting  
**Problem Link:** [https://codeforces.com/problemset/problem/2055/B](https://codeforces.com/problemset/problem/2055/B)  

---

## Topics  
- Greedy  
- Sorting  
- Arrays  
- Implementation  

---

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (number of items)  
- 0 ≤ `a[i]`, `b[i]` ≤ 10⁹ (values of arrays)  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- You are given two arrays `a` and `b` of length `n`.  
- For each index `i`, compute `diff[i] = a[i] - b[i]`.  
- The problem reduces to checking whether the sum of the two smallest differences is non-negative.  
- **Reasoning:**  
  - Sorting the differences ensures we can easily find the two smallest values.  
  - If their sum is negative, it means at least two items cannot be crafted successfully.  
  - Otherwise, crafting is possible → output `"YES"`.  

---

## Time and Space Complexity  
- **Sorting:** `O(n log n)`, to sort the differences.  
- **Computation:** `O(n)`, to calculate differences.  
- **Total Time Complexity:** `O(n log n)` per test case.  
- **Space Complexity:** `O(n)`, for storing differences.  
