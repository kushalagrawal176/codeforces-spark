# Problem Number - 467A George and Accommodation  
**Problem Link:** [https://codeforces.com/problemset/problem/467/A](https://codeforces.com/problemset/problem/467/A)  

---

## Topics  
- Implementation  
- Simulation  
- Basic Math  

## Constraints  
- 1 ≤ `n` ≤ 100 (number of rooms)  
- 0 ≤ `p` ≤ `q` ≤ 100 (current occupants `p`, room capacity `q`)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine how many rooms George and Alex can move into.  
- Each room has a current number of occupants `p` and a maximum capacity `q`.  
- They can move into a room if there is space for at least **two more people**, i.e., if `q - p ≥ 2`.  
- Approach:  
  - Read the number of rooms `n`.  
  - For each room, read `p` and `q`.  
  - Check if `q - p ≥ 2`. If true, increment the counter.  
  - After processing all rooms, output the counter.  

This is a straightforward simulation problem with simple conditions.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we check each room once.  
- **Space Complexity:** `O(1)`, only a counter variable is used.  
