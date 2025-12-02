# Problem Number - 1858A Buttons
**Problem Link:** [https://codeforces.com/problemset/problem/1858/A](https://codeforces.com/problemset/problem/1858/A)

---

## Topics
- Implementation
- Game Theory
- Math

## Constraints
- 1 ≤ `t` ≤ 10000  
- 1 ≤ `a`, `b`, `c` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a game where two players ("First" and "Second") start with `a` and `b` buttons respectively, and there are `c` extra buttons to be distributed.
- The distribution rule is:
  - Each player gets `c/2` buttons.
  - If `c` is odd, the extra button goes to the **First** player.
- After distribution, compare the total buttons of both players:
  - If `a > b`, output `"First"`.
  - Otherwise, output `"Second"`.
- This ensures fairness with a slight advantage to the First player when `c` is odd.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since we process each test case in constant time.  
- **Space Complexity:** `O(1)`, only a few variables are used per test case.
