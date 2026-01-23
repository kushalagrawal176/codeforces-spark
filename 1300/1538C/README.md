# Problem Number - 1538C Number of Pairs  
**Problem Link:** [https://codeforces.com/problemset/problem/1538/C](https://codeforces.com/problemset/problem/1538/C)  

---

## Topics
- Two Pointers  
- Binary Search  
- Sorting  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴ 
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `l` ≤ `r` ≤ 2 × 10⁹  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to count the number of pairs `(i, j)` such that `l ≤ a[i] + a[j] ≤ r`.  
- **Step 1:** Sort the array.  
- **Step 2:** Define a helper function `countPairs(k)` that counts the number of pairs with sum ≤ `k`.  
  - Use a two-pointer approach:  
    - Start with `low = 0` and `high = n - 1`.  
    - If `a[low] + a[high] > k`, move `high` left.  
    - Otherwise, add `(high - low)` to the count (all pairs with `low` and indices up to `high` are valid), then move `low` right.  
- **Step 3:** The answer for each test case is `countPairs(r) - countPairs(l - 1)`.  
  - This ensures we only count pairs whose sum lies in the inclusive range `[l, r]`.  

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting: `O(n log n)`.  
  - Counting pairs: `O(n)` per query.  
  - Total per test case: `O(n log n)`.  
- **Space Complexity:** `O(n)`, for storing the array.  
