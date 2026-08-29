# Problem Number - 1997C Even Positions

**Problem Link:** [https://codeforces.com/problemset/problem/1997/C](https://codeforces.com/problemset/problem/1997/C)

---

## Topics
- Greedy
- Data Structures (Stack)
- Strings

## Constraints
- $1 \le t \le 5000$ (number of test cases)
- $2 \le n \le 2 \cdot 10^5$ (length of the string, guaranteed to be even)
- The sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given a bracket sequence of length $n$ where characters at odd indices (1-based) are fixed to either `(` or `)`, and characters at even indices are always `_` (which can be replaced by either `(` or `)`). 
- Since valid bracket sequences must have an equal number of opening and closing brackets and the first element of any valid prefix can never be a closing bracket without an opening counterpart, we can use a stack-based greedy approach.
- As we iterate through the string from left to right:
  - If we encounter an opening bracket `(`, we push its index onto the stack.
  - If we encounter an underscore `_`:
    - If the stack is not empty, it means there is an unmatched opening bracket waiting to be closed. To minimize the cost and maintain validity, we should greedily close it using `)` and add the distance `i - top_index` to our total cost.
    - If the stack is empty, we must place an opening bracket `(` to ensure validity, and push its index onto the stack.
  - If we encounter a closing bracket `)`, we pop the latest unmatched opening bracket from the stack and add the distance to the total cost.
- Using `long long` for the cost accumulator prevents any potential integer overflow since the maximum cost can exceed standard 32-bit integer limits.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, as we iterate through the string of length $n$ once, and stack operations take $\mathcal{O}(1)$ time on average.
- **Space Complexity:** $\mathcal{O}(n)$ in the worst case for storing the stack elements and the input string.