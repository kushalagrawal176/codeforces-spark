# Problem Number - 1837B Comparison String  
**Problem Link:** [https://codeforces.com/problemset/problem/1837/B](https://codeforces.com/problemset/problem/1837/B)  

---

## Topics
- Strings  
- Implementation  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 1 ≤ `n` ≤ 100 (length of the string per test case)  
- The string consists only of characters `'<'` and `'>'`  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem asks us to find the maximum possible length of a subsequence that can be assigned values consistently according to the comparison string.  
- The key observation: the answer depends on the **longest run of consecutive identical characters** in the string.  
- For each test case:  
  - Traverse the string and count consecutive equal characters.  
  - Track the maximum run length (`ans`).  
  - The final answer is `ans + 1`, because a run of `k` identical comparisons corresponds to `k + 1` elements in the subsequence.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only counters are used.  
