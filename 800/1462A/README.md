# Problem Number - 1462A Favorite Sequence  

**Problem Link:** [https://codeforces.com/problemset/problem/1462/A](https://codeforces.com/problemset/problem/1462/A)  

---

## Topics
- Implementation  
- Two Pointers  
- Arrays  

## Constraints
- 1 ≤ `t` ≤ 300 (number of test cases)  
- 1 ≤ `n` ≤ 300 (length of the sequence)  
- Array elements are integers between `1` and `10^9`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to rearrange the given sequence into a "favorite sequence" by printing elements alternately from the leftmost and rightmost ends.  
- Steps to solve:  
  1. Initialize two pointers: `left = 0` and `right = n - 1`.  
  2. While `left < right`, print `a[left]` followed by `a[right]`, then move `left++` and `right--`.  
  3. If the sequence length is odd, after the loop ends, print the middle element (`left == right`).  
- This ensures the sequence is printed in the required alternating order.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we traverse the array once.  
- **Space Complexity:** `O(1)`, only constant extra space is used for pointers.  
