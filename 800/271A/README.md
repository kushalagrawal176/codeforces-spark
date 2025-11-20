# Problem Number - 271A Beautiful Year  
**Problem Link:** [https://codeforces.com/problemset/problem/271/A](https://codeforces.com/problemset/problem/271/A)  

---

## Topics
- Implementation
- Brute Force
- Strings / Digits

## Constraints
- 1000 ≤ `y` ≤ 9000  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the next year strictly greater than `y` such that all digits are distinct.  
- Starting from `y + 1`, we check each year sequentially.  
- For each year:
  - Convert the year into digits (or a string).  
  - Use a set or map to check if all digits are unique.  
  - If all digits are distinct, that year is the answer.  
- Since the range of years is small (only 4-digit numbers), a brute force approach is efficient enough.  

## Time and Space Complexity
- **Time Complexity:** `O(k × d)`, where `k` is the number of years checked and `d` is the number of digits (constant = 4). In practice, this is very fast.  
- **Space Complexity:** `O(d)`, for storing digits in a set (constant space).  
