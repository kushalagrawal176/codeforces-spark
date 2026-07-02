# Problem Number - 2162B Beautiful String  
**Problem Link:** [https://codeforces.com/problemset/problem/2162/B](https://codeforces.com/problemset/problem/2162/B)  

---

## Topics
- Greedy
- Sorting
- Implementation

---

## Constraints
- 1 ≤ `t` ≤ 3000 (number of test cases)  
- 1 ≤ `n` ≤ 10 (length of string per test case)  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- The problem defines a **beautiful string** as : 
    - find a subsequence `p` from `s` which is non-decreasing 
    - remaining characters from `s` should be palindrome
- **Key Observation** : 
    - remove all zeroes from `s` this gives us subsequence `p`
    - remaining characters will be `1` which is palindrome
- For each test case, we need to output:
  1. The number of `'0'` characters in the string.  
  2. The positions (1-indexed) of all `'0'` characters.  
- The approach is straightforward:
  - Traverse the string once.  
  - Count the number of `'0'` characters.  
  - Collect their indices.  
- This ensures we meet the constraints efficiently since we only scan the string once per test case.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we iterate through the string once.  
- **Space Complexity:** `O(n)` in the worst case, for storing indices of `'0'` characters.  