# Problem Number - 1676E Eating Queries  
**Problem Link:** [https://codeforces.com/problemset/problem/1676/E](https://codeforces.com/problemset/problem/1676/E)  

---

## Topics
- Binary Search  
- Prefix Sums  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n`, `q` ≤ 1.5 × 10^5  
- 1 ≤ `a[i]` ≤ 10^4 (candies in each box)  
- 1 ≤ `val` ≤ 2⋅10^9 (query value)  
- Time limit per test: 3.5 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks: given `n` candies, having sugar quantity `a[i]`. 
- Given `q` queries, find minimum number of candies such that quantity of sugar is greater than or equal to `val` else `-1` if not possible 
- **Step 1:** Sort the array of candies in descending order so that we always pick the largest boxes first.  
- **Step 2:** Build a prefix sum array where `prefix[i]` represents the total candies if we take the first `i` boxes.  
- **Step 3:** For each query `val`, we need the smallest index `i` such that `prefix[i] ≥ val`.  
- **Step 4:** This can be efficiently found using **binary search** on the prefix sum array.  
- If no prefix sum reaches `val`, the answer is `-1`.  

This approach ensures that each query is answered quickly after preprocessing.  

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting: `O(n log n)`  
  - Prefix sum construction: `O(n)`  
  - Each query via binary search: `O(log n)`  
  - Total per test case: `O(n log n + q log n)`  

- **Space Complexity:** `O(n)` for storing the prefix sums.  
