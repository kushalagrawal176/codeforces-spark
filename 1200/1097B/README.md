# Problem Number - 1097B Petr and a Combination Lock

**Problem Link:** [https://codeforces.com/problemset/problem/1097/B](https://codeforces.com/problemset/problem/1097/B)

---

## Topics

- Dynamic Programming  
- Subset Sum  
- Modular Arithmetic  
- Bitmasks  

## Constraints

- 1 ≤ `n` ≤ 15  
- 1 ≤ `aᵢ` ≤ 180  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach

- Petr must return the combination lock pointer to 0° after n rotations, where each rotation angle aᵢ can be applied clockwise (+aᵢ) or counterclockwise (-aᵢ).  
- Track reachable positions modulo 360 using a boolean DP array `dp[pos]` indicating if position `pos` is reachable.  
- For each angle, update reachable positions by marking `(pos + aᵢ) % 360` and `(pos - aᵢ + 360) % 360` as reachable states using a temporary array to avoid overriding current state.  
- After processing all angles, check if `dp[0]` is true, meaning the pointer can be back to 0°.  

## Time and Space Complexity

- **Time Complexity:** `O(n × 360)` due to processing each angle and all modulo positions.  
- **Space Complexity:** `O(360)` using fixed-size boolean arrays for reachable positions.  
