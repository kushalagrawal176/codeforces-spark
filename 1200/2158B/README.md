# Problem Number - 2158B Split

**Problem Link:** [https://codeforces.com/problemset/problem/2158/B](https://codeforces.com/problemset/problem/2158/B)

---

## Topics
- Implementation  
- Math  
- Frequency Counting  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 ⋅ 10⁵ (half the array size)  
- 1 ≤ `aᵢ` ≤ `2n` (array elements)  
- Sum of `n` across all test cases ≤ 2 ⋅ 10⁵  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given `2n` integers, each between `1` and `2n`.  
- The task is to split them into two groups of size `n` such that the maximum possible number of distinct integers having odd frequencies is achieved.  
- To solve this, we count the frequency of each integer.  
  - If a number appears an **odd number of times**, it contributes `m` (odd frequency count).  
  - If a number appears an **even number of times**, it contributes `k` (even frequency count).  
- The answer is generally `2*k + m`.  
- However, if there are no odd frequencies (`m == 0`), we need to adjust based on the parity of `n` and `k`.  
  - If `(n & 1) != (k & 1)`, subtract 2 from the result.  
  - Otherwise, keep it as `2*k + m`.  

This ensures that the split respects the group sizes and maximizes distinct elements.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate over `2n` elements and count frequencies.  
- **Space Complexity:** `O(n)`, for storing frequency counts up to `2n`.  
