# Problem Number - 2148C Pacer

**Problem Link:** [https://codeforces.com/problemset/problem/2148/C](https://codeforces.com/problemset/problem/2148/C)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- `n` ≤ `m` ≤ 10⁹
- 1 ≤ `a[i]` ≤ `m`
- `b[i]` ∈ {0, 1}
- `a[i]` > `a[i-1]`
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Farmer John is running the FitnessGram Pacer Test. At the start of each minute **(from 0 to m)**, he can either:
  - Stay on the same side of the gym, or
  - Run to the other side (**gaining one point**).
- We are given `n` checkpoints `(a, b)` where `a` is the minute and `b` is the side of the gym (0 or 1). These checkpoints must be visited exactly at those times and sides.
- The task is to compute the maximum number of points Farmer John can earn while respecting these checkpoints.

### Key Observations:
- Between two consecutive checkpoints `(prev_a, prev_b)` and `(a, b)`:
  - The difference in minutes is `diff = a - prev_a`.
  - If `diff` is even:
    - If sides are the same, Farmer John can earn `diff` points.
    - If sides differ, he loses one opportunity, so earns `diff - 1`.
  - If `diff` is odd:
    - If sides are the same, he earns `diff - 1`.
    - If sides differ, he earns `diff`.
- After processing all checkpoints, Farmer John can still earn points until minute `m`. That adds `(m - prev_a)` points.

### Approach:
1. Initialize Farmer John at `(0, 0)` with score = 0.
2. Iterate through all checkpoints, applying the above rules to accumulate points.
3. Add the remaining points from the last checkpoint to minute `m`.
4. Output the total score.

This greedy approach works because at each interval, the maximum possible points are determined solely by the parity of the time difference and whether the side changes.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we process each checkpoint once.
- **Space Complexity:** `O(1)`, only a few variables are used for tracking.
