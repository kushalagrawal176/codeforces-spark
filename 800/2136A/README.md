# Problem Number - 2136A In the Dream  
**Problem Link:** [https://codeforces.com/problemset/problem/2136/A](https://codeforces.com/problemset/problem/2136/A)  

---

## Topics
- Greedy
- Math

---

## Constraints
- 1 ≤ `t` ≤ 1000  
- 0 ≤ `a` ≤ `c` ≤ 100
- 0 ≤ `b` ≤ `d` ≤ 100
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem describes a dream scenario where two conditions must be satisfied for the answer to be "YES".  
- First condition (`k1`): For the pair `(a, b)`, the smaller value plus one, doubled, should be at least as large as the larger value.  
  - This ensures the two values are "balanced" enough.  
- Second condition (`k2`): For the pair `(c-a, d-b)`, the same balancing check is applied.  
  - This ensures the difference between the coordinates also satisfies the balance.  
- If both conditions hold true, the answer is `"YES"`, otherwise `"NO"`.  

Mathematically:  
- Condition 1: 2 * (min(a, b) + 1) >= max(a, b) 
- Condition 2: 2 * (min(c - a, d - b) + 1) >= max(c - a, d - b)

---

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since each test case requires constant-time checks.  
- **Space Complexity:** `O(1)`, only a few variables are used per test case.  
