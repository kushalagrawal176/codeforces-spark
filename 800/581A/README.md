# Problem Number - 581A Vasya the Hipster  
**Problem Link:** [https://codeforces.com/problemset/problem/581/A](https://codeforces.com/problemset/problem/581/A)  

---

## Topics
- Implementation  
- Math  
- Greedy  

## Constraints
- 1 ≤ `a`, `b` ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Vasya has `a` red socks and `b` blue socks.  
- He wants to maximize the number of days he can wear **different colored socks** first, and then wear **same colored socks** afterwards.  
- The number of days with different socks is simply `min(a, b)` because each day consumes one red and one blue sock.  
- After that, the remaining socks are `max(a, b) - min(a, b)`.  
- Since he wears two socks of the same color per day, the number of days he can continue is `(max(a, b) - min(a, b)) / 2`.  
- Output both values:  
  - First: days with different socks.  
  - Second: days with same socks afterwards.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, only a few arithmetic operations.  
- **Space Complexity:** `O(1)`, constant space usage.  
