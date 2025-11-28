# Problem Number - 1985A Creating Words  

**Problem Link:** [https://codeforces.com/problemset/problem/1985/A](https://codeforces.com/problemset/problem/1985/A)  

---

## Topics  
- Implementation  
- Strings  

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- Strings consist of lowercase English letters  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is simple: given two strings `a` and `b`, swap their first characters.  
- After swapping, print the modified strings.  
- Steps:  
  1. Read the number of test cases `t`.  
  2. For each test case, read two strings `a` and `b`.  
  3. Swap the first character of `a` with the first character of `b`.  
  4. Print the updated strings.  
- Only the first characters are swapped; the rest of the string remains unchanged.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, for each test case, since each test case requires constant time operations.  
- **Space Complexity:** `O(1)`, only a few variables are used regardless of input size.  
