# Problem Number - 1807D Odd Queries  
**Problem Link:** [https://codeforces.com/problemset/problem/1807/D](https://codeforces.com/problemset/problem/1807/D)  

---

## Topics
- Implementation  
- Prefix Sums  
- Parity / Odd-Even Logic  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n`, `q` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- 1 ≤ `l` ≤ `r` ≤ `n`  
- 1 ≤ `k` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given an array `a` of length `n`.  
- For each query `(l, r, k)`, we replace the subarray `a[l..r]` with all `k`s and check if the total sum of the array becomes odd.  
- Instead of recalculating sums for each query, we use **prefix sums of odd counts**:  
  - Build an auxiliary array `b` where `b[i]` counts how many odd numbers are present up to index `i`.  
  - Compute the total number of odd elements in the original array.  
  - For each query, calculate how many odds are removed (`odd` count in `[l, r]`).  
  - Then check the parity of the new array:  
    - If `(totalOdds - oddRemoved)` is odd, the parity depends on whether `(r-l+1)` and `k` are odd.  
    - Otherwise, it depends on the opposite condition.  
- This reduces each query to O(1) time after preprocessing.  

## Time and Space Complexity
- **Time Complexity:**  
  - Preprocessing: `O(n)`  
  - Each query: `O(1)`  
  - Total: `O(n + q)` per test case.  
- **Space Complexity:** `O(n)` for storing prefix odd counts.  
