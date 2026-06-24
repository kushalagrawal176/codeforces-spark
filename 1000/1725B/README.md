# Problem Number - 1725B Basketball Together

**Problem Link:** [https://codeforces.com/problemset/problem/1725/B](https://codeforces.com/problemset/problem/1725/B)

---

## Topics
- Greedy
- Sorting
- Implementation

---

## Constraints
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `d` ≤ 10⁹  
- 1 ≤ `p[i]` ≤ 10⁹  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks for the maximum number of teams that can be formed such that each team’s total strength is greater than `d`.  
- Each player has a strength `p[i]`. A team can consist of one or more players.  
- **Greedy idea:**  
  - Sort the array of strengths.  
  - Start from the strongest player (largest `p[i]`).  
  - If their strength alone is greater than `d`, they form a team.  
  - Otherwise, calculate how many weaker players are needed to accompany them: `k = d / p[i]`.  
  - If enough players remain, form a team and increment the count.  
- This ensures we maximize the number of teams by always trying to use the strongest available player first.

---

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(1)`, aside from the input storage.  