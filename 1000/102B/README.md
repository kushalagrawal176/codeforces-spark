# Problem Number - 102B Sum of Digits

**Problem Link:** [https://codeforces.com/problemset/problem/102/B](https://codeforces.com/problemset/problem/102/B)

---

## Topics
- Implementation
- Strings

## Constraints
- The input number $n$ can contain up to $100,000$ digits.
- Time limit per test: 2 seconds
- Memory limit per test: 265 megabytes

## Intuition / Approach
- The problem asks us to find how many times we need to replace a number with the sum of its digits until the number becomes a single digit.
- Since the initial number can have up to $100,000$ digits, it cannot fit into standard integer types (`int`, `long long`, etc.). Therefore, we must read the initial input as a **String**.
- If the length of the string is already 1, the process takes `0` steps.
- Otherwise, we enter a loop where we compute the sum of the digits by converting each character to its numerical value (`s[i] - '0'`). 
- After computing the sum, we convert it back into a string and increment our step counter.
- Even for the largest possible input ($100,000$ nines), the sum of the digits in the first step will be at most $900,000$. This dramatically shrinks the number size, ensuring that subsequent iterations will run almost instantly.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(L)$, where $L$ is the number of digits in the initial string. The first iteration takes $\mathcal{O}(L)$ time to sum the digits, while all subsequent iterations take negligible time ($\mathcal{O}(\log L)$) because the number reduces drastically after the first pass.
- **Space Complexity:** $\mathcal{O}(L)$ to store the initial input string.