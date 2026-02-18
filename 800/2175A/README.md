# Problem Number - 2175A Little Fairy's Painting  

**Problem Link:** [https://codeforces.com/problemset/problem/2175/A](https://codeforces.com/problemset/problem/2175/A)  

---

## Topics
- Implementation  
- Simulation  
- Sets / Hashing  

---

## Constraints
- 1 ≤ `t` ≤ 500  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `aᵢ` ≤ 1000  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The fairy has a ribbon of length `10¹⁸`. The first `n` cells are already colored.  
- For each new cell, the fairy counts the number of **distinct colors** currently on the ribbon (`cᵢ`) and uses that as the color for the next cell.  
- The question asks: **What will be the color of the 10¹⁸-th cell?**  

### Key Observations:
1. The process stabilizes quickly:
   - If the number of distinct colors is `k`, then the fairy will eventually color cells with color `k`.  
   - Once color `k` appears, the number of distinct colors may increase if `k` was not already present.  
2. The final answer is the **smallest integer ≥ k that already exists in the initial array**.  
   - If such a number doesn’t exist, the answer is simply `k`.  

### Steps:
1. Count the number of distinct colors in the initial array → `cnt`.  
2. If `cnt` itself exists in the array, then the answer is the smallest such number ≥ `cnt`.  
3. Otherwise, the answer is `cnt`.  

This logic ensures we directly compute the final color without simulating up to `10¹⁸`.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` using sorting, or `O(n)` with hashing.  
- **Space Complexity:** `O(n)` for storing distinct colors.  