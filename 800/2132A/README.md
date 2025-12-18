# Problem Number - 2132A Homework  
**Problem Link:** [https://codeforces.com/problemset/problem/2132/A](https://codeforces.com/problemset/problem/2132/A)  

---

## Topics  
- Implementation  
- Strings  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 10 
- 1 ≤ `m` ≤ 10  
- String `a` and `b` consist of lowercase English letters  
- String `c` consist of uppercase English letters `V` and `D`
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem requires constructing a new string `s` based on a sequence of operations.  
- We are given:  
  - An initial string `a` of length `n`.  
  - Two strings `a` and `b` of length `n` and `m`.  
- For each position `i` in `0 … m-1`:  
  - If `b[i] == 'V'`, prepend `a[i]` to `s`.  
  - Otherwise, append `a[i]` to `s`.  
- After performing all operations, output the final string.  
- This is a straightforward simulation problem where we apply the operations in order.  

## Time and Space Complexity  
- **Time Complexity:** `O(n + m)`, since we process the initial string and then perform `m` operations.  
- **Space Complexity:** `O(n + m)`, as the final string can grow up to length `n + m`.  
