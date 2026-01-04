# Problem Number - 1684A Digit Minimization  

**Problem Link:** [https://codeforces.com/problemset/problem/1684/A](https://codeforces.com/problemset/problem/1684/A)  

---

## Topics
- Strings  
- Greedy  
- Implementation
- Game  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- Each number is given as an integer  `n`
- 10 ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given a number as a string and need to minimize it under specific rules.  
- The problem boils down to:  
  - If the number has **exactly 2 digits**, the answer is simply the **second digit**.  
  - If the number has **more than 2 digits**, the answer is the **smallest digit** in the entire string.  

### Steps:
1. Read the input string `s`.  
2. If `s.length() == 2`, output `s[1]`.  
3. Otherwise, find the minimum digit in the string using `min_element`.  
4. Print the result.  

This greedy approach works because:  
- For two-digit numbers, the second digit always determines the minimized result.  
- For longer numbers, choosing the smallest digit ensures minimization.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case (to find the minimum digit in the string).  
- **Space Complexity:** `O(1)`, only a few variables are used.  