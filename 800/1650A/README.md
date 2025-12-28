# Problem Number - 1650A Deletions of Two Adjacent Letters  
**Problem Link:** [https://codeforces.com/problemset/problem/1650/A](https://codeforces.com/problemset/problem/1650/A)  
---

## Topics
- Implementation  
- Strings  
- Simulation  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `|a|` ≤ 49 (length of string `a`)  
- String `a` consists of lowercase English letters  
- String `b` consists of a single lowercase English letter  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to delete pairs of adjacent letters from string `a` such that only the single letter `b` remains.  
- Key observation: For the letter `b` to remain after deletions, its position in `a` must allow symmetric deletions from both sides.  
- This means both the number of characters to the left of `b` and the number of characters to the right of `b` must be even.  
- Algorithm:  
  1. Iterate through string `a`.  
  2. Whenever `a[i] == b[0]`, check if both `i` (left side length) and `(n - i - 1)` (right side length) are even.  
  3. If such a position exists, output `"YES"`. Otherwise, output `"NO"`.   

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, only a flag and counters are used.  
