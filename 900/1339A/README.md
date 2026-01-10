# Problem Number - 1339A Filling Diamonds  
**Problem Link:** [https://codeforces.com/problemset/problem/1339/A](https://codeforces.com/problemset/problem/1339/A)  
---

## Topics
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem is deceptively simple.  
- We are asked to determine the number of ways to fill a diamond-shaped figure with `n` diamonds.  
- Observation: The answer is always equal to `n`.  
  - Each diamond can be placed independently, and the structure ensures exactly `n` valid fillings.  
- Therefore, for each test case, we simply output the value of `n`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since we directly print `n`.  
- **Space Complexity:** `O(1)`, no extra space required.  
