# Problem Number - 2172A ASCII Art Contest

**Problem Link:** [https://codeforces.com/problemset/problem/2172/A](https://codeforces.com/problemset/problem/2172/A)

---

## Topics
- Implementation
- Math
- Sorting / Median

## Constraints
- Each score is an integer between 80 and 100 (inclusive).
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem gives three integer scores representing the results of Gemini, ChatGPT, and Claude in the ASCII Art Contest.  
- The organizers want to ensure the judges’ opinions are consistent:
  - If the difference between the maximum and minimum score is **at least 10**, the result is unreliable → print `"check again"`.  
  - Otherwise, the result is consistent → print `"final X"`, where `X` is the **median score** (the middle value when the three scores are sorted).  
- To solve:
  1. Read three integers `a, b, c`.
  2. Compute `max` and `min` of the three.
  3. If `(max - min) >= 10`, output `"check again"`.
  4. Otherwise, compute the median as `(a + b + c - max - min)` and output `"final median"`.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since only a few comparisons and arithmetic operations are performed.  
- **Space Complexity:** `O(1)`, only constant space is used.  
