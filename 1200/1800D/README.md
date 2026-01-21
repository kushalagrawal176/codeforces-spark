# Problem Number - 1800D Remove Two Letters  

**Problem Link:** [https://codeforces.com/problemset/problem/1800/D](https://codeforces.com/problemset/problem/1800/D)  

---

## Topics
- Strings  
- Implementation  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 3 ≤ `n` ≤ 2 × 10⁵  
- String length = `n`  
- Characters are lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We want to count how many distinct strings can be formed by removing **two consecutive letters** from the given string.  
- Initially, there are `n - 1` possible removals (since removing two consecutive letters can start at any index from 1 to n-1).  
- However, some removals may produce identical strings.  
- Specifically, if `s[i-1] == s[i+1]` for some `i` (where `i` is the middle character of the removed pair), then removing `s[i]` and `s[i+1]` or removing `s[i-1]` and `s[i]` will yield the same resulting string.  
- Therefore, for each such case, we reduce the count by 1.  
- The final answer is `n - 1 - (number of duplicate cases)`.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
