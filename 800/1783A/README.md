# Problem Number - 1783A Make it Beautiful

**Problem Link:** [https://codeforces.com/problemset/problem/1783/A](https://codeforces.com/problemset/problem/1783/A)

---

## Topics
- Implementation  
- Sorting  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 2000  
- 2 ≤ `n` ≤ 50  
- 1 ≤ `a[i]` ≤ 100  
- Time limit per test: 3 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem asks us to rearrange the given array so that it is **not non-decreasing** (i.e., not sorted in ascending order).  
- Key observations:
  - If all elements are equal, then any rearrangement will still be sorted → answer is `"NO"`.  
  - Otherwise, we can always construct a valid arrangement.  
- Strategy:
  1. Sort the array.  
  2. If the smallest element equals the largest element, print `"NO"`.  
  3. Otherwise, print `"YES"`.  
  4. Place the largest element first, followed by the rest of the sorted array.  
     - This guarantees the sequence is not non-decreasing, since the first element is greater than the second.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case, due to sorting.  
- **Space Complexity:** `O(n)`, for storing the array.  

## Follow Up
- Think of better approach in terms of Time Complexity
- Hint - `O(n)` TC , no sorting