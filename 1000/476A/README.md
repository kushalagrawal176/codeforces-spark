# Problem Number - 476A Dreamoon and Stairs  
**Problem Link:** [https://codeforces.com/problemset/problem/476/A](https://codeforces.com/problemset/problem/476/A)  

---

## Topics  
- Math  
- Implementation  
- Brute Force  

## Constraints  
- 0 ≤ `n` ≤ 10000 (total number of stairs)  
- 1 ≤ `m` ≤ 10 (step size constraint)  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- Dreamoon wants to climb exactly `n` stairs.  
- He can take either 1 or 2 stairs at a time.  
- The total number of moves must be divisible by `m`.  
- The minimum number of moves required is `ceil(n / 2)` because taking 2 steps whenever possible reduces the total moves.  
- Starting from `ceil(n / 2)`, increment until the number of moves is divisible by `m`.  
- If no such number exists (i.e., `m > n`), output `-1`.  
- Otherwise, output the smallest valid number of moves.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, in the worst case we may increment until reaching `n`.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
