# Problem Number 2200C - Specialty String

**Problem Link:** [https://codeforces.com/problemset/problem/2200/C](https://codeforces.com/problemset/problem/2200/C)

---

## Topics
- Data Structures
- Stack
- Strings
- Implementation

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $1 \le n \le 5000$ (length of string)
- Sum of $n$ over all test cases does not exceed 5000.
- Time limit per test: 2.0 seconds.
- Memory limit per test: 256 megabytes.

## Intuition / Approach
- The problem requires processing a string where adjacent identical characters can interact or cancel out.
- A stack data structure is ideal for this pattern because it allows us to keep track of preceding characters and efficiently handle adjacent eliminations.
- We iterate through each character of the string:
  - If the stack is not empty and the top element equals the current character, we pop from the stack.
  - Otherwise, we push the current character onto the stack.
- Finally, checking if the stack is empty determines whether the full reduction was successful.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, where $n$ is the length of the string, since each character is pushed and popped from the stack at most once.
- **Space Complexity:** $O(n)$ in the worst case to store characters in the stack.