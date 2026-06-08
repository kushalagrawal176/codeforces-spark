# Problem Number - 1550B Maximum Cost Deletion  
**Problem Link:** [https://codeforces.com/problemset/problem/1550/B](https://codeforces.com/problemset/problem/1550/B)  

---

## Topics
- Greedy
- String Processing
- Implementation 

---

## Constraints
- 1 ≤ `t` ≤ 2000  
- 1 ≤ `n` ≤ 100  
- -100 ≤ `a`, `b` ≤ 100  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to maximize the points of deleting a string where each deletion of a character contributes **`a` ⋅ `l` + `b`** points. Where `l` is length of the substring. 
- If `b ≥ 0`, the best strategy is to delete each character individually. This yields the maximum cost:  `Cost = a * n + b * n`  
- If `b < 0`, deleting each character separately is costly because of the negative contribution. Instead, we minimize the number of deletion operations by grouping characters.  
- The number of groups is determined by counting transitions between consecutive characters. 
- The optimal number of groups is `cnt/2 + 1`, where `cnt` is the number of transitions.  
- Thus, the maximum cost is:  `Cost = max(a * n + b * (cnt/2 + 1), (a + b) * n)`

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once to count transitions.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
