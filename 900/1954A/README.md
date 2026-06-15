# Problem Number - 1954A Painting the Ribbon  
**Problem Link:** [https://codeforces.com/problemset/problem/1954/A](https://codeforces.com/problemset/problem/1954/A)  

---

## Topics
- Greedy
- Implementation
- Math 

---

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `m`, `k` ≤ `n` ≤ 50  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

---

## Intuition / Approach
- The problem involves distributing `n` ribbons among `m` friends. Each friend should ideally get an equal share, but one friend may get slightly more if `n` is not divisible by `m`.  
- The maximum number of ribbons a single friend can get is: `maxPerGroup = (n % m == 0 ? n / m : n / m + 1)`
- If the number of ribbons already painted `k` is **greater than or equal to** `n - maxPerGroup`, then it is impossible to paint all ribbons without violating the condition. In this case, the answer is `"NO"`.  
- Otherwise, it is possible, and the answer is `"YES"`.  

---

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only simple arithmetic and comparisons are performed.  
- **Space Complexity:** `O(1)`, as no extra data structures are needed.  

---
