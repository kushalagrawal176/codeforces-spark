# Problem Number - 1005B Delete from the Left  
**Problem Link:** [https://codeforces.com/problemset/problem/1005/B](https://codeforces.com/problemset/problem/1005/B)  

---

## Topics
- Strings  
- Implementation  

## Constraints
- 1 ≤ `|a|`, `|b|` ≤ 2 ⋅ 10⁵  
- Strings consist of lowercase Latin letters  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given two strings `a` and `b`. The task is to find the minimum number of characters to delete from the **left** of both strings so that they become equal.  
- Key observation:  
  - The only way to make them equal is to remove characters until their suffixes match.  
  - Therefore, we need to find the **longest common suffix** of the two strings.  
  - Once found, the answer is simply:  `Answer = |a| + |b| - 2 * (length of common suffix)`  
- Implementation idea:  
  - Start comparing characters from the end of both strings.  
  - Count how many characters match consecutively.  
  - Subtract twice this count from the total length of both strings.  

## Time and Space Complexity
- **Time Complexity:** `O(min(|a|, |b|))`, for comparing suffixes.  
- **Space Complexity:** `O(1)`, only counters used.  