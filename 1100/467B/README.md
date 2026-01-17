# Problem Number - 467B Fedor and New Game  
**Problem Link:** [https://codeforces.com/problemset/problem/467/B](https://codeforces.com/problemset/problem/467/B)  
---
## Topics
- Bit Manipulation  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 20  
- 1 ≤ `m` ≤ 1000  
- 1 ≤ `k` ≤ `n`  
- 1 ≤ `a[i]` ≤ `2^n - 1`  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Each player’s army is represented as an integer, where the binary form encodes the presence of soldiers.  
- Fedor’s army is given as the last integer in the list.  
- The task is to count how many of the other `m` armies differ from Fedor’s army in at most `k` positions (bits).  
- To solve this:
  - Use XOR (`^`) between Fedor’s army and another army to identify differing bits.  
  - Count the number of set bits in the XOR result (this is the **Hamming distance**).  
  - If the count ≤ `k`, then that army is considered similar enough.  
- Iterate through all `m` armies and count how many satisfy the condition.

## Time and Space Complexity
- **Time Complexity:** `O(m)`, since we compare each army once and bit counting is O(1) for n ≤ 20.  
- **Space Complexity:** `O(1)`, aside from storing the input array.  
