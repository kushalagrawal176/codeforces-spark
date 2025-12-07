# Problem Number - 1926C Vlad and a Sum of Sum of Digits

**Problem Link:** [https://codeforces.com/problemset/problem/1926/C](https://codeforces.com/problemset/problem/1926/C)

---

## Topics
- Implementation  
- Prefix Sums  
- Math  
- DP

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 2⋅10^5  
- Time limit per test: 0.5 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks for the cumulative sum of digits of all integers from 1 to `n`.  
- For each number `i`, we compute its digit sum and add it to a prefix array.  
- This way, `a[n]` directly gives the sum of digits from 1 to `n`.  
- Precomputation ensures that each query can be answered in **O(1)** time.  
- Steps:
  1. Precompute digit sums for all numbers up to the maximum constraint (`200000`).  
  2. Store cumulative sums in an array `a[]`.  
  3. For each query, simply output `a[n]`.  

This approach leverages prefix sums to avoid recomputation for each test case.

## Time and Space Complexity
- **Precomputation Time Complexity:** `O(n log n)`, since digit sum of each number takes O(log n) operations.  
- **Query Time Complexity:** `O(1)`, direct lookup.  
- **Time Complexity:** `O(n log n)`, overall time complexity.  
- **Space Complexity:** `O(n)`, for storing prefix sums up to 200000.  

## Follow Up
- What if n is large 𝑛 = 10^9. Precomputation of sum won't be feasible
- `Hint` - use Digit dp 