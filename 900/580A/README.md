# Problem Number - 580A Kefa and First Steps  
**Problem Link:** [https://codeforces.com/problemset/problem/580/A](https://codeforces.com/problemset/problem/580/A)  

---

## Topics  
- Arrays  
- Implementation  
- Dynamic Programming (basic idea)  

## Constraints  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks for the **maximum length of a non-decreasing contiguous subsequence** in the given array.  
- We can solve this by scanning the array once:  
  1. Initialize a counter `cnt` to track the current length of a non-decreasing segment.  
  2. Traverse the array from left to right.  
  3. If the next element is greater than or equal to the current element, increment `cnt`.  
  4. Otherwise, reset `cnt` to 0.  
  5. Keep track of the maximum value of `cnt` during traversal.  
- Since the subsequence length is counted by edges between elements, the final answer is `ans + 1`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, as we traverse the array once.  
- **Space Complexity:** `O(1)`, only a few variables are used for counting.  
