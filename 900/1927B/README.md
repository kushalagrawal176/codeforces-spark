# Problem Number - 1927B Following the String  
**Problem Link:** [https://codeforces.com/problemset/problem/1927/B](https://codeforces.com/problemset/problem/1927/B)  

---

## Topics  
- Implementation  
- Strings  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (length of the sequence)  
- 0 ≤ `c` ≤ `n` (input values for sequence construction)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem requires constructing a string based on given integer inputs.  
- Each integer `c` represents a "bucket" or group. For every occurrence of `c`, we assign a character starting from `'a'`.  
- Specifically, we maintain a counter for each bucket `c`. The first time we see `c`, we output `'a'`. The next time, `'b'`, and so on.  
- This ensures that the sequence of characters follows the order of occurrences for each bucket.  
- The approach is straightforward:  
  1. Initialize an array `a[]` to track counts for each bucket.  
  2. For each input `c`, print `char('a' + a[c])`.  
  3. Increment `a[c]` to move to the next character for that bucket.  

This simulates the process of "following the string" as described in the problem.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we process each input once.  
- **Space Complexity:** `O(n)`, due to the array used to store counts for each bucket.  
