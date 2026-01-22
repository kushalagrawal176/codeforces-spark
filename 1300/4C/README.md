# Problem Number - 4C Registration System  

**Problem Link:** [https://codeforces.com/problemset/problem/4/C](https://codeforces.com/problemset/problem/4/C)  

---

## Topics  
- Implementation  
- Hashing  
- Strings  
- Maps  

## Constraints  
- 1 ≤ `n` ≤ 10^5  
- Each username length ≤ 32  
- Time limit per test: 5 seconds  
- Memory limit per test: 64 megabytes  

## Intuition / Approach  
- The system must register usernames.  
- If a username is new, print `"OK"`.  
- If a username already exists, append the smallest integer suffix that makes it unique.  
- To efficiently track occurrences, use a hash map (`unordered_map` in C++ or `HashMap` in Java).  
- Each time a username `s` is read:  
  - Increase its count in the map.  
  - If count is 1 → print `"OK"`.  
  - If count > 1 → print `s + (count - 1)`.  
- This ensures uniqueness while maintaining O(1) average lookup and update time.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since each of the `n` usernames is processed in constant average time using hashing.  
- **Space Complexity:** `O(n)`, for storing usernames and their counts in the hash map.  
