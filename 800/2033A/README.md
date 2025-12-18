# Problem Number - 2033A Sakurako and Kosuke  
**Problem Link:** [http://codeforces.com/problemset/problem/2033/A](http://codeforces.com/problemset/problem/2033/A)  

---

## Topics  
- Implementation  
- Simulation  
- Game Theory  

## Constraints  
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem describes a game between **Sakurako** and **Kosuke**.  
- They alternately move a pointer `x` starting from `-1`.  
- On Sakurako’s turn, the pointer decreases by `(2 * i - 1)`.  
- On Kosuke’s turn, the pointer increases by `(2 * i - 1)`.  
- The game continues until the pointer goes outside the range `[-n, n]`.  
- The winner is the player who does **not** make the last move (i.e., the one whose turn would come next).  

### Simplification  
- Instead of simulating the entire process, notice the symmetry:  
  - If `n` is **odd**, the winner is **Kosuke**.  
  - If `n` is **even**, the winner is **Sakurako**.  
- This is because the alternating increments/decrements eventually push `x` outside the range depending on the parity of `n`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since the winner can be determined directly from the parity of `n`.  
- **Space Complexity:** `O(1)`, only constant space is used.  
