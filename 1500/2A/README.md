# Problem Number - 2A Winner  
**Problem Link:** [https://codeforces.com/problemset/problem/2/A](https://codeforces.com/problemset/problem/2/A)  

---

## Topics
- Implementation  
- Strings  
- Hashing / Maps  

## Constraints
- 1 ≤ `n` ≤ 1000 (number of rounds)  
- Each score is an integer (can be negative or positive)  
- Time limit per test: 1 seconds  
- Memory limit per test: 64 megabytes  

## Intuition / Approach
- The game consists of `n` rounds where each player earns or loses points.  
- The winner is the player with the highest **final score**.  
- If multiple players tie with the same maximum score, the winner is the one who **reached that score earliest** during the rounds.  

### Steps:
1. Read all names and scores for each round.  
2. Maintain a map of cumulative scores for each player.  
3. After processing all rounds, determine the maximum final score.  
4. Traverse the rounds again, keeping track of running scores.  
   - The first player whose running score reaches the maximum final score is declared the winner.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we process all rounds twice (once for totals, once for earliest winner).  
- **Space Complexity:** `O(n)`, for storing names, scores, and maps of cumulative scores.  
