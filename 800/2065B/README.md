# Problem Number - 2065B Skibidus and Ohio  
**Problem Link:** [https://codeforces.com/problemset/problem/2065/B](https://codeforces.com/problemset/problem/2065/B)  

---

## Topics  
- Strings  
- Implementation  

## Constraints  
- 1 ≤ `t` ≤ 100  
- 1 ≤ `|s|` ≤ 100   
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks us to determine the minimum possible length of the string when `s[i] = s[i+1]` and replacing `s[i]` with any other character and deleting `s[i+1]`.  
- If all adjacent digits in `s` are different, there will be no deletions, and the resulting length will be equal to `|s|`.  
- However, if there exists at least one pair of consecutive identical character, then deletion will propagate, and the resulting length will collapse to `1`.
- Since, each duplicate character can be replaced by next non-duplicate character and will eventually cause deletion of the characters ultimately reducing length to `1`.  
- Thus, the solution is straightforward:  
  - Initialize `ans = |s|`.  
  - Traverse the string and check if any consecutive characters are equal.  
  - If found, set `ans = 1`.  
  - Print the result.  

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)` per test case, since we scan the string once.  
- **Space Complexity:** `O(1)`, as only a few variables are used.  