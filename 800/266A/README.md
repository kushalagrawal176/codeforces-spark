# Problem Number - 266A Stones on the Table  

**Problem Link:** [https://codeforces.com/problemset/problem/266/A](https://codeforces.com/problemset/problem/266/A)  

---

## Topics
- Implementation  
- Strings  
- Greedy  

---

## Constraints
- 1 ≤ `n` ≤ 50  
- String length = n  
- Characters are only `R`, `G`, or `B`  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- We are given a sequence of stones represented by a string of length `n`.  
- The goal is to remove the minimum number of stones so that no two adjacent stones have the same color.  
- To achieve this, we simply need to count the number of adjacent stones that are equal.  
- Each time two consecutive stones have the same color, one of them must be removed.  
- Therefore, the answer is the total count of adjacent duplicates in the string.  

### Approach:
- Initialize a counter `cnt = 0`.  
- Traverse the string from left to right.  
- For each position, if the current stone is the same as the next stone, increment `cnt`.  
- At the end, `cnt` will represent the minimum number of stones to remove.  

---

## Time and Space Complexity
- **Time Complexity:** O(n), since we traverse the string once.  
- **Space Complexity:** O(1), only a counter variable is used.  
