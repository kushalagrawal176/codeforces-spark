# Problem Number - 1873A Short Sort  

**Problem Link:** [https://codeforces.com/problemset/problem/1873/A](https://codeforces.com/problemset/problem/1873/A)  

---

## Topics  
- Implementation  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 6 (number of test cases)  
- Each string has length exactly 3  
- Strings consist of lowercase English letters `a`, `b`, `c`
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether a given string of length 3 can be transformed into `"abc"` by performing at most one swap of any two characters.  
- Key observation:  
  - If the string is already `"abc"`, the answer is `"YES"`.  
  - If the string differs from `"abc"` in at most 2 positions, then one swap can fix it.  
  - Otherwise, it cannot be fixed with a single swap.  
- Steps:  
  1. Read the number of test cases `t`.  
  2. For each test case, read the string `s`.  
  3. Compare each character of `s` with `"abc"` and count mismatches.  
  4. If mismatches ≤ 2, print `"YES"`, else print `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since each test case requires constant time operations (length of string is fixed at 3).  
- **Space Complexity:** `O(1)`, only a few variables are used regardless of input size.  
