# Problem Number - 313A Ilya and Bank Account  
**Problem Link:** [https://codeforces.com/problemset/problem/313/A](https://codeforces.com/problemset/problem/313/A)  

---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 10 ≤ `|n|` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Ilya has a bank account balance `a`, which may be negative.  
- He is allowed to remove **at most one digit** from the balance to maximize the remaining value.  
- Possible options:  
  1. Keep the number as it is (`a`).  
  2. Remove the last digit → `a / 10`.  
  3. Remove the second last digit → `(a / 100) * 10 + a % 10`.  
- The answer is simply the maximum among these three values.  
- This greedy approach works because removing any other digit would not yield a better result than these two specific cases.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, only a few arithmetic operations.  
- **Space Complexity:** `O(1)`, constant extra space.  
