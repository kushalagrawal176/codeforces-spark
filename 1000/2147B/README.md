# Problem Number - 2147B Multiple Construction  
**Problem Link:** [https://codeforces.com/problemset/problem/2147/B](https://codeforces.com/problemset/problem/2147/B)  

---

## Topics
- Constructive Algorithms
- Greedy

---

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 ⋅ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to construct a permutation of numbers from 1 to `n` such that **no prefix sum is divisible by `n`**.  
- A simple constructive approach works:  
  - Start by printing numbers in descending order from `n` to `1`.  
  - Then append `n` again, followed by ascending numbers from `1` to `n-1`.  
- This guarantees that no prefix sum is divisible by `n`, because the placement of `n` at the start and again later breaks divisibility patterns.  
- The construction is deterministic and works for all valid `n`.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we print `2n` numbers.  
- **Space Complexity:** `O(1)`, as we only use constant extra space for iteration.  
