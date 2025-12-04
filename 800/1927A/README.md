# Problem Number - 1927A Make it White  
**Problem Link:** [https://codeforces.com/problemset/problem/1927/A](https://codeforces.com/problemset/problem/1927/A)  

---

## Topics  
- Strings  
- Greedy  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 10^4  
- 1 ≤ `n` ≤ 10  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem gives a string of length `n` consisting of characters `'W'` (white) and `'B'` (black).  
- We want to repaint a contiguous segment of the string so that all `'B'` characters are covered and turned into `'W'`.  
- To minimize the length of the segment, we only need to consider the first and last occurrence of `'B'`.  
- The minimal segment length is simply the distance between the first `'B'` and the last `'B'`, inclusive.  
- If there is only one `'B'`, the answer is `1`.  
- Steps:  
  - Find the index of the first `'B'`.  
  - Find the index of the last `'B'`.  
  - Compute the length as `(last_index - first_index + 1)`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
