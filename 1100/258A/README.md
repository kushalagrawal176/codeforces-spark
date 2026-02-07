# Problem Number - 258A Little Elephant and Bits

**Problem Link:** [https://codeforces.com/problemset/problem/258/A](https://codeforces.com/problemset/problem/258/A)

---

## Topics
- Strings
- Greedy
- Implementation

## Constraints
- Input string length: 2 ≤ `|s|` ≤ 10⁵  
- String consists only of characters `'0'` and `'1'`  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to remove **exactly any one digit** from the binary string such that the resulting string is **maximized** or as large as possibel the resulting number.  
- Since removing a `'1'` would reduce the value more significantly, the optimal strategy is to remove the **first occurrence of '0'**.  
- If the string contains no `'0'`, then removing any character (as required) means removing the last character to keep the number as large as possible.  
- Steps:
  1. Traverse the string from left to right.
  2. Skip the first `'0'` encountered.
  3. Print all other characters.
  4. If no `'0'` was found, simply remove the last character.

This greedy approach ensures the largest possible binary number after one deletion.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, where n is the length of the string (single pass through the string).  
- **Space Complexity:** `O(1)`, only constant extra space used.  
