# Problem Number - 1382B Sequential Nim  

**Problem Link:** [https://codeforces.com/problemset/problem/1382/B](https://codeforces.com/problemset/problem/1382/B)  

---

## Topics  
- Game Theory  
- Greedy  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 10⁵ (number of piles per test case)  
- 1 ≤ `a[i]` ≤ 10⁹ (stones in each pile)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The game is a variation of **Nim**, where players take turns removing stones from piles sequentially.  
- The key observation is that piles with exactly one stone force a player to move to the next pile, effectively toggling the turn.  
- The first pile with more than one stone determines the winner:  
  - If all piles have exactly one stone, then the parity of `n` decides the winner.  
  - Otherwise, the player who encounters the first pile with more than one stone will win, since they can control the game from that point.  
- **Greedy Strategy:**  
  - Traverse piles from the start.  
  - Toggle the "turn" for each pile of size 1.  
  - At the first pile with more than one stone, decide the winner based on whose turn it is.  

## Time and Space Complexity  
- **Time Complexity:**  `O(n)` per test case, for traversing all piles.  
- **Space Complexity:** `O(n)` for storing pile sizes. 