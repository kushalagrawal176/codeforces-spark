# Problem Number - 443A Anton and Letters  
**Problem Link:** [http://codeforces.com/problemset/problem/443/A](http://codeforces.com/problemset/problem/443/A)  

---

## Topics
- Implementation
- Strings
- Sets

## Constraints
- Input length ≤ 1000 characters  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives a set of lowercase English letters enclosed in curly braces `{}` and separated by commas.  
- We need to determine how many **distinct letters** are present in the set.  
- Approach:
  1. Read the entire input string.  
  2. Ignore characters like `{`, `}`, `,`, and spaces.  
  3. Insert each valid letter into a data structure that ensures uniqueness (e.g., a set).  
  4. The size of the set at the end gives the number of distinct letters.  
- This works because sets automatically handle duplicates, and the problem only asks for the count of unique letters.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, where `n` is the length of the input string (each character checked once).  
- **Space Complexity:** `O(1)`, since at most 26 distinct lowercase letters can be stored.
