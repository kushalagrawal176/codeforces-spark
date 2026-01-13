# Problem Number - 1913B Swap and Delete  
**Problem Link:** [https://codeforces.com/problemset/problem/1913/B](https://codeforces.com/problemset/problem/1913/B)  

---

## Topics  
- Strings  
- Greedy  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `|s|` ≤ 2 ⋅ 10⁵ (length of string per test case)  
- The string consists only of characters `'0'` and `'1'`  
- Sum of `|s|` across all test cases ≤ 2 ⋅ 10⁵  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem requires finding the minimum number of characters left after performing swap and delete operations optimally.  
- First, count the total number of `'0'` and `'1'` characters in the string.  
- Traverse the string from left to right:  
  - If the current character is `'0'` but no `'1'` remains, stop.  
  - If the current character is `'1'` but no `'0'` remains, stop.  
  - Otherwise, reduce the opposite count (simulate deletion after swap).  
- At the end, the sum of remaining `'0'` and `'1'` characters gives the answer.  

This greedy approach works because once one type of character runs out, no further valid operations can be performed.  

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only counters are used.  
