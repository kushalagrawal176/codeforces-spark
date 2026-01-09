# Problem Number - 1337B Kana and Dragon Quest game  
**Problem Link:** [https://codeforces.com/problemset/problem/1337/B](https://codeforces.com/problemset/problem/1337/B)  

---

## Topics  
- Implementation  
- Greedy  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `x` ≤ 10⁵ (initial health of the monster)  
- 0 ≤ `n`, `m` ≤ 30 (number of Void Absorption and Lightning Strike spells)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The monster starts with health `x`. We have two types of spells:  
  1. **Void Absorption**: reduces health to `x/2 + 10`.  
  2. **Lightning Strike**: reduces health by 10.  

- Key observation:  
  - Void Absorption is only effective when `x > 20`.  
    - If `x ≤ 20`, then `x/2 + 10 ≥ x`, meaning it no longer reduces health.  
  - Therefore, we should apply Void Absorption while `x > 20` and we still have spells left.  
  - After that, we can apply Lightning Strike repeatedly to reduce health further.  

- Greedy strategy:  
  1. While `n > 0` and `x > 20`, apply Void Absorption.  
  2. Then apply Lightning Strike `m` times.  
  3. If health `x ≤ 0` after these operations, print **YES**, otherwise **NO**.  

This approach works because Void Absorption drastically reduces large health values, while Lightning Strike is more effective for smaller values.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since the number of operations is bounded by `n + m ≤ 60`.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
