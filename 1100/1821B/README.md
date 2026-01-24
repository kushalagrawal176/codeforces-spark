# Problem Number - 1821B Sort the Subarray  

**Problem Link:** [https://codeforces.com/problemset/problem/1821/B](https://codeforces.com/problemset/problem/1821/B)  

---

## Topics  
- Arrays  
- Implementation  
- Greedy  
- Sorting  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (array size)  
- 1 ≤ `a[i]`, `b[i]` ≤ `n` (array elements)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given two arrays `a` and `b`. Array `b` is obtained by sorting a subarray of `a`.  
- The task is to find the smallest subarray `[l, r]` such that sorting it in `a` results in `b`.  
- Steps:  
  1. Compare arrays `a` and `b` to find the first (`l`) and last (`r`) indices where they differ.  
  2. Expand `l` leftwards while `b[l-1] ≤ b[l]` to ensure the sorted property holds.  
  3. Expand `r` rightwards while `b[r] ≤ b[r+1]` to ensure the sorted property holds.  
  4. Output the 1-based indices `(l+1, r+1)`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case (linear scan and boundary expansion).  
- **Space Complexity:** `O(n)` for storing arrays `a` and `b`.  
