# Problem Number - 2044A Easy Problem

**Problem Link:** [https://codeforces.com/problemset/problem/2044/A](https://codeforces.com/problemset/problem/2044/A)

---

## Topics
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 99  
- 2 ≤ `n` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem is straightforward: for each test case, we are given an integer `n` representing the number.  
- We need to determine how many ordered pairs of positive integers **(a, b)** exist such that : **a = n - b**.  
- **Every number will have `n-1` ordered pairs**
- **Odd numbers** - `n-1 pairs`
- **Even numbers** - `n pairs` exist - `(n/2, n/2)` appears **twice** - so `n-1`
- For each test case, read the integer `n` and output `n - 1`.  

This is a direct application of basic arithmetic and requires no complex logic.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since we process each test case in constant time.  
- **Space Complexity:** `O(1)`, as we only store a few variables for input and output.