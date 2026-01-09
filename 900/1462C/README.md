# Problem Number - 1462C Unique Number  
**Problem Link:** [https://codeforces.com/problemset/problem/1462/C](https://codeforces.com/problemset/problem/1462/C)  

---

## Topics  
- Implementation  
- Greedy  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 50 (number of test cases)  
- 1 ≤ `n` ≤ 50 (target sum of digits)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We need to construct the smallest possible integer such that:  
  1. All digits are **distinct**.  
  2. The sum of digits equals `n`.  

- Key observation:  
  - Digits range from 1 to 9 (since 0 doesn’t help in increasing the sum).  
  - To minimize the number, we should use **larger digits first** (starting from 9 downwards) and subtract them from `n`.  
  - This ensures fewer digits are used, and placing them in ascending order at the end gives the smallest possible number.  

- Strategy:  
  1. Start from digit 9 and go down to 1.  
  2. If `n >= i`, include digit `i` in the answer and subtract it from `n`.  
  3. Continue until `n` becomes 0 or digits are exhausted.  
  4. If `n == 0`, print the constructed number; otherwise, print `-1` (not possible).  

## Time and Space Complexity  
- **Time Complexity:** `O(1)` per test case, since at most 9 iterations are needed.  
- **Space Complexity:** `O(1)`, only a string is used to build the answer.  
