# Problem Number - 158A Next Round  
**Problem Link:** [https://codeforces.com/problemset/problem/158/A](https://codeforces.com/problemset/problem/158/A)  

---

## Topics  
- Implementation  
- Simulation  
- Greedy  

## Constraints  
- 1 ≤ n ≤ 50  
- 1 ≤ k ≤ n  
- 0 ≤ scores[i] ≤ 100  
- Time limit per test: 3 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks for the number of participants who advance to the next round based on their scores.  
- The cutoff score is defined as the score of the participant in the `k`-th position (1-indexed).  
- A participant advances if their score is **≥ cutoff** and **> 0**.  
- Steps to solve:  
  1. Read `n` (number of participants) and `k` (position of cutoff).  
  2. Store all participants' scores in an array.  
  3. Determine the cutoff score as `scores[k-1]`.  
  4. Count how many participants have scores ≥ cutoff and > 0.  
  5. Output the count.  

## Time and Space Complexity  
- **Time Complexity:** O(n), since we iterate through all participants once.  
- **Space Complexity:** O(n), for storing the scores array.  
