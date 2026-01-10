# Problem Number - 1606A AB Balance  
**Problem Link:** [https://codeforces.com/problemset/problem/1606/A](https://codeforces.com/problemset/problem/1606/A)  
---

## Topics
- Strings  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `|s|` ≤ 100  
- String consists only of characters `A` and `B`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to transform the given string so that the number of substrings `"AB"` equals the number of substrings `"BA"`.  
- Observation:  
  - If the string starts and ends with the same character, the counts of `"AB"` and `"BA"` are already balanced.  
  - If the string starts with `A` and ends with `B` (or vice versa), the counts differ by exactly 1.  
- To fix this imbalance, we can simply change the **last character** of the string to match the **first character**.  
- Implementation:  
  - Print all characters except the last one.  
  - Append the first character at the end.  
- This guarantees balance between `"AB"` and `"BA"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the string once.  
- **Space Complexity:** `O(1)`, only constant space used for output construction.  
