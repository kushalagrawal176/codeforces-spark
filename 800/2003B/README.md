# Problem Number - 2003B Turtle and Piggy Are Playing a Game 2  
**Problem Link:** [https://codeforces.com/problemset/problem/2003/B](https://codeforces.com/problemset/problem/2003/B)  

---

## Topics  
- Implementation  
- Sorting  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 10⁵ (number of elements per test case)  
- 1 ≤ `aᵢ` ≤ 10⁵ (array values)  
- Sum of `n` over all test cases ≤ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given an array of `n` integers for each test case.  
- The task is to determine the **median element** after sorting the array.  
- Since the problem guarantees that `n` is odd, the median is simply the element at index `n/2` (0-based indexing) after sorting.  
- Steps:  
  1. Read the array.  
  2. Sort the array.  
  3. Output the middle element `a[n/2]`.  

This works because sorting arranges the elements in non-decreasing order, and the median is the central element when `n` is odd.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)` per test case due to sorting.  
- **Space Complexity:** `O(n)` for storing the array.  