# Problem Number - 41A Translation  
**Problem Link:** [https://codeforces.com/problemset/problem/41/A](https://codeforces.com/problemset/problem/41/A)  

---

## Topics
- Implementation
- Strings

## Constraints
- 1 ≤ `|s|`, `|t|` ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives two strings `s` and `t`.  
- The task is to check if `t` is the reverse of `s`.  
- Approach:  
  1. Read both strings.  
  2. Reverse string `s`.  
  3. Compare the reversed `s` with `t`.  
  4. If they match, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, where `n` is the length of the string (for reversing/comparison).  
- **Space Complexity:** `O(1)`, only constant extra space is used.  
