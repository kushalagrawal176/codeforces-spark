# Problem Number - 1907B YetnotherrokenKeoard  
**Problem Link:** [https://codeforces.com/problemset/problem/1907/B](https://codeforces.com/problemset/problem/1907/B)  

---

## Topics
- Implementation
- String Manipulation
- Stacks

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem simulates typing on a broken keyboard where:
  - Pressing `'b'` deletes the most recent lowercase letter.
  - Pressing `'B'` deletes the most recent uppercase letter.
- To handle this efficiently:
  - Maintain two stacks (or lists) to track indices of lowercase and uppercase letters.
  - When encountering `'b'` or `'B'`, pop from the respective stack and mark that character as deleted.
  - Otherwise, push the index of the character into the appropriate stack.
- After processing the string, rebuild the answer by skipping all `'b'` and `'B'` characters and any deleted positions.
- This ensures the correct simulation of the keyboard behavior.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since each character is processed once.  
- **Space Complexity:** `O(n)`, for storing indices in stacks and building the final answer.  
