# Problem Number - 1692E Binary Deque  
**Problem Link:** [https://codeforces.com/problemset/problem/1692/E](https://codeforces.com/problemset/problem/1692/E)  

---

## Topics
- Two Pointers  
- Sliding Window  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n`, `s` ≤ 2 × 10⁵ 
- Array elements are either 0 or 1  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of elements to remove from the **ends** of the array so that the sum of the remaining subarray equals `k`.  
- This is equivalent to finding the **longest contiguous subarray** with sum `k`.  
- If such a subarray exists, the answer is `n - length_of_subarray`. Otherwise, the answer is `-1`.  
- We can solve this using a **two-pointer sliding window** approach:  
  - Maintain a window `[j, i]` and keep track of the sum.  
  - Expand the window by moving `i`.  
  - If the sum exceeds `k`, shrink the window by moving `j`.  
  - Whenever the sum equals `k`, update the maximum length of the subarray.  
- Finally, compute the minimum removals as `n - maxLength`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each element is processed at most twice (once when added, once when removed).  
- **Space Complexity:** `O(1)`, only variables for pointers and sum are used.  
