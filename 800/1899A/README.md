# Problem Number - 1899A Game with Integers  
**Problem Link:** [https://codeforces.com/problemset/problem/1899/A](https://codeforces.com/problemset/problem/1899/A)  

---

## Topics
- Implementation  
- Math  
- Game Theory  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 1000 (integer value for the game)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem is a simple game where two players take turns.  
- Given an integer `n`, the rules are:  
  - If `n` is divisible by 3 (`n % 3 == 0`), the output is `"Second"`.  
  - Otherwise, the output is `"First"`.  
- This is because the problem guarantees that the winner can be determined solely based on divisibility by 3.  
- Approach:  
  1. Read the number of test cases `t`.  
  2. For each test case, read integer `n`.  
  3. Check divisibility:  
     - If `n % 3 == 0`, print `"Second"`.  
     - Else, print `"First"`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only one modulo operation is performed.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
