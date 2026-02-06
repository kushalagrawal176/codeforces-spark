# Problem Number - 2193A DBMB and the Array  
**Problem Link:** [https://codeforces.com/problemset/problem/2193/A](https://codeforces.com/problemset/problem/2193/A)  

---

## Topics
- Arrays  
- Implementation  
- Modular Arithmetic  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n`, `x` ≤ 10  
- 1 ≤ `s` ≤ 100  
- 1 ≤ `a[i]` ≤ 10  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given an array of length `n`, along with integers `s` and `x`.  
- Compute the sum of all elements in the array.  
- If the sum exceeds `s`, it is impossible to satisfy the condition, so output `"NO"`.  
- Otherwise, check whether the remaining difference `(s - sum)` is divisible by `x`.  
  - If divisible, output `"YES"`.  
  - Otherwise, output `"NO"`.  
- The problem boils down to a simple check involving the total sum and modular arithmetic.  

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` per test case to compute the sum.  
- **Space Complexity:**  
  - `O(1)`, only constant space used for accumulation.  
