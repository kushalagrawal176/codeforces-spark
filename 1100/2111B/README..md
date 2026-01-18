# Problem Number - 2111B Fibonacci Cubes  

**Problem Link:** [https://codeforces.com/problemset/problem/2111/B](https://codeforces.com/problemset/problem/2111/B)  

---

## Topics  
- Fibonacci Numbers  
- Greedy  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10³ (number of test cases)  
- 2 ≤ `n` ≤ 10 (index in Fibonacci sequence)  
- 1 ≤ `m` ≤ 2 ⋅ 10⁵ (number of queries per test case)  
- 1 ≤ `b`, `c`, `d` ≤ 150 (cube dimensions)  
- Total sum of `m` across all test cases ≤ 2 ⋅ 10⁵  
- Time limit per test: 2 second  
- Memory limit: 512 megabytes  

## Intuition / Approach  
- The problem involves checking whether a cube of size `n` (based on Fibonacci numbers) can fit inside a given box with dimensions `(b, c, d)`.  
- Precompute the first 10 Fibonacci numbers since `n ≤ 10`.  
- For each query:  
  1. If `n == 1`, the cube always fits (since side length = 1).  
  2. Otherwise, check if the smallest dimension among `(b, c, d)` is at least `F[n-1]` (the cube side length).  
  3. Then check if the largest dimension among `(b, c, d)` is at least `F[n-1] + F[n-2]`.  
  4. If both conditions are satisfied, the cube fits → output `"1"`. Otherwise → output `"0"`.  
- Collect results for all queries in a string and print at the end of each test case.  

## Time and Space Complexity  
- **Time Complexity:** `O(m)` per test case, since each query is processed in constant time.  
- **Space Complexity:** `O(1)`, only storing the precomputed Fibonacci sequence and counters.  
