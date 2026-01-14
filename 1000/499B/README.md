# Problem Number - 499B Lecture  
**Problem Link:** [https://codeforces.com/problemset/problem/499/B](https://codeforces.com/problemset/problem/499/B)  

---

## Topics
- Strings  
- Hashing / Mapping  
- Implementation  

## Constraints
- 1 ≤ `n` ≤ 3000  
- 1 ≤ `m` ≤ 3000  
- `Each word length` ≤ 10  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks to replace each word in a lecture with its shorter synonym if available.  
- We are given `m` pairs of synonyms `(a, b)`. For each pair, we should store the shorter word.  
- While processing the lecture of `n` words:  
  - If a word has a synonym mapping, replace it with the shorter one.  
  - Otherwise, keep the word as it is.  
- Using a hash map allows efficient lookup and replacement.  
- Finally, output the transformed lecture with all words replaced accordingly.  

## Time and Space Complexity
- **Time Complexity:** `O(n + m)`, since we process all synonym pairs and lecture words once.  
- **Space Complexity:** `O(m)`, for storing the synonym mappings in a hash map.  
