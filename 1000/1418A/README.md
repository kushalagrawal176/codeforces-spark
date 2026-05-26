# Problem Number - 1418A Buying Torches  

**Problem Link:** [https://codeforces.com/problemset/problem/1418/A](https://codeforces.com/problemset/problem/1418/A)  

---

## Topics
- Greedy
- Math 
- Implementation

---

## Constraints
- 1 ≤ `t` ≤ 2 ⋅ 10⁴  
- 2 ≤ `x` ≤ 10⁹  
- 1 ≤ `y`, `k` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem asks how many trades are needed to obtain exactly `k` torches.  
- To craft one torch, you need **y sticks + 1 coal**.  
- Therefore, for `k` torches, you need `k * y` sticks and `k` coal.  
- Coal is obtained directly by trading, so you need at least `k` trades for coal.  
- Sticks are obtained by trading stones. Each trade gives you `(x - 1)` sticks (since you spend 1 stone to initiate the trade).
- To get enough sticks, you need to perform:  </br> **Trades for sticks** = ceil((k * y + k - 1) / (x - 1))    
  (the `+k - 1` accounts for the initial stone you already have).  
- The total number of trades is then:  
**Total trades** = Trades for sticks + k
---

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since the formula is computed directly without iteration.  
- **Space Complexity:** `O(1)`, only constant space is used.  
