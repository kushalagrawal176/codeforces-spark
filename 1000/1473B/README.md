# Problem Number - 1473B String LCM  

**Problem Link:** [https://codeforces.com/problemset/problem/1473/B](https://codeforces.com/problemset/problem/1473/B)  

---

## Topics  
- Implementation  
- Strings  
- Math
- Number Theory
- Least Common Multiple (LCM)  

## Constraints  
- 1 ≤ `q` ≤ 2000 (number of test cases)  
- 1 ≤ `|s|`, `|t|` ≤ 20 (length of strings)  
- Strings consist of lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to find the smallest string that can be formed by repeating both given strings such that they become equal.  
- This is essentially the **LCM of two strings**, where the length of the resulting string is the least common multiple of the lengths of the two input strings.  
- Steps:  
  1. Compute the LCM of the lengths of strings `a` and `b`.  
  2. Repeat string `a` until its length equals the LCM.  
  3. Repeat string `b` until its length equals the LCM.  
  4. If the two expanded strings are equal, print the result. Otherwise, print `-1`.  
- This ensures we check the minimal common multiple repetition of both strings.  

## Time and Space Complexity  
- **Time Complexity:** `O(lcm(|a|, |b|))`, since we expand both strings to their LCM length.  
- **Space Complexity:** `O(lcm(|a|, |b|))`, for storing the expanded strings.  
