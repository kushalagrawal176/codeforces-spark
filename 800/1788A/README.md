# Problem Number - 1788A One and Two  

**Problem Link:** [https://codeforces.com/problemset/problem/1788/A](https://codeforces.com/problemset/problem/1788/A)  

---

## Topics
- Implementation  
- Arrays  
- Prefix/Suffix Counting  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 2 ≤ `n` ≤ 1000 (length of the array)  
- Array elements are either `1` or `2`   
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to split the array into two parts such that `a1 ⋅ a2 ⋅ … ⋅ ak = ak+1 ⋅ ak+2 ⋅ … ⋅ an` OR the number of `2`s in the left part equals the number of `2`s in the right part.  
- Steps to solve:  
  1. Count the total number of `2`s in the array.  
  2. Traverse the array from left to right, maintaining a running count (`curr`) of how many `2`s have been seen so far.  
  3. At each index, reduce the remaining count (`two`) accordingly.  
  4. If at any point `curr == two`, that index is the split point.  
  5. If no such index exists, output `-1`.  

- This works because the split is only valid when the number of `2`s on both sides is equal.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we traverse the array once per test case.  
- **Space Complexity:** `O(n)`, for storing the array.  
