# Problem Number - 43A Football  
**Problem Link:** [https://codeforces.com/problemset/problem/43/A](https://codeforces.com/problemset/problem/43/A)  

---

## Topics  
- Strings  
- Hashing  
- Implementation  

## Constraints  
- 1 ≤ `n` ≤ 100  
- Each team name consists of uppercase Latin letters, length ≤ 10  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem requires determining which team won the match based on the list of goals scored.  
- Each input string represents the team that scored a goal.  
- By counting the frequency of each team name, we can identify the team with the maximum number of goals.  
- Use a hash map (dictionary) to store team names and their goal counts.  
- Track the team with the highest count while processing input.  
- Finally, output the team name with the maximum goals.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we process each goal once.  
- **Space Complexity:** `O(n)`, for storing team names in the hash map.  
