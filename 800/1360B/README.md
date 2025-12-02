# Problem Number - 1360B Honest Coach
**Problem Link:** [https://codeforces.com/problemset/problem/1360/B](https://codeforces.com/problemset/problem/1360/B)

---

## Topics
- Implementation
- Sorting
- Greedy

## Constraints
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `n` ≤ 50  
- 1 ≤ `a[i]` ≤ 1000  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to divide `n` athletes into two teams such that the difference in their strengths is minimized.  
- Key observation: The minimum difference will always be between two consecutive elements when the array is sorted.  
- Steps:
  1. Sort the array of strengths.  
  2. Iterate through consecutive pairs and compute the absolute difference.  
  3. Track the minimum difference among all pairs.  
- This works because sorting ensures that the closest strengths are adjacent, so the minimum difference must lie between neighbors.

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(1)`, aside from storing the array.
