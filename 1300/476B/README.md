# Problem Number - 476B Dreamoon and WiFi

**Problem Link:** [https://codeforces.com/problemset/problem/476/B](https://codeforces.com/problemset/problem/476/B)

---

## Topics
- Probability
- Combinatorics
- Implementation
- Bitmasks

## Constraints
- Length of both strings ≤ 10  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Dreamoon starts at **position 0** and follows commands sent by Drazil.  
- Commands are either `'+'` (move +1) or `'-'` (move -1).  
- Due to poor WiFi, Dreamoon’s phone may receive some commands as `'?'`, meaning they are unrecognized.  
- For each `'?'`, Dreamoon flips a fair coin to decide whether to move +1 or -1.  
- We need to calculate the probability that Dreamoon ends at the same final position as Drazil intended.

### Steps:
1. Compute the final position `sum1` from Drazil’s original command string `s1`.  
2. Compute the partial position `sum2` from Dreamoon’s recognized commands in `s2`, ignoring `'?'`.  
3. Let `k` be the number of `'?'` characters.  
4. The difference `needed = sum1 - sum2` represents how much adjustment is required from the `'?'` commands.  
5. Each `'?'` contributes either +1 or -1, so the total possible outcomes are **\(2^k\)**.  
6. To reach the required adjustment, we need exactly `x = (needed + k) / 2` of the `'?'` to be `+1`.  
   - If `(needed + k)` is odd, or `x` is outside `[0, k]`, **probability = 0.0**.  
7. The number of favorable outcomes is given by the binomial coefficient **\( C(k, x) \)**.  
8. Probability = $\frac{\binom{k}{x}}{2^k}$
.

## Time and Space Complexity
- **Time Complexity:** `O(k)`, since we compute binomial coefficients iteratively.  
- **Space Complexity:** `O(1)`, only constant space used.  
