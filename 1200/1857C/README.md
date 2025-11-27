# Problem Number - 1857C Assembly via Minimums

**Problem Link:** [https://codeforces.com/problemset/problem/1857/C](https://codeforces.com/problemset/problem/1857/C)

---

## Topics
- Sorting
- Greedy
- Implementation

## Constraints
- 1 ≤ `t` ≤ 200  
- 2 ≤ `n` ≤ 1000  
- -10^9 ≤ `b[i]` ≤ 10^9  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem gives us all pairwise minimums of an unknown array of size `n`.  
- There are `m = n × (n - 1) / 2` values provided, representing the minimum of every pair `(i, j)`.  
- To reconstruct the array:
  - Sort the given list of pairwise minimums.  
  - The smallest values correspond to the smallest elements of the original array.  
  - By carefully picking values at decreasing intervals (`(--n)` steps), we can recover each element.  
  - Finally, append a very large number (like `10^9`) to ensure the array has exactly `n` elements.  
- This works because the largest element never appears as a minimum in any pair, so we explicitly add it at the end.

## Time and Space Complexity
- **Time Complexity:** `O(n^2 log n)`, due to sorting the `m = n(n-1)/2` values.  
- **Space Complexity:** `O(n^2)`, for storing all pairwise minimums.  
