# Problem Number - 978B File Name  
**Problem Link:** [https://codeforces.com/problemset/problem/978/B](https://codeforces.com/problemset/problem/978/B)  

---

## Topics  
- Strings  
- Implementation  

## Constraints  
- 3 ≤ `n` ≤ 100  
- String length = `n`  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem requires us to ensure that the given filename string does not contain the substring `"xxx"`.  
- To achieve this, we need to count how many characters must be removed so that no sequence of three consecutive `'x'` characters remains.  
- Approach:  
  - Traverse the string and keep track of consecutive `'x'` characters.  
  - If the count of consecutive `'x'` exceeds 2, then the excess characters must be removed.  
  - For each segment of consecutive `'x'` characters of length `k`, the number of removals required is `k - 2`.  
  - Sum these removals across the entire string to get the final answer.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we traverse the string once.  
- **Space Complexity:** `O(1)`, as we only use a few counters.  