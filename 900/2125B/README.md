# Problem Number - 2125B Left and Down  

**Problem Link:** [https://codeforces.com/problemset/problem/2125/B](https://codeforces.com/problemset/problem/2125/B)  

---

## Topics
- Number Theory  
- Greatest Common Divisor (GCD)  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `a`, `b`, `k` ≤ 10¹⁸  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to reach the bottom-left corner of a grid `(0, 0)` using following operations:
    - choose 2 integers `dx` and `dy` (both from `0` to `k` inclusive)
    - change `x` -> `x-dx` and `y` → `y-dy`
    - if `(dx, dy)` is used first time → **cost = 1**
    - if `(dx, dy)` is used before → **cost = 0**
    - **dx ≠ dy**
- Find minimum total cost required. We don't have to minimize number of operations
- The key observation is that the movement depends on the greatest common divisor (GCD) of `a` and `b`.  
- If we divide both `a` and `b` by their GCD, we get the reduced steps required in each direction.  
- If both reduced values `a/g` and `b/g` are less than or equal to `k`, then it is possible in **1 move** (output `1`).  
- Otherwise, it requires **2 moves** (output `2`).  

### Step-by-step:
1. Compute `g = gcd(a, b)`.  
2. Reduce both values: `a/g` and `b/g`.  
3. Check if both are ≤ `k`.  
   - If yes → print `1`.  
   - Else → print `2`.  

This works because the GCD represents the largest step size that can evenly divide both dimensions, and the reduced values represent the minimal number of moves needed.

## Time and Space Complexity
- **Time Complexity:** Each test case requires computing GCD → `O(log(min(a, b)))`.  
- **Space Complexity:** `O(1)`, only constant space used for variables.