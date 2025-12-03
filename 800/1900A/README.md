# Codeforces Problem 1900A - Cover in Water

[![Problem Link](https://img.shields.io/badge/Codeforces-1900A-brightgreen)](https://codeforces.com/problemset/problem/1900/A)

## Problem Link
[https://codeforces.com/problemset/problem/1900/A](https://codeforces.com/problemset/problem/1900/A)

---

## Topics
- Greedy
- String Processing
- Implementation

## Constraints
- 1 ≤ `t` ≤ 100
- 1 ≤ `n` ≤ 100
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Filip must fill all empty cells (`.`) using minimum water placements; water spreads automatically between placements.
- If three consecutive dots (`...`) exist, place water at positions 1 and 3—middle fills via spreading, using only **2 placements total**.
- Without three consecutive dots, each isolated dot requires individual water placement, so count them directly.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case for string scanning
- **Space Complexity:** `O(1)` excluding input storage