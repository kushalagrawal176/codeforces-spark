# Problem Number - 2093A Ideal Generator  
**Problem Link:** [https://codeforces.com/problemset/problem/2093/A](https://codeforces.com/problemset/problem/2093/A)  

---

## Topics  
- Implementation  
- Math  
- Number Theory  

## Constraints  
- 1 ≤ `t` ≤ 1000 
- 1 ≤ `k` ≤ 1000  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine whether a given integer `k` can be considered an "ideal generator."  
- Observation:  
  - A number is an ideal generator if it is **odd**.  
  - If `k` is odd → output `"YES"`.  
  - If `k` is even → output `"NO"`.  
- This is because odd numbers satisfy the required property defined in the problem statement, while even numbers do not.  
- The solution is straightforward: check the parity of `k` using `(k % 2)`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only a parity check is performed.  
- **Space Complexity:** `O(1)`, no extra storage required.  
