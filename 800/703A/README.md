# Problem Number - 703A Mishka and Game  
**Problem Link:** [https://codeforces.com/problemset/problem/703/A](https://codeforces.com/problemset/problem/703/A)  

---

## Topics  
- Implementation  
- Simulation  

---

## Constraints  
- 1 ≤ `n` ≤ 100 (number of rounds)  
- 1 ≤ `mi`, `ci` ≤ 6 (scores in each round)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The problem describes a game between Mishka and Chris over `n` rounds.  
- In each round:  
  - Mishka scores `m` points.  
  - Chris scores `c` points.  
- The winner of the round is the one with the higher score.  
- We need to determine the overall winner after all rounds:  
  - If Mishka wins more rounds → print `"Mishka"`.  
  - If Chris wins more rounds → print `"Chris"`.  
  - If both win the same number of rounds → print `"Friendship is magic!^^"`.  

**Steps to solve:**  
1. Read the number of rounds `t`.  
2. Initialize counters for Mishka’s wins and Chris’s wins.  
3. For each round, compare `a` and `b`:  
   - Increment Mishka’s counter if `a > b`.  
   - Increment Chris’s counter if `a < b`.  
4. After all rounds, compare counters and print the result accordingly.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we process each round once.  
- **Space Complexity:** `O(1)`, only a few counters are used.  
