# Problem Number - 2123A Blackboard Game  
**Problem Link:** [https://codeforces.com/problemset/problem/2123/A](https://codeforces.com/problemset/problem/2123/A)  

---

## Topics  
- Math

## Constraints  
- 1 ≤ `t` ≤ 100 
- 1 ≤ `n` ≤ 100 
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to determine winner of the game.  
- In one round, ALice can choose an integer `a` and erase it
- Bob can choose integer `b` such that `a+b = 3` mod 4 and delete it
- If no player is able to make move then he loses.  
- Key observation if `n%4 == 0` then `Bob` always wins else `Alice`

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for constructing and printing the permutations.  
- **Space Complexity:** `O(n)`, for storing the two permutations.  
