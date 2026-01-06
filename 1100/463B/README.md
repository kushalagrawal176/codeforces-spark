# Problem Number - 463B Caisa and Pylons  
**Problem Link:** [https://codeforces.com/problemset/problem/463/B](https://codeforces.com/problemset/problem/463/B)  

---

## Topics
- Implementation  
- Greedy  
- Simulation  

## Constraints
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `height of pylons` ≤ 10⁵  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum initial energy (coins) Caisa needs to cross all pylons.  
- Caisa starts at ground level (height 0) and moves from left to right across the pylons.  
- When moving from a pylon of height `h[i]` to `h[i+1]`:  
  - If `h[i] ≥ h[i+1]`, Caisa gains energy equal to the difference.  
  - If `h[i] < h[i+1]`, Caisa spends energy equal to the difference.  
- If at any point energy becomes negative, Caisa must spend enough coins to cover the deficit.  
- Therefore, the minimum initial energy required is the maximum height among all pylons, because starting with that much ensures he can always climb up without deficit.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for iterating through all pylons once.  
- **Space Complexity:** `O(1)`, only constant space used for tracking energy and coins.  
