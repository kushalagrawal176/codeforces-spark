# Problem Number - 339A Helpful Maths

**Problem Link:** [https://codeforces.com/problemset/problem/339/A](https://codeforces.com/problemset/problem/339/A)

---

## Topics
- Strings
- Sorting
- Implementation

## Constraints
- Input string length: 1 ≤ |s| ≤ 100
- String consists of digits `1`, `2`, `3` separated by `'+'`
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to rearrange the digits `1`, `2`, and `3` in non-decreasing order while keeping `'+'` signs between them.
- First, extract all digits from the input string (ignore `'+'`).
- Sort the digits in ascending order.
- We can even count occurances of `1`, `2`, `3` in the string and replace accordingly in the string as - first all `1` followed by all `2` then followed by all `3`.
- Reconstruct the string by joining the sorted digits with `'+'`.
- Example:  
  Input: `"3+2+1"`  
  Digits: `[3, 2, 1]` → Sorted: `[1, 2, 3]` → Output: `"1+2+3"`

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the digits (where n is the number of digits).  
  Since n ≤ 100, this is very efficient. `O(n)`, for counting occurances of `1`, `2`, `3`
- **Space Complexity:** `O(n)`, for storing the digits before reconstruction.