# Problem Number - 2195B Heapify 1

**Problem Link:** [https://codeforces.com/problemset/problem/2195/B](https://codeforces.com/problemset/problem/2195/B)

---

## Topics
- Implementation  
- Greedy  
- Data Structures (Heap properties)  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (size of permutation)  
- 1 ≤ `a[i]` ≤ `n` (size of permutation)  
- Sum of `n` over all test cases ≤ 2 × 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- You are given a **permutation** of length `n`. The allowed operation is:  
  Select an index `i` (1 ≤ `i` ≤ `n`/2) and swap `a[i]` with `a[2i]`.  
- This operation mimics the structure of a **binary heap**, where each node can only swap with its child at index `2i`.  
- The key observation:  
  - Each position `i` can only interact with indices that share the same "odd core" after repeatedly dividing by 2.  
  - Similarly, each value `a[i]` can only move to positions whose index has the same odd core.  
- Therefore, for the permutation to be sortable into increasing order, **the odd core of index `i` must match the odd core of value `a[i]`**.  
- Algorithm:  
  1. For each index `i` (1-based), compute its odd core by dividing by 2 until it becomes odd.  
  2. For each value `a[i]`, compute its odd core similarly.  
  3. If for all positions, the odd core of index equals the odd core of value, then the permutation can be sorted → print `"YES"`.  
  4. Otherwise, print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (each element reduced by dividing by 2 until odd).  
- **Space Complexity:** `O(n)` for storing the permutation.  