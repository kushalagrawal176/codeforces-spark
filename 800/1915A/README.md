# Problem Number - 1915A Odd One Out  
**Problem Link:** [https://codeforces.com/problemset/problem/1915/A](https://codeforces.com/problemset/problem/1915/A)  

---

## Topics  
- Implementation  
- Math  
- Bit Manipulation  

## Constraints  
- 1 ≤ `t` ≤ 270 (number of test cases)  
- Input consists of three integers `a`, `b`, `c`  
- 0 ≤ `a`, `b`, `c` ≤ 9  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks to find the unique number among three integers where two are equal and one is different.  
- Approach:  
  - Since exactly two numbers are equal, the third one is the "odd one out".  
  - One efficient way is to use the XOR operation:  
    - `(a ^ b ^ c)` will cancel out the two equal numbers and leave the unique one.  
  - Alternatively, simple comparisons can be used:  
    - If `a == b`, then `c` is the answer.  
    - If `a == c`, then `b` is the answer.  
    - Otherwise, `a` is the answer.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only a few comparisons or a single XOR operation are needed.  
- **Space Complexity:** `O(1)`, only constant space is used for variables.  
