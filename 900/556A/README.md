# Problem Number - 556A Case of the Zeros and Ones  
**Problem Link:** [https://codeforces.com/problemset/problem/556/A](https://codeforces.com/problemset/problem/556/A)  

---

## Topics
- Strings  
- Implementation  
- Counting  

## Constraints
- 1 ≤ `n` ≤ 2 · 10⁵ (length of the string)  
- String consists only of characters `'0'` and `'1'`  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the number of characters left after repeatedly removing pairs of `'0'` and `'1'`.  
- Each valid removal deletes one `'0'` and one `'1'`.  
- Therefore, the maximum number of removals is `min(count0, count1)`.  
- The leftover characters = `n - 2 * min(count0, count1)` = `|count0 - count1|`.  
- So the solution reduces to counting the number of `'0'`s and `'1'`s and printing their absolute difference.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we scan the string once to count zeros and ones.  
- **Space Complexity:** `O(1)`, only two counters are used.  
