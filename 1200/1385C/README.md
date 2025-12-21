# Problem Number - 1385C Make It Good  
**Problem Link:** [https://codeforces.com/problemset/problem/1385/C](https://codeforces.com/problemset/problem/1385/C)  

---

## Topics  
- Implementation  
- Arrays  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 2 × 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10^5 (array length)  
- 1 ≤ `a[i]` ≤ 10^5 (array elements)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks us to find the smallest prefix of the array that can be removed so that the remaining suffix is **non-decreasing**.  
- To solve this, we start from the end of the array and move backwards:  
  - First, skip the longest non-increasing suffix.  
  - Then, skip the longest non-decreasing suffix that follows.  
- The index `i` where we stop represents the length of the prefix that can be removed.  
- This works because once we encounter a "peak" (where the sequence switches from decreasing to increasing), everything before it must be removed to ensure the suffix is sorted.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we traverse the array once from the end.  
- **Space Complexity:** `O(1)`, only constant extra space is used.  
