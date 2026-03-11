# Problem Number - 2021B Maximize Mex  
**Problem Link:** [https://codeforces.com/problemset/problem/2021/B](https://codeforces.com/problemset/problem/2021/B)  

---

## Topics
- Greedy
- Implementation
- Arrays

## Constraints
- 1 ≤ `t` ≤ 5000  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `x` ≤ 10⁹  
- 0 ≤ `a[i]` ≤ 10⁹  
- Sum of n over all test cases ≤ 2 × 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The **MEX (minimum excluded value)** of an array is the smallest non-negative integer not present in the array.  
- We are allowed to repeatedly pick an element and increase it by `x`. This means duplicates of a number can be shifted forward by `x`.  
- To maximize the MEX:
  1. Count the frequency of each number up to `n` (since values greater than `n` don’t directly affect MEX ≤ n).  
  2. Start from `0` and check if it exists in the array.  
     - If it doesn’t, that’s the MEX.  
     - If it does, but has duplicates, we can **“push”** those duplicates forward by adding `x` to them, effectively filling future gaps.  
  3. Continue until we find the first missing number.  
- This greedy approach ensures that **we maximize the MEX by optimally using duplicates to fill gaps**.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the array and simulate MEX growth.  
- **Space Complexity:** `O(n)`, for storing frequency counts.  
