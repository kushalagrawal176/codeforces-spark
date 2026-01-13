# Problem Number - 1374C Move Brackets  
**Problem Link:** [https://codeforces.com/problemset/problem/1374/C](https://codeforces.com/problemset/problem/1374/C)  

---

## Topics  
- Strings  
- Stack / Simulation  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 2000 (number of test cases)  
- 2 ≤ `n` ≤ 50 (length of each string)  
- String consists only of `'('` and `')'` characters  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks for the minimum number of moves required to make a bracket sequence valid.  
- A valid bracket sequence means every closing bracket `')'` has a matching opening bracket `'('`.  
- We can simulate the process:  
  - Traverse the string character by character.  
  - Maintain a counter for unmatched `'('`.  
  - For each `'('`, increment the counter.  
  - For each `')'`, if there is an unmatched `'('`, decrement the counter (pairing them). Otherwise, ignore.  
- At the end, the counter represents the number of unmatched `'('` brackets.  
- This value is the minimum number of moves required to make the sequence valid.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only a counter is used.  
