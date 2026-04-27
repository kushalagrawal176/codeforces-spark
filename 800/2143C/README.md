# Problem Number - 2143A All Lengths Subtraction  
**Problem Link:** [https://codeforces.com/problemset/problem/2143/A](https://codeforces.com/problemset/problem/2143/A)  

---

## Topics
- Implementation  
- Permutations  
- Greedy / Two Pointers  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 100 (length of permutation)  
- 1 ≤ `p[i]` ≤ `n` (permutation)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- You are given a permutation `p` of length `n`. For each integer `k` from 1 to `n`, you must choose a subarray of length exactly `k` and subtract 1 from every element in that subarray.  
- The goal is to make all elements equal to zero after performing all `n` operations.  
- Key observation: This is only possible if the permutation is a **cyclic rotation of [1, 2, …, n]**.  
- Why?  
  - At step `k`, the chosen subarray must contain the numbers from `n-k+1` up to `n` in contiguous positions.  
  - If at any step the segment length does not match `k`, the process fails.  
- Algorithm:  
  1. Record the positions of each number in the permutation.  
  2. Track the leftmost and rightmost positions of the decreasing sequence from `n` down to `1`.  
  3. For each `k`, check if the segment length equals `k`.  
  4. If all checks pass, output **YES**; otherwise, **NO**.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the permutation once and check conditions.  
- **Space Complexity:** `O(n)`, for storing positions of elements.  
