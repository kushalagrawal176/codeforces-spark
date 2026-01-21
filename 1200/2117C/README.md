# Problem Number - 2117C Cool Partition  

**Problem Link:** [https://codeforces.com/problemset/problem/2117/C](https://codeforces.com/problemset/problem/2117/C)  

---

## Topics
- Sets  
- Implementation  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10⁴ 
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ `n`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to partition the array into segments such that each segment contains distinct elements.  
- We maintain two sets:
  - `cur`: keeps track of all elements seen so far in the entire array.  
  - `seen`: keeps track of elements in the current segment.  
- As we iterate through the array:
  1. Insert the current element into both sets.  
  2. If the size of `cur` equals the size of `seen`, it means all elements in the current segment are distinct.  
  3. At this point, we can finalize a partition, increment the answer, and clear `seen` for the next segment.  
- The final answer is the number of such partitions formed.  

This greedy approach works because we always cut the segment as soon as it becomes valid (all distinct), ensuring maximum partitions.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each element is processed once.  
- **Space Complexity:** `O(n)`, for storing elements in sets.  
