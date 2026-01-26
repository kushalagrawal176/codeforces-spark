# Problem Number - 1487B Cat Cycle  
**Problem Link:** [https://codeforces.com/problemset/problem/1487/B](https://codeforces.com/problemset/problem/1487/B)  

---

## Topics  
- Implementation  
- Simulation  
- Modular Arithmetic  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 10⁹ (number of cats arranged in a circle)  
- 1 ≤ `k` ≤ 10⁹ (number of steps)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- Cats are arranged in a circle, and each second the "active" cat moves to the next position.  
- For **even n**: the cycle is straightforward. After `k` steps, the active cat is at position `(k % n)`, adjusted for 1-based indexing.  
- For **odd n**: the cycle shifts differently because after every `(n/2)` steps, the sequence "skips" one extra position.  
  - The number of extra shifts after `k` steps is `(k - 1) / (n / 2)`.  
  - So the final position is `(k + extra) % n`, again adjusted for 1-based indexing.  
- This ensures we correctly simulate the cat cycle without iterating step by step, which would be too slow for large `n` and `k`.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since only arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, no extra memory is required beyond variables.  
