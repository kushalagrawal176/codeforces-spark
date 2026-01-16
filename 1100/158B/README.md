# Problem Number - 158B Taxi  
**Problem Link:** [https://codeforces.com/problemset/problem/158/B](https://codeforces.com/problemset/problem/158/B)  

---

## Topics  
- Greedy  
- Implementation  
- Simulation  
- Math  

---

## Constraints  
- 1 ≤ `n` ≤ 10^5 (number of groups)  
- Group sizes are integers between 1 and 4  
- Time limit per test: 3 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- You are given `n` groups of children, each group having size between 1 and 4.  
- Each taxi can carry **exactly 4 children**. The goal is to minimize the number of taxis required.  
- **Strategy:**  
  1. Groups of size `4` always occupy a taxi alone.  
  2. Groups of size `3` can be paired with groups of size `1`.  
  3. Groups of size `2` can be paired together, or with two groups of size `1`.  
  4. Remaining groups of size `1` are grouped into taxis of 4.  
- This greedy allocation ensures the minimum number of taxis.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, scanning through all groups once.  
- **Space Complexity:** `O(1)`, only counters for group sizes are used.  
