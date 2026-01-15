# Problem Number - 1909B Make Almost Equal With Mod  

**Problem Link:** [https://codeforces.com/problemset/problem/1909/B](https://codeforces.com/problemset/problem/1909/B)  

---

## Topics  
- Implementation  
- Number Theory  
- Brute Force  
- BitMasks

## Constraints  
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 2 ≤ `n` ≤ 100 (array size)  
- 1 ≤ `a[i]` ≤ 1017 (array elements)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The task is to find any integer `m` such that when all numbers in the array are taken modulo `m`, there are **exactly two distinct remainders**.  
- Key observation:  
  - The answer must be a power of 2.  
  - Modulo with powers of 2 effectively partitions numbers based on their binary representation.  
- Approach:  
  1. Start with `m = 2`.  
  2. For each candidate `m`, compute all `a[i] % m`.  
  3. If the set of remainders has exactly 2 distinct values, then `m` is the answer.  
  4. Otherwise, double `m` and repeat.  
- Since `n ≤ 100`, brute force with increasing powers of 2 is efficient.  

## Time and Space Complexity  
- **Time Complexity:**  
  - For each test case, we check successive powers of 2 until we find the answer.  
  - Each check requires `O(n)` operations.  
  - Worst case: `O(n log(max(a[i])))`.  
- **Space Complexity:** `O(n)`, for storing the array and remainder set.  
