# Problem Number - 2050C Uninteresting Number  
**Problem Link:** [https://codeforces.com/problemset/problem/2050/C](https://codeforces.com/problemset/problem/2050/C)  

---

## Topics
- Number Theory  
- Implementation  
- Modular Arithmetic  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- Length of `n` ≤ 10⁵  
- Sum of lengths of all test cases ≤ 10⁵  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether we can transform a given number into one **divisible by 9** using the allowed operation:  
  - Choose a digit `x`, square it, and replace the digit with `x²`.  
  - The result must remain a **single digit** (i.e., `x² < 10`).  
- Only digits `0–3` can be squared safely (`0²=0`, `1²=1`, `2²=4`, `3²=9`). Digits `4–9` cannot be squared since their squares exceed `9`.  
- The divisibility rule for 9 states: a number is divisible by 9 if the **sum of its digits is divisible by 9**.  
- Thus, the problem reduces to checking if we can adjust the digit sum to be divisible by 9 using available transformations.  
  - Digits `3` can become `9`, effectively adding `6` to the sum.  
  - Digits `2` can become `4`, effectively adding `2` to the sum.  
  - Digits `0` and `1` won't affect the sum as their squares are same as the number.
- Strategy:  
  1. Compute the initial digit sum.  
  2. If already divisible by 9 → answer is **YES**.  
  3. Otherwise, calculate the remainder `r = sum % 9`.  
  4. Try to fix the sum by using available `2`s and `3`s to add increments of `2` and `6`.  
  5. If possible to reach a multiple of 9 → **YES**, else **NO**.  

## Time and Space Complexity
- **Time Complexity:** `O(|n|)` per test case, where `|n|` is the length of the number string (to compute digit sum and count `2`s and `3`s).  
- **Space Complexity:** `O(1)`, only counters and sum are stored.  
