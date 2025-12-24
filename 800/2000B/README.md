# Problem Number - 2000B Seating in a Bus  
**Problem Link:** [https://codeforces.com/problemset/problem/2000/B](https://codeforces.com/problemset/problem/2000/B)  

---

## Topics  
- Greedy  
- Implementation  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 10^4
- 1 ≤ `n` ≤ 2 × 10^5 (sum of n across all test cases) 
- 1 ≤ `a[i]` ≤ n
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The bus has seats numbered from 1 to n. Passengers arrive one by one and choose seats.  
- Rule:  
  - The first passenger can sit anywhere.  
  - Each subsequent passenger must sit in a seat adjacent to at least one already occupied seat.  
- To check validity:  
  - Track the **minimum** and **maximum** occupied seat numbers.  
  - Each new passenger must either extend the contiguous block of occupied seats by sitting at `min - 1` or `max + 1`.  
  - If a passenger chooses a seat outside this contiguous block, the sequence is invalid.  
- If all passengers follow the rule, output `"YES"`, otherwise `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan all seat choices once.  
- **Space Complexity:** `O(1)`, only tracking min and max seat indices.  
