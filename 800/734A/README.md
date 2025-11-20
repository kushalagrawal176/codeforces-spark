# Problem Number - 734A Anton and Danik  
**Problem Link:** [https://codeforces.com/problemset/problem/734/A](https://codeforces.com/problemset/problem/734/A)  

---

## Topics
- Implementation
- Strings
- Simulation

## Constraints
- 1 ≤ `n` ≤ 100,000  
- String length = `n`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a sequence of games played between Anton and Danik.  
- Each game result is represented by a character in the string:  
  - `'A'` → Anton wins  
  - `'D'` → Danik wins  
- The task is to determine who won more games overall.  
- Approach:  
  1. Read integer `n` (number of games).  
  2. Read the string of length `n`.  
  3. Count the number of `'A'` characters (Anton’s wins).  
  4. Danik’s wins = `n - Anton’s wins`.  
  5. Compare counts:  
     - If Anton’s wins > Danik’s wins → print `"Anton"`.  
     - If Anton’s wins < Danik’s wins → print `"Danik"`.  
     - Otherwise → print `"Friendship"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for scanning the string once.  
- **Space Complexity:** `O(1)`, only counters are used.  
