# Problem Number - 2067A Adjacent Digit Sums  

**Problem Link:** [https://codeforces.com/problemset/problem/2067/A](https://codeforces.com/problemset/problem/2067/A)  

---

## Topics
- Number Theory  
- Modular Arithmetic  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 1 ≤ `x`, `y` ≤ 1000  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- The problem asks whether two integers `x` and `y` can form a valid sequence under the given condition.  
- The condition reduces to checking if:  `d = (x + 1 - y)` is **non-negative** and divisible by 9.  
- If both conditions hold, the answer is `"YES"`. Otherwise, `"NO"`.  

### Steps:
1. Read the number of test cases `t`.  
2. For each test case, read integers `x` and `y`.  
3. Compute `d = x + 1 - y`.  
4. Check:  
   - If `d ≥ 0` and `d % 9 == 0`, print `"YES"`.  
   - Else, print `"NO"`.  

This is a direct application of modular arithmetic and requires no complex data structures.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since each test case requires only constant-time arithmetic operations.  
- **Space Complexity:** `O(1)`, as only a few variables are used per test case.  
