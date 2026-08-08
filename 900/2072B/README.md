# 2072B - Having Been a Treasurer in the Past, I Help Goblins Deceive

**Problem Link:** [https://codeforces.com/problemset/problem/2072/B](https://codeforces.com/problemset/problem/2072/B)

---

## Topics
- Greedy
- Math
- Strings
- Combinatorics

## Constraints
- $1 \le t \le 10^4$
- $1 \le n \le 2 * 10^5$
- Sum of $n$ over all test cases $\le 2 \cdot 10^5$
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires us to maximize the number of occurrences of a specific subsequence pattern (consisting of `"-"` and other characters like `'_'`). 
- Let $a$ be the count of `'-'` characters and $b$ be the count of other characters in the given string.
- To maximize the product of the two parts of dashes forming the subsequence, we should divide the total count of `'-'` ($a$) into two parts as evenly as possible: $\lfloor a / 2 \rfloor$ and $\lceil a / 2 \rceil$.
- Each pair of these dashes can be combined with any of the $b$ other characters positioned in between them.
- Therefore, the total maximum number of valid subsequences is calculated using the formula:
  $$\text{Total} = b \times \lfloor a / 2 \rfloor \times \lceil a / 2 \rceil$$
- We iterate through the string in $O(n)$ time to count frequencies of characters, then compute the result in $O(1)$ time.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case for scanning and counting the characters.
- **Space Complexity:** $O(1)$ auxiliary space (excluding the storage for the input string itself), as only a few counter variables are required.