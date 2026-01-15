# Problem Number - 766A Mahmoud and Longest Uncommon Subsequence  

**Problem Link:** [https://codeforces.com/problemset/problem/766/A](https://codeforces.com/problemset/problem/766/A)  

---

## Topics  
- Implementation  
- Strings  

## Constraints  
- 1 ≤ `|a|`, `|b|` ≤ 10⁵ (length of each string)  
- Strings consist of lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks for the length of the longest uncommon subsequence between two strings.  
- If the two strings are **equal**, then every subsequence of one string is also a subsequence of the other, meaning there is no uncommon subsequence. In this case, the answer is `-1`.  
- If the two strings are **different**, then the longer string itself is an uncommon subsequence (since it cannot be fully contained in the shorter one).  
- Therefore, the answer is simply the maximum of the lengths of the two strings.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since we only compare the strings and their lengths.  
- **Space Complexity:** `O(1)`, only constant space is used.  
