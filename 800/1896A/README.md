# Problem Number - 1896A Jagged Swaps  

**Problem Link:** [https://codeforces.com/problemset/problem/1896/A](https://codeforces.com/problemset/problem/1896/A)  

---

## Topics
- Implementation  
- Arrays  
- Greedy

## Constraints
- 1 ≤ `t` ≤ 5000 (number of test cases)  
- 3 ≤ `n` ≤ 10 (length of the permutation)  
- The array is a permutation of integers from `1` to `n`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- You are given a permutation of size `n`.  
- Allowed operation: choose an index `i` (2 ≤ i ≤ n−1) such that `a[i-1] < a[i]` and `a[i] > a[i+1]`, then swap `a[i]` and `a[i+1]`.  
- The task: determine if the permutation can be sorted after a finite number of such operations.  

### Key Observation:
- The only way to guarantee sorting is if the **first element of the permutation is 1**.  
- Why?  
  - The swap operation can only move elements to the right, never to the left.  
  - Therefore, if `1` is not already at the beginning, it can never be moved there.  
  - If `1` is at the start, the rest of the permutation can be sorted using the allowed swaps.  

### Steps:
1. Read the permutation.  
2. Check the first element.  
   - If it equals `1`, output `"YES"`.  
   - Otherwise, output `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for reading the permutation. The decision itself is `O(1)`.  
- **Space Complexity:** `O(1)`, only constant space is used.  
