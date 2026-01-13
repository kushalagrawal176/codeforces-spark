# Problem Number - 579A Raising Bacteria  
**Problem Link:** [https://codeforces.com/problemset/problem/579/A](https://codeforces.com/problemset/problem/579/A)  

---

## Topics  
- Bit Manipulation  
- Math  
- Implementation  

## Constraints  
- 1 ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- Each bacterium doubles itself every day.  
- To reach exactly `n` bacteria, we can think of `n` in **binary representation**.  
- Each `1` in the binary form of `n` represents a bacterium that must be present initially.  
- Therefore, the minimum number of bacteria needed is equal to the **number of set bits (1s)** in `n`.  
- In C++, this is done using `__builtin_popcount(n)`.  
- In Java, the equivalent is `Integer.bitCount(n)`.  

This works because doubling corresponds to powers of 2, and the binary decomposition of `n` directly tells us how many bacteria are required.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since counting set bits is a constant-time operation.  
- **Space Complexity:** `O(1)`, no extra memory needed.  