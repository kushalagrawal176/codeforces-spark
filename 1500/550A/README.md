# Problem Number - 550A Two Substrings  
**Problem Link:** [https://codeforces.com/problemset/problem/550/A](https://codeforces.com/problemset/problem/550/A)  

---

## Topics
- Strings  
- Implementation  
- Greedy  

## Constraints
- 1 ≤ `|s|` ≤ 10⁵ (length of the string)  
- String consists only of uppercase Latin letters  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to determine if the string contains both substrings `"AB"` and `"BA"` without overlapping.  
- A naive check of `s.contains("AB") && s.contains("BA")` is insufficient because they might overlap (e.g., `"ABA"`).  
- To solve this:  
  1. Search for `"AB"` and then check if `"BA"` exists later in the string (starting at least 2 positions after).  
  2. Similarly, search for `"BA"` first and then check if `"AB"` exists later.  
- If either condition is satisfied, print `"YES"`. Otherwise, print `"NO"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since string searching (`find` or `indexOf`) is linear.  
- **Space Complexity:** `O(1)`, only constant extra space is used.  
