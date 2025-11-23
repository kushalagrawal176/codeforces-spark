# Problem Number - 268A Games  
**Problem Link:** [https://codeforces.com/problemset/problem/268/A](https://codeforces.com/problemset/problem/268/A)  

---

## Topics
- Implementation
- Brute Force
- Simulation

## Constraints
- 2 ≤ `n` ≤ 30  
- 1 ≤ `hi`, `ai` ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes `n` football teams, each with a home uniform color and an away uniform color.  
- Whenever two teams play, if the home team’s uniform color matches the away team’s uniform color, the away team must change uniforms.  
- We need to count how many such clashes occur across all possible matches.  
- Approach:
  1. Read the number of teams `n`.  
  2. Store each team’s home and away colors.  
  3. For every pair of teams `(i, j)` where `i ≠ j`, check if `home[i] == away[j]`.  
  4. If true, increment the clash counter.  
- This brute force approach works efficiently because `n` is small (≤ 30), so checking all pairs is feasible.

## Time and Space Complexity
- **Time Complexity:** `O(n²)`, since we compare each team’s home color with every other team’s away color.  
- **Space Complexity:** `O(n)`, for storing the home and away colors of all teams.
