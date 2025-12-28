# Problem Number - 2121A Letter Home  
**Problem Link:** [https://codeforces.com/problemset/problem/2121/A](https://codeforces.com/problemset/problem/2121/A)  
---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 10 (number of elements in the array)  
- 1 ≤ `s` ≤ 100 (starting position)  
- 1 ≤ `a[i]` ≤ 100 (array values, sorted in non-decreasing order)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum distance required to deliver a letter starting from position `s` and visiting the range defined by the array `a`.  
- Key observations:  
  1. If there is only one element in the array, the answer is simply `|s - a[0]|`.  
  2. If `s` is less than or equal to the smallest element (`a[0]`), the letter must be delivered to the farthest point (`a[n-1]`), so the answer is `|a[n-1] - s|`.  
  3. If `s` is greater than or equal to the largest element (`a[n-1]`), the letter must be delivered to the smallest point (`a[0]`), so the answer is `|s - a[0]|`.  
  4. Otherwise, `s` lies between `a[0]` and `a[n-1]`. In this case, the optimal strategy is to go to the nearer end first, then to the farther end.  
     - Formula: `min(s - a[0], a[n-1] - s) * 2 + max(s - a[0], a[n-1] - s)`  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, mathematical calculation.  
- **Space Complexity:** `O(n)` for storing the array.  
