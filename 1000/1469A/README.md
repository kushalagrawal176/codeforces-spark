# Problem Number - 1469A Regular Bracket Sequence  
**Problem Link:** [https://codeforces.com/problemset/problem/1469/A](https://codeforces.com/problemset/problem/1469/A)  

---

## Topics
- Strings
- Implementation
- Greedy 

## Constraints
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `|s|` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem asks whether a given string of brackets can be transformed into a **regular bracket sequence**.  
- A regular bracket sequence is one where brackets are properly matched and nested.  
- Key observations:
  - The first character cannot be `')'` because it would immediately break the sequence.  
  - The last character cannot be `'('` because it would leave an unmatched opening bracket.  
  - The length of the string minus 2 must be even, otherwise it’s impossible to balance the sequence.  
- Based on these checks, if any condition fails, the answer is `"NO"`. Otherwise, it is `"YES"`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a few checks are performed.  
- **Space Complexity:** `O(1)`, no extra space is required beyond storing the string.  
