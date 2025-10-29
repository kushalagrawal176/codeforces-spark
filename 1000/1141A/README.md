# Problem Number - 1141A Game 23
**Problem Link:** [https://codeforces.com/problemset/problem/1141/A](https://codeforces.com/problemset/problem/1141/A)

---

## Topics

1. Math
2. Implementation

## Constraints

1. 1 ≤ n ≤ m ≤ 5⋅10^8

## Intuition / Approach

1. We have to transform `n` to `m`. That means `n * factor = m`, so `m` must be divisible by `n`.
2. If `m` is not divisible by `n`, return `-1`.
3. Calculate the value of `factor = m / n`.
4. Run a loop until `factor > 1`.
5. If divisible by 3 → increment `cnt` and divide `factor` by 3.
6. If divisible by 2 → increment `cnt` and divide `factor` by 2.
7. Add a condition to check if `factor` is reducing; otherwise, the loop could run infinitely.
8. Return `cnt`.

---

## Time and Space Complexity

- **Time Complexity:** O(log(m/n))  
- **Space Complexity:** O(1)
