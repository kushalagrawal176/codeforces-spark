# Problem Number - 1971B Different String

**Problem Link:** [https://codeforces.com/problemset/problem/1971/B](https://codeforces.com/problemset/problem/1971/B)

---

## Topics
- Strings  
- Implementation  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `|s|` ≤ 10 
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether it is possible to rearrange the given string `s` into a new string that is **different** from the original.  
- Key observations:
  - If all characters in the string are the same (e.g., `"aaaa"`), then no rearrangement can produce a different string → answer is `"NO"`.  
  - Otherwise, we can simply swap the first character with the first different character we encounter. This guarantees a new string that is different from the original.  
- Steps:
  1. Check if all characters are identical. If yes, print `"NO"`.  
  2. If not, find the first index `i` where `s[i] != s[0]`.  
  3. Swap `s[0]` and `s[i]` to form a new string.  
  4. Print `"YES"` and the new string.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once to find a different character.  
- **Space Complexity:** `O(n)`, for storing the string as a character array/vector.  
