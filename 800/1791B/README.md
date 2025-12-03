# Problem Number - 1791B Following Directions  
**Problem Link:** https://codeforces.com/problemset/problem/1791/B  

---

## Topics  
- Implementation  
- Simulation  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 50 (length of the directions string)  
- Directions string consists of characters `L`, `R`, `U`, `D`  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem gives a sequence of moves on a 2D plane starting from the origin `(0,0)`.  
- Moves are defined as:  
  - `L` → move left (x decreases by 1)  
  - `R` → move right (x increases by 1)  
  - `U` → move up (y increases by 1)  
  - `D` → move down (y decreases by 1)  
- The task is to determine if the path ever reaches the point `(1,1)`.  
- Approach:  
  1. Initialize coordinates `(x, y) = (0, 0)`.  
  2. Traverse the string of moves one by one, updating `(x, y)` accordingly.  
  3. After each move, check if `(x, y) == (1,1)`.  
  4. If yes, print `"YES"`; otherwise, after all moves, print `"NO"`.  

This is a direct simulation problem with simple coordinate updates.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, where `n` is the length of the directions string.  
- **Space Complexity:** `O(1)`, only constant space used for coordinates and flag checking.  
