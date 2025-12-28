# Problem Number - 2117A False Alarm  
**Problem Link:** [https://codeforces.com/problemset/problem/2117/A](https://codeforces.com/problemset/problem/2117/A)  
---

## Topics
- Implementation  
- Arrays  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n`, `x` ≤ 10 (number of elements in the array)  
- 0 ≤ `a[i]` ≤ 1 (array values)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether the segment of consecutive `1`s in the array is short enough to be considered a "false alarm."  
- Steps:  
  1. Find the first occurrence of `1` in the array (`index`).  
  2. Find the last occurrence of `1` in the array (`index1`).  
  3. If no `1` exists (`index == -1`), the answer is `"YES"`.  
  4. Otherwise, compute the segment length as `(index1 - index + 1)`.  
  5. If this length is less than or equal to `x`, output `"YES"`. Otherwise, output `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array to find first and last `1`.  
- **Space Complexity:** `O(n)` for storing the array.  
