# Problem Number - 577A Multiplication Table  
**Problem Link:** [https://codeforces.com/problemset/problem/577/A](https://codeforces.com/problemset/problem/577/A)  

---

## Topics
- Implementation  
- Math  
- Brute Force  

## Constraints
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `x` ≤ 10⁹  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the number of times the integer `x` appears in an `n × n` multiplication table.  
- Each entry in the table is of the form `i × j` where `1 ≤ i, j ≤ n`.  
- To check if `x` appears, we need to find pairs `(i, j)` such that `i × j = x`.  
- For each `i` from 1 to `n`, if `x % i == 0` and `x / i ≤ n`, then `(i, x/i)` is a valid pair.  
- Counting all such valid pairs gives the answer.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through all possible divisors up to `n`.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  
