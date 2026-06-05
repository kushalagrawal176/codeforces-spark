# Problem Number - 2093C Simple Repetition
**Problem Link:** [https://codeforces.com/problemset/problem/2093/C](https://codeforces.com/problemset/problem/2093/C)

---

## Topics
- Number Theory
- Primality Testing
- Implementation

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `x` ≤ 10⁹  
- 1 ≤ `k` ≤ 7  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem defines a process: take an integer `x` and repeat its decimal representation `k` times to form a new number `y`.  
  - Example: `x = 52, k = 3 → y = 525252`.  
- The task is to determine if `y` is prime.  

### Key Observations:
- Directly constructing `y` as a number can lead to extremely large values (up to ~70 digits), which cannot be handled by standard integer types.  
- Instead, we must reason about the structure of `y`:  
  - If `k = 1`, then `y = x`. We only need to check if `x` is prime.  
  - If `k > 1`, then `y` is a repetition of `x`. Such numbers are divisible by a non-trivial factor (related to repunit numbers and concatenation properties).  
    - For example, `525252` is divisible by `52`.  
    - In general, repeated concatenations of a number cannot be prime unless `x = 1` and `k = 2` (which gives `11`, a prime).  

### Simplified Rule:
- If `k = 1` and `x` is prime → **YES**.  
- If `x = 1` and `k = 2` → **YES** (since `11` is prime).  
- Otherwise → **NO**.  

This avoids constructing huge numbers and relies on mathematical properties of repetition.

## Time and Space Complexity
- **Time Complexity:**  
  - Primality check for `x` up to 10⁹ → `O(√x)`.  
  - With up to 100 test cases, this is efficient.  
- **Space Complexity:** `O(1)`, only constant space used.