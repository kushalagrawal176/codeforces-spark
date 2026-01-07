# Problem Number - 320A Magic Numbers  
**Problem Link:** [https://codeforces.com/problemset/problem/320/A](https://codeforces.com/problemset/problem/320/A)  

---

## Topics
- Strings  
- Implementation  
- Pattern Matching  

## Constraints
- 1 ≤ `n` ≤ 10⁹ (the given number)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- A number is called *magic* if it can be represented using only the digits `1`, `14`, and `144`.  
- The problem asks us to check whether the given number can be fully decomposed into these valid segments.  
- Approach:  
  1. Start from the least significant digit and repeatedly check if the suffix is `1`, `14`, or `144`.  
  2. If a match is found, strip off that part and continue.  
  3. If no valid suffix matches, the number is not magic.  
  4. If the entire number can be decomposed successfully, output `"YES"`, otherwise `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(log n)`, since we repeatedly divide the number by 10, 100, or 1000.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
