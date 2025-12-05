# Problem Number - 1328C Ternary XOR  

**Problem Link:** [https://codeforces.com/problemset/problem/1328/C](https://codeforces.com/problemset/problem/1328/C)  

---

## Topics
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 5⋅10⁴  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to split a ternary string `s` (digits '0', '1', '2') into two strings `a` and `b` such that:  
  - For each position `i`, `(a[i] + b[i])%3 = s[i]`.  
  - String `a` must be lexicographically smaller than string `b`.  OR
  - max(`a`, `b`) is the minimum possible.  

- Key idea:  
  - Before breaking symmetry, we can keep `a` and `b` equal as long as possible.  
  - The first time we encounter a `'1'`, we assign `a = 1` and `b = 0` to make `a` strictly smaller.  
  - After this point, we must ensure `a` stays smaller, so for:  
    - `'1'`: assign `a = 0`, `b = 1`.  
    - `'2'`: assign `a = 0`, `b = 2`.  
    - `'0'`: both get `0`.  

- This greedy approach ensures that `a` is lexicographically smaller than `b` while satisfying the digit sum condition.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through the string once.  
- **Space Complexity:** `O(n)`, for storing the two resulting strings.  
