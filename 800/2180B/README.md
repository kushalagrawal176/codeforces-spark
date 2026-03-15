# Problem Number - 2180B Ashmal

**Problem Link:** [https://codeforces.com/problemset/problem/2180/B](https://codeforces.com/problemset/problem/2180/B)

---

## Topics
- Strings
- Greedy
- Implementation

## Constraints
- 1 ≤ `t` ≤ 500 (number of test cases)
- 1 ≤ `n` ≤ 1000 (number of strings in each test case)
- 1 ≤ `|ai|` ≤ 4000 (length of each string)
- Sum of `n` across all test cases ≤ 1000
- Total length of all strings across all test cases ≤ 4000
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- You are given an array of strings and must construct a final string `s` by sequentially adding each string either to the **beginning** or the **end** of `s`.
- The goal is to obtain the **lexicographically smallest string** possible after all insertions.
- At each step, when deciding where to place the next string `ai`, compare:
  - `s + ai` (placing at the end)
  - `ai + s` (placing at the beginning)
- Choose the option that results in the lexicographically smaller string.
- This greedy approach works because lexicographic order is determined by the earliest differing character, so local optimal choices ensure global optimality.

## Time and Space Complexity
- **Time Complexity:**  
  - Each step involves string concatenation and comparison.  
  - Since the total length of all strings across all test cases ≤ 4000, the overall complexity is **O(total length)**, which is efficient.
- **Space Complexity:**  
  - **O(total length)**, as we store and build the final string.