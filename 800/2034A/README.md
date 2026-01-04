# Problem Number - 2034A King Keykhosrow's Mystery  

**Problem Link:** [https://codeforces.com/problemset/problem/2034/A](https://codeforces.com/problemset/problem/2034/A)  

---

## Topics
- Implementation  
- Number Theory  
- Brute Force  
- Chinese Remainder Theorem

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `a`, `b` ≤ 1000
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given two integers `a` and `b`.  
- The task is to find the smallest integer `ans` such that: `ans % a == ans % b`
- Start with `ans = min(a, b)` and increment until the condition is satisfied.  

### Key Observations:
1. The condition requires the remainders of `ans` when divided by `a` and `b` to be equal.  
2. The brute force approach works because starting from the smaller of the two numbers ensures we reach the solution quickly.  
3. Since `a` and `b` can be large, but the difference between them determines how many increments are needed, the loop is efficient enough for the given constraints.  

### Steps:
1. Read the number of test cases `t`.  
2. For each test case, read integers `a` and `b`.  
3. Initialize `ans = min(a, b)`.  
4. While `ans % a != ans % b`, increment `ans`.  
5. Print `ans`.  

## Time and Space Complexity
- **Time Complexity:** `O(|a - b|)` in the worst case, since we may need to increment until the remainders match.  
- **Space Complexity:** `O(1)`, only a few variables are used.  