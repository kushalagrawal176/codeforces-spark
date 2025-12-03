# Problem Number - 1881A Don't Try to Count  
**Problem Link:** https://codeforces.com/problemset/problem/1881/A  

---

## Topics  
- Implementation  
- Strings  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 10000 (number of test cases)  
- 1 ≤ `n⋅m` ≤ 25 (lengths of strings `x` and `s`)  
- Strings consist of lowercase Latin letters (`a`–`z`)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem provides two strings:  
  - `x` of length `n`  
  - `s` of length `m`  
- We need to determine the minimum number of times `x` must be concatenated with itself so that `s` becomes a substring of the resulting string.  
- If `s` cannot be formed even after concatenating `x` up to 5 times, the answer is `-1`.  
- Approach:  
  1. Start with `x` as the base string.  
  2. Check if `s` is a substring of the current string.  
  3. If not, concatenate `x` again and repeat the check.  
  4. Continue this process up to 5 concatenations.  
  5. Return the smallest number of concatenations needed, or `-1` if not possible.  

This is a direct simulation problem where we repeatedly double the string and check for substring existence.  

## Time and Space Complexity  
- **Time Complexity:** `O(n × k)`, where `k` is the number of concatenations (at most 5). Substring checking is linear in the length of the concatenated string.  
- **Space Complexity:** `O(n × k)`, for storing the concatenated string.  
