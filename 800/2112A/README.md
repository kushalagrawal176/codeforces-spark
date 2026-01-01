# Problem Number - 2112A Race  
**Problem Link:** [https://codeforces.com/problemset/problem/2112/A](https://codeforces.com/problemset/problem/2112/A)  

---

## Topics  
- Implementation  
- Math / Comparisons  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `a`, `x`, `y` ≤ 100  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given three integers: `a`, `x`, and `y`.  
- The problem asks whether `a` lies **strictly between** `x` and `y`.  
- If `a` is strictly between them, then the answer is `"NO"`.  
- Otherwise (meaning `a` is not between `x` and `y`), the answer is `"YES"`.  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case, read integers `a`, `x`, and `y`.  
3. Check the condition:  
   - If `(a > x && a < y)` or `(a < x && a > y)`, print `"NO"`.  
   - Else, print `"YES"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only comparisons are performed.  
- **Space Complexity:** `O(1)`, no extra memory used.  
