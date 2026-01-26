# Problem Number - 1370C Number Game  
**Problem Link:** [https://codeforces.com/problemset/problem/1370/C](https://codeforces.com/problemset/problem/1370/C)  

---

## Topics  
- Number Theory  
- Game Theory  
- Prime Factorization  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 10⁹ (initial number)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The game is played between two players: **Ashishgup** and **FastestFinger**.  
- Rules:  
  - If `n = 1`, FastestFinger wins immediately (no moves possible).  
  - If `n = 2`, Ashishgup wins (he can reduce it to 1).  
  - If `n` is odd and greater than 1, Ashishgup wins (he can subtract 1 to make it even).  
  - If `n` is even and greater than 2, the outcome depends on its prime factorization:  
    - If `n` is a power of 2 (like 4, 8, 16...), then FastestFinger wins because only divisions by 2 are possible, eventually reaching 1.  
    - Otherwise, Ashishgup can win by forcing the game into a position where FastestFinger has no valid moves.  
- The key observation is to check how many times `n` can be divided by 2 and whether there are other odd prime factors.  
  - If `n` has more than one factor of 2 **and** at least one odd prime factor, Ashishgup wins.  
  - If `n` has only factors of 2, FastestFinger wins.  
  - If `n` has exactly one factor of 2 and the remaining part is prime, FastestFinger wins; otherwise, Ashishgup wins.  

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(√n)` per test case due to prime factorization.   
- **Space Complexity:**  
  - `O(1)`, only counters and temporary variables are used.  
