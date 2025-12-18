# Problem Number - 2114A Square Year  
**Problem Link:** [https://codeforces.com/problemset/problem/2114/A](https://codeforces.com/problemset/problem/2114/A)  

---

## Topics  
- Implementation  
- Math  
- Number Theory  

## Constraints  
- 1 ≤ `t` ≤ 10^4  
- `|s|` = 4
- 0 ≤ `s[i]` ≤ 9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine if a given string number `s` can be expressed as the square of sum of two integers `a + b`.  
- In simpler terms, we need to check if `n` is a perfect square.  
- If `n` is a perfect square, then the answer is `"0 sqrt(n)"`.  
- Otherwise, output `-1`.  
- Steps:  
  1. Compute the integer square root of `n`.  
  2. If `(sqrt(n))^2 == n`, then `n` is a perfect square.  
  3. Print `0` and `sqrt(n)` in that case.  
  4. Otherwise, print `-1`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since checking for a perfect square requires only one square root operation.  
- **Space Complexity:** `O(1)`, only constant space is used for variables.  
