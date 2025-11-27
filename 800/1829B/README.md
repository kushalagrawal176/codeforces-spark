# Problem Number - 1829B Blank Space  
**Problem Link:** [https://codeforces.com/problemset/problem/1829/B](https://codeforces.com/problemset/problem/1829/B)  

---

## Topics  
- Implementation  
- Arrays  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 100 (length of array per test case)  
- Array elements are either 0 or 1  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks us to find the **maximum number of consecutive zeros** in the given array.  
- This represents the longest "blank space" in the sequence.  
- To solve this:  
  1. Iterate through the array while maintaining a counter `cnt` for consecutive zeros.  
  2. If the current element is `0`, increment `cnt`.  
  3. If the current element is `1`, update the maximum streak (`zero = max(zero, cnt)`) and reset `cnt` to 0.  
  4. After the loop, take the maximum of `zero` and `cnt` to account for trailing zeros.  
- Print the result for each test case.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we iterate through the array once.  
- **Space Complexity:** `O(1)`, only constant space used for counters.  
