# Problem Number - 2133A Redstone?

**Problem Link:** [https://codeforces.com/problemset/problem/2133/A](https://codeforces.com/problemset/problem/2133/A)

---

## Topics
- Implementation  
- Number Theory  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 2 ≤ `n` ≤ 100  
- 2 ≤ `aᵢ` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a sequence of gears, each with a certain number of teeth.  
- When gears are arranged in a row, the rotation speed of each gear depends on the ratio of teeth between consecutive gears.  
- Steve wants the rightmost gear to spin at exactly **1 revolution per second** after starting the leftmost gear at speed 1.  
- Mathematically, the speed of the rightmost gear becomes a fraction involving all gear teeth ratios.  
- For this fraction to equal 1, the product of all numerators and denominators must balance out.  
- This condition is satisfied **if and only if there exists at least one duplicate gear tooth count** (because rearranging identical gears allows the ratio chain to cancel out).  
- Thus, the solution reduces to checking whether any number appears more than once in the input list.  
- If duplicates exist → output `"YES"`.  
- Otherwise → output `"NO"`.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we just check frequencies of gear teeth.  
- **Space Complexity:** `O(1)`, as the frequency array is bounded by 100 (constant size).
