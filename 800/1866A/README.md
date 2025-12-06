# Problem Number - 1866A Ambitious Kid

**Problem Link:** [https://codeforces.com/problemset/problem/1866/A](https://codeforces.com/problemset/problem/1866/A)

---

## Topics
- Implementation  
- Math  

## Constraints
- 1 ≤ `n` ≤ 10^5  
- -10^5 ≤ `a[i]` ≤ 10^5  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives `n` integers.  
- The task is to find the minimum number of operations that must be done to make it such that product of all elements of array is `0`.  
- Key observations:
  - The absolute value of a position represents the minimum number of opeartions to make it to `0`.  
  - We simply need to compute the minimum of these absolute values.  
- Steps:
  1. Read `n`.  
  2. Initialize `mini` with the absolute value of the first input.  
  3. For each of the remaining `n-1` integers, update `mini = min(mini, abs(value))`.  
  4. Print `mini`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we scan all `n` integers once.  
- **Space Complexity:** `O(1)`, only constant space is used for tracking the minimum.  
