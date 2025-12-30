# Problem Number - 1993A Question Marks  
**Problem Link:** [https://codeforces.com/problemset/problem/1993/A](https://codeforces.com/problemset/problem/1993/A)  

---

## Topics
- Implementation  
- Strings  
- Counting  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 100  
- String length = `4n`  
- Characters are uppercase English letters (`A`, `B`, `C`, `D`, `?`)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives a string of length `4n` consisting of uppercase letters.  
- We need to calculate the maximum number of marks that can be awarded based on the rules:  
  - For each of the first four letters `A, B, C, D`, the maximum contribution is capped at `n`.  
  - Any other letters (like `?` or others) are ignored in scoring.  
- Approach:  
  - Count the frequency of each character in the string.  
  - For `A, B, C, D`, add `min(frequency, n)` to the total score.  
  - Print the total score for each test case.  

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since the string length is fixed at 4 and operations are constant.  
- **Space Complexity:** `O(1)`, only a small fixed-size array is used for counting.  
