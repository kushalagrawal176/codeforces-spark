# Problem Number - 2140B Another Divisibility Problem

**Problem Link:** [https://codeforces.com/problemset/problem/2140/B](https://codeforces.com/problemset/problem/2140/B)

---

## Topics
- Number Theory  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁸ (value of n per test case)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to find the positive integer `m` such that `n # m` is divisible by `n+m`.  
- `#` denotes concatenating `n` and `m`
- This boils down to checking divisibility conditions:
  - If `n` is **odd**, then `nn` is divisible by `2n`.
  - If `n` is **even**, then `n(n/2)` is divisible by `n+(n/2)`.
- Thus, the solution is straightforward:
  - If `n` is odd → output `2n`  
  - If `n` is even → output `n / 2`  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only a parity check and simple arithmetic are performed.  
- **Space Complexity:** `O(1)`, as no extra data structures are required.  