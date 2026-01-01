# Problem Number - 2118A Equal Subsequences  
**Problem Link:** [https://codeforces.com/problemset/problem/2118/A](https://codeforces.com/problemset/problem/2118/A)  

---

## Topics  
- Implementation  
- Strings  
- Greedy Construction  

## Constraints  
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 1 ≤ `n` ≤ 100  
- 0 ≤ `k` ≤ `n`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to construct a binary string of length `n` with exactly `k` ones (`'1'`) and the rest zeros (`'0'`).  
- A straightforward approach is:  
  - Append `'1'` exactly `k` times.  
  - Append `'0'` for the remaining `(n - k)` positions.  
- This guarantees the string has length `n` and exactly `k` ones.  
- Since the problem does not impose any additional constraints on the arrangement, this simple greedy construction works.  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case, read integers `n` and `k`.  
3. Construct the string:  
   - Add `k` ones.  
   - Add `(n - k)` zeros.  
4. Print the resulting string.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we build a string of length `n`.  
- **Space Complexity:** `O(n)` for storing the string.  
