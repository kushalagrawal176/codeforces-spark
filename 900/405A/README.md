# Problem Number - 405A Gravity Flip  
**Problem Link:** [https://codeforces.com/problemset/problem/405/A](https://codeforces.com/problemset/problem/405/A)  

---

## Topics  
- Sorting  
- Implementation  
- Greedy

## Constraints  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `cube size` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem describes a scenario where cubes are stacked in columns, and then "gravity flips" them to the right.  
- After the flip, the cubes in each column will rearrange such that the sequence of cube counts becomes sorted in non-decreasing order.  
- Therefore, the task reduces to sorting the given list of cube sizes.  
- Steps:  
  1. Read the number of columns `n` and their cube counts.  
  2. Sort the array of cube counts in ascending order.  
  3. Print the sorted sequence.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)`, due to sorting.  
- **Space Complexity:** `O(n)`, for storing the cube counts.  
