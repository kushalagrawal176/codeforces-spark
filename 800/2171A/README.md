# Problem Number - 2171A Shizuku Hoshikawa and Farm Legs  
**Problem Link:** [https://codeforces.com/problemset/problem/2171/A](https://codeforces.com/problemset/problem/2171/A)  

---

## Topics
- Implementation  
- Math  
- Number Theory  

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to determine how many ways Shizuku can form "farm legs" given an integer `n`.  
- Observations:  
  - If `n` is odd, the answer is always `0` because legs must be paired evenly.  
  - If `n` is even:  
    - Count one way for `n % 2 == 0`.  
    - Count another way if `n % 4 == 0`.  
    - Additionally, check for combinations where splitting `n` into two parts satisfies the condition `(n - i) % 4 == 0` for even `i ≥ 6`.  
- Approach:  
  - For each test case, check if `n` is odd → output `0`.  
  - Otherwise, increment the count based on divisibility rules and valid splits.  
  - Print the total count.  

## Time and Space Complexity
- **Time Complexity:** `O(n/2) = O(n)` in the worst case due to iterating over even values up to `n`.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
