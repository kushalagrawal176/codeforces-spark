# Problem Number - 1890A Doremy's Paint 3  

**Problem Link:** [https://codeforces.com/problemset/problem/1890/A](https://codeforces.com/problemset/problem/1890/A)  

---

## Topics
- Implementation  
- Greedy  
- HashMap  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 2 ≤ `n` ≤ 100 (length of the array)  
- Array elements are integers between `1` and `10^5`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to paint the array such that the difference in counts of two distinct colors is at most 1.  
- Steps to solve:  
  1. Count the frequency of each distinct element in the array.  
  2. If there is only **one distinct element**, the answer is `"Yes"` (all elements are the same).  
  3. If there are exactly **two distinct elements**, check their frequencies:  
     - If the absolute difference between the two counts is ≤ 1, output `"Yes"`.  
     - Otherwise, output `"No"`.  
  4. If there are **more than two distinct elements**, output `"No"`.  

- This greedy check works because the condition only allows arrays with either one color or two colors with nearly equal counts.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for counting frequencies of elements in the array.  
- **Space Complexity:** `O(n)`, for storing frequency counts.  
