# Problem Number - 2072A New World, New Me, New Array  
**Problem Link:** [https://codeforces.com/problemset/problem/2072/A](https://codeforces.com/problemset/problem/2072/A)  

---

## Topics  
- Implementation  
- Math  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 1000
- 1 ≤ `n` ≤ 50  
- -2500 ≤ `k` ≤ 2500  
- 1 ≤ `p` ≤ 50  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine the minimum number of operations required to make sum of all elements equal to `k`.
- Steps:  
  - Compute `cnt = |k| / p`, which is the integer division result.  
  - If `|k| % p != 0`, then one additional operation is needed, so increment `cnt`.  
  - If `cnt ≤ n`, output `cnt` (the number of operations needed).  
  - Otherwise, output `-1` (not possible within the allowed operations).  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, no extra storage required.  
