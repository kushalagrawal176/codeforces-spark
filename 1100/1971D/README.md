# Problem Number - 1971D Binary Cut  

**Problem Link:** [https://codeforces.com/problemset/problem/1971/D](https://codeforces.com/problemset/problem/1971/D)  

---

## Topics  
- Strings  
- Implementation  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 1 ≤ `|s|` ≤ 500 (length of binary string)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to determine the minimum number of cuts needed to divide a binary string into uniform segments (all `0`s or all `1`s).  
- To solve this, we count **transitions** in the string:  
  - `10` transitions → contribute directly to cuts (`res`).  
  - `01` transitions → contribute to cuts (`cnt`).  
- The formula for the answer is:  
  
  `result = res + max(cnt, 1)`

  
- Explanation:  
  - Each `10` transition requires a cut.  
  - Each `01` transition requires a cut, but if none exist, we still need at least one cut to separate the string.  

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only a few counters are used.  
