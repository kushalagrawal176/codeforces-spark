# Problem Number - 1840C Ski Resort  
**Problem Link:** [https://codeforces.com/problemset/problem/1840/C](https://codeforces.com/problemset/problem/1840/C)  

---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `k` ≤ `n`  
- 1 ≤ `q` ≤ 10⁹  
- -10⁹ ≤ `a[i]` ≤ 10⁹  
- Sum of `n` over all test cases ≤ 2 × 10⁵  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the number of valid subarrays of length at least `k` where all elements are ≤ `q`.  
- Strategy:  
  - Traverse the array while maintaining a count `cnt` of consecutive elements ≤ `q`.  
  - If an element > `q`, reset `cnt` to 0.  
  - Whenever `cnt ≥ k`, new valid subarrays ending at the current position can be formed.  
  - The number of new subarrays is `(cnt - k + 1)`.  
  - Accumulate this into the answer.  

- This greedy approach ensures all valid subarrays are counted efficiently without explicitly enumerating them.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each element is processed once.  
- **Space Complexity:** `O(1)`, only counters and accumulators are used.  
