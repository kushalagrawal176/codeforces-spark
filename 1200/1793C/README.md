# Problem Number - 1793C - Dora and Search  
**Problem Link:** [https://codeforces.com/problemset/problem/1793/C](https://codeforces.com/problemset/problem/1793/C)  

---

## Topics  
- Two Pointers  
- Implementation  
- Arrays  

## Constraints  
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10^5 (array size per test case)  
- 1 ≤ `a[i]` ≤ `n` (array elements are a permutation of 1…n)  
- Sum of n over all test cases ≤ 2 × 10^5  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The array is a permutation of numbers from 1 to n. 
- Dora wants to find a subarray such that, starting element of the segment is neither maximum nor minimum of the segment and last element of the segment is also neither maximum nor minimum of the segment.  
- To solve this, we use a **two-pointer approach**:  
  - Start with pointers `i = 0` (left) and `j = n - 1` (right).  
  - Track the current minimum `p = 1` and maximum `q = n`.  
  - Move pointers inward if the boundary elements match either `p` or `q`, updating `p` or `q` accordingly.  
  - If neither boundary matches, we stop — this indicates the subarray `[i+1, j+1]` (1-indexed).  
- If the entire array can be reduced (i.e., pointers meet at the same index), then such subarray does not exists, and the answer is `-1`.  
- Otherwise, output the indices `(i+1, j+1)` representing the bad subarray.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since each element is checked at most once by the two pointers.  
- **Space Complexity:** `O(n)` for storing the array.  
