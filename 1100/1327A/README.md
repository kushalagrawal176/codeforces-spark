# Problem Number - 1327A Sum of Odd Integers  
**Problem Link:** [https://codeforces.com/problemset/problem/1327/A](https://codeforces.com/problemset/problem/1327/A)  
---

## Topics  
- Math  
- Implementation  

## Constraints  
- 1 ≤ k, n ≤ 10⁷  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether a given integer `n` can be represented as the sum of `k` **distinct odd positive integers**.  
- Key observations:
  - The sum of `k` odd numbers is always odd if `k` is odd, and even if `k` is even. So `n` and `k` must have the same parity.
  - The **minimum possible sum** of `k` odd numbers is `k²` (i.e., 1 + 3 + 5 + ... + (2k - 1)).
- Therefore, the conditions to satisfy are:
  - `n` and `k` must have the same parity (`n % 2 == k % 2`)
  - `n` must be at least `k²`
- If both conditions are met, output "YES"; otherwise, output "NO".

## Time and Space Complexity  
- **Time Complexity:** O(1), since the solution involves only basic arithmetic checks.  
- **Space Complexity:** O(1), no additional space is used.
