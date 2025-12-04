# Problem Number - 1853A Desorting  
**Problem Link:** [https://codeforces.com/problemset/problem/1853/A](https://codeforces.com/problemset/problem/1853/A)  

---

## Topics  
- Arrays  
- Implementation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 100  
- 2 ≤ `n` ≤ 500  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine the minimum number of operations required to make the array **not sorted in non-decreasing order**.  
- We analyze the differences between consecutive elements:  
  - If any difference is negative (`a[i+1] - a[i] < 0`), the array is already not sorted, so the answer is `0`.  
  - Otherwise, we find the minimum difference `mini` among all consecutive pairs.  
    - If `mini == 0`, then only `1` operation is needed to break the sorted order.  
    - If `mini > 0`, then the minimum number of operations required is `(mini / 2) + 1`.  
- This works because reducing the gap between consecutive elements ensures that eventually the order will break.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(1)`, aside from storing the array.  
