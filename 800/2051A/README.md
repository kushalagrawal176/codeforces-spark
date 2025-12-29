# Problem Number - 2051A Preparing for the Olympiad  
**Problem Link:** [https://codeforces.com/problemset/problem/2051/A](https://codeforces.com/problemset/problem/2051/A)  

---

## Topics  
- Implementation  
- Greedy  
- Arrays  

## Constraints  
- 1 ≤ `t` ≤ 10^3  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `a[i]`, `b[i]` ≤ 100  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem describes two participants, **Monocarp** and **Stereocarp**, preparing for the Olympiad.  
- Monocarp can choose which days to train, and on day `i` he solves `a[i]` problems.  
- If Monocarp trains on day `i` (where `i < n`), then Stereocarp will train on day `i+1`, solving `b[i+1]` problems.  
- Monocarp wants to maximize the difference `(m - s)` where `m` is the total problems he solves and `s` is the total problems Stereocarp solves.  

### Key Observations  
1. If Monocarp trains on day `i`, then Stereocarp trains the next day.  
2. To maximize the difference, Monocarp should only train on days where his solved problems `a[i]` exceed Stereocarp’s problems `b[i+1]`.  
3. For each such day, the contribution to the difference is `(a[i] - b[i+1])`.  
4. On the last day (`n`), Monocarp can train freely since Stereocarp cannot train afterward. So we always add `a[n-1]` to the result.  

### Algorithm  
- Iterate through days `1` to `n-1`.  
- If `a[i] >= b[i+1]`, add `(a[i] - b[i+1])` to the counter.  
- Finally, add `a[n-1]` (last day’s problems) to the counter.  
- Print the result.  

This greedy approach ensures Monocarp maximizes his advantage.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we iterate through the array once.  
- **Space Complexity:** `O(n)`, for storing the two arrays `a` and `b`.  
