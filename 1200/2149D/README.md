# Problem Number - 2149D A and B  
**Problem Link:** [https://codeforces.com/problemset/problem/2149/D](https://codeforces.com/problemset/problem/2149/D)  

---

## Topics
- Greedy  
- Implementation  
- String Manipulation  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2·10⁵ (length of string per test case)  
- Total sum of `n` across all test cases ≤ 2·10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to transform a given string `s` of length `n` consisting of characters `'a'` and `'b'` into a "good" string with the minimum number of moves.  
- A string is considered "good" if all occurrences of one character are grouped together (all `'a'`s followed by all `'b'`s, or vice versa).  
- The task is to compute the minimum number of moves required to achieve this grouping.  

### Key Idea:
- For each character (`'a'` and `'b'`), collect the indices where it appears.  
- To minimize moves, align these indices around the median position of the group.  
- This works because the median minimizes the sum of absolute differences.  
- Compute the cost for grouping `'a'`s together and for grouping `'b'`s together.  
- The answer is the minimum of these two costs.  

### Steps:
1. For each test case, read `n` and the string `s`.  
2. Use a helper function `solve(s, c)` to compute the cost of grouping all occurrences of character `c`.  
   - Collect indices of `c`.  
   - If none exist, cost is `0`.  
   - Otherwise, align them around the median index and compute total moves.  
3. Return `min(solve(s, 'a'), solve(s, 'b'))`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string and compute costs.  
- **Space Complexity:** `O(n)`, for storing indices of one character.  