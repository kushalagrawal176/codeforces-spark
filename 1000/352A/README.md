# Problem Number - 352A Jeff and Digits  

**Problem Link:** [https://codeforces.com/problemset/problem/352/A](https://codeforces.com/problemset/problem/352/A)  

---

## Topics
- Greedy
- Implementation 
- Number Theory

## Constraints
- 1 ≤ `n` ≤ 1000  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to construct the largest possible number divisible by 90 using given digits (only `0` and `5`).  
- A number divisible by 90 must satisfy two conditions:  
  1. **Divisible by 10** → requires at least one `0` at the end.  
  2. **Divisible by 9** → sum of digits must be divisible by 9, which means we need groups of **nine `5`s**.  
- Steps:  
  - Count the number of `0`s and `5`s.  
  - If there are no zeros → impossible to form a number divisible by 10 → output `-1`.  
  - If fewer than 9 fives → the only valid number is `0`.  
  - Otherwise, use as many groups of nine `5`s as possible, followed by all zeros.  
- This greedy approach ensures the largest possible number is formed.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through all digits once.  
- **Space Complexity:** `O(1)`, only counters for zeros and fives are used.  