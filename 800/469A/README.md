# Problem Number - 469A I Wanna Be the Guy  
**Problem Link:** [https://codeforces.com/problemset/problem/469/A](https://codeforces.com/problemset/problem/469/A)  

---

## Topics  
- Sets  
- Implementation  
- Game Theory  

## Constraints  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `p`, `q` ≤ n  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The game has `n` levels, and two players (Little X and Little Y) can pass certain levels.  
- We are given the list of levels each player can pass.  
- The task is to check if together they can pass **all levels from 1 to n**.  
- Steps:  
  1. Read the levels Little X can pass and store them in a set.  
  2. Read the levels Little Y can pass and add them to the same set.  
  3. If the size of the set equals `n`, it means all levels are covered → print `"I become the guy."`.  
  4. Otherwise, print `"Oh, my keyboard!"`.    

## Time and Space Complexity  
- **Time Complexity:** `O(p + q)`, since we insert all levels once.  
- **Space Complexity:** `O(n)`, for storing distinct levels in a set.  