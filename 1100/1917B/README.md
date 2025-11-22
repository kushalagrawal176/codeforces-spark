# Problem Number - 1917B Erase First or Second Letter
**Problem Link:** [https://codeforces.com/problemset/problem/1917/B](https://codeforces.com/problemset/problem/1917/B)  

---

## Topics  
- Strings  
- Implementation  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 2 × 10⁵  
- Sum of `n` over all test cases ≤ 2 × 10⁵  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to count the number of distinct substrings that can be formed by erasing first or second character of the string.  
- Key observation: Each distinct character encountered in the string contributes to new substrings.  
- For every character `s[i]` that appears for the first time, it contributes `(n - i)` substrings, because from position `i` to the end, all suffixes starting there are unique due to that new character.  
- Thus, the solution is to iterate through the string, track which characters have already appeared, and for each new character add `(n - i)` to the answer.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the string once and update counts.  
- **Space Complexity:** `O(26) = O(1)`, for storing character frequencies.  
