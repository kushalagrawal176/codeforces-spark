# Problem Number - 1607B Odd Grasshopper  
**Problem Link:** [https://codeforces.com/problemset/problem/1607/B](https://codeforces.com/problemset/problem/1607/B)  

---

## Topics  
- Implementation  
- Math  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- -10¹⁴ ≤ `x` ≤ 10¹⁴ (initial position of the grasshopper)  
- 0 ≤ `n` ≤ 10¹⁴ (number of jumps)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The grasshopper starts at position `x` and makes `n` jumps.  
- The jumps follow a pattern:  
  - On the 1st jump, move +1.  
  - On the 2nd jump, move -2.  
  - On the 3rd jump, move +3.  
  - On the 4th jump, move -4.  
  - And so on, alternating between adding and subtracting.  

- Instead of simulating all jumps (which is impossible for large `n`), we notice a repeating cycle every **4 jumps**.  
- By precomputing the effect of `n % 4`, we can directly calculate the final position:  
  - If `x` is even → final position = `x + adjustment[n % 4]`.  
  - If `x` is odd → final position = `x - adjustment[n % 4]`.  
- Where `adjustment = {0, -n, 1, n+1}`.  

This clever observation reduces the problem to constant-time arithmetic per test case.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only modular arithmetic and a few operations are performed.  
- **Space Complexity:** `O(1)`, only a small fixed array is used.  
