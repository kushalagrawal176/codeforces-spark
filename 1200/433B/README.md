# Problem Number - 433B Kuriyama Mirai's Stones  
**Problem Link:** [https://codeforces.com/problemset/problem/433/B](https://codeforces.com/problemset/problem/433/B)  

---

## Topics
- Prefix Sums  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 10⁵ (number of stones)  
- 1 ≤ `a[i]` ≤ 10⁹ (stone values)  
- 1 ≤ `m` ≤ 10⁵ (number of queries)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given two types of queries:  
  1. Sum of values between indices `[l, r]` in the **original array**.  
  2. Sum of values between indices `[l, r]` in the **sorted array**.  

- To answer queries efficiently:  
  1. Build a **prefix sum array** `a[]` for the original sequence.  
  2. Sort the array into `b[]` and build another **prefix sum array** for the sorted sequence.  
  3. For each query:  
     - If type = 1 → use prefix sums from `a[]`.  
     - If type = 2 → use prefix sums from `b[]`.  
  4. The sum for range `[l, r]` can be computed as:  
     - `prefix[r] - prefix[l-1]` (handling the case when `l = 1`).  

- This ensures each query is answered in **O(1)** after preprocessing.

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n log n)` for sorting.  
  - `O(n)` for building prefix sums.  
  - `O(1)` per query.  
  - Overall: `O(n log n + m)`.  

- **Space Complexity:** `O(n)` for storing arrays and prefix sums.  