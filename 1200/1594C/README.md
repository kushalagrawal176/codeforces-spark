# Problem Number - 1594C Make Them Equal  
**Problem Link:** [https://codeforces.com/problemset/problem/1594/C](https://codeforces.com/problemset/problem/1594/C)  

---

## Topics  
- Strings  
- Implementation  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 10⁴
- 3 ≤ `n` ≤ 3 ⋅ 10⁵ 
- String length = `n`  
- Characters are lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The goal is to make all characters in the string equal to a given target character `c`.  
- Allowed operation: choose an index `i` (1-based), and all positions **not divisible** by `i` are changed to `c`.  
- Observations:  
  - If the string already consists entirely of `c`, no operations are needed.  
  - If there exists a position `i` (greater than `n/2`) where `s[i] == c`, then performing the operation at that index will make the entire string equal to `c`.  
  - Otherwise, the problem can always be solved in **two operations** by choosing indices `n` and `n-1`. These cover all positions and ensure the string becomes uniform.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only a few variables are used for tracking positions and counts.  
