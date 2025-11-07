# Problem Number - 1931C Make Equal Again  
**Problem Link:** [https://codeforces.com/problemset/problem/1931/C](https://codeforces.com/problemset/problem/1931/C)

---

## Topics

- Greedy  
- Implementation  
- Array Manipulation

## Constraints

- 1 ≤ t ≤ 10⁴  
- 1 ≤ n ≤ 2⋅10⁵  
- 1 ≤ a[i] ≤ n
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes

## Intuition / Approach

- The goal is to make all elements in the array equal using **at most one operation**.
- The operation allows selecting a subarray and setting all its elements to a value `x`, with a cost equal to the subarray's length.
- To minimize cost, we want to **maximize the number of elements we don’t need to change**.
- The optimal strategy is to:
  - Consider removing a prefix and suffix of elements equal to `a[0]` or `a[n-1]`.
  - The remaining subarray (between the first and last different elements) is the one we need to change.
- For both `a[0]` and `a[n-1]`, compute:
  - The number of elements from the start and end that match the value.
  - The length of the subarray in between that needs to be changed.
- The answer is the **minimum** of the two computed lengths.
- If all elements are already equal, the cost is `0`.

## Time and Space Complexity

- **Time Complexity:** O(n), for each test case due to single pass and frequency counting.  
- **Space Complexity:** O(n), for storing array elements.
