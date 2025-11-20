# Problem Number - 1030A In Search of an Easy Problem  
**Problem Link:** [https://codeforces.com/problemset/problem/1030/A](https://codeforces.com/problemset/problem/1030/A)  

---

## Topics
- Implementation
- Brute Force
- Decision Making

## Constraints
- 1 ≤ `n` ≤ 100  
- Each problem difficulty is either 0 (easy) or 1 (hard)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether there exists at least one hard problem among the given list.  
- Input consists of `n` integers, each representing the difficulty of a problem.  
- If any of these integers is `1`, it means there is a hard problem.  
- Approach:
  - Read all `n` integers.  
  - Check if any of them equals `1`.  
  - If yes, output `"HARD"`.  
  - Otherwise, output `"EASY"`.  
- This is a straightforward check requiring only a single pass through the input.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since we iterate through all problems once.  
- **Space Complexity:** `O(1)`, only constant space is used to store the count or flag.  
