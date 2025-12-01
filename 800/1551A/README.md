# Problem Number - 1551A Polycarp and Coins

**Problem Link:** [https://codeforces.com/problemset/problem/1551/A](https://codeforces.com/problemset/problem/1551/A)

---

## Topics
- Implementation  
- Greedy  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10000 (number of test cases)  
- 1 ≤ `n` ≤ 10^9 (number of coins)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Polycarp wants to split `n` coins into two types:  
  - Type 1 coins worth `1`  
  - Type 2 coins worth `2`  
- The goal is to minimize the difference between the number of type 1 and type 2 coins.  
- If `n` is divisible by 3 → both counts are equal (`n/3, n/3`).  
- If `n % 3 == 1` → we can assign `(n/3 + 1)` type 1 coins and `n/3` type 2 coins.  
- If `n % 3 == 2` → we can assign `n/3` type 1 coins and `(n/3 + 1)` type 2 coins.  
- This ensures the total sum equals `n` and the counts are as balanced as possible.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since calculations are direct using division and modulus.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  
