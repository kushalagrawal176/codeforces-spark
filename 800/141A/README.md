# Problem Number - 141A Amusing Joke

**Problem Link:** [https://codeforces.com/problemset/problem/141/A](https://codeforces.com/problemset/problem/141/A)

---

## Topics
- Strings
- Implementation
- Hashing / Frequency Counting

## Constraints
- `Length of each string` ≤ 100
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem gives three strings:  
  - `a` → name of the guest  
  - `b` → name of the host  
  - `c` → pile of letters on the table  
- We need to check if the pile of letters `c` is exactly the combination of letters from `a` and `b` (with no extra or missing letters).
- Approach:
  1. Count the frequency of each character in `a` and `b` combined.
  2. Subtract the frequency of each character in `c`.
  3. If all counts reduce to zero, then `c` is a valid rearrangement → print `"YES"`.
  4. Otherwise, print `"NO"`.
- Example:  
  - Input: `a = "ABC"`, `b = "DEF"`, `c = "FEDCBA"`  
  - Combined letters = `"ABCDEF"`  
  - Pile letters = `"FEDCBA"` → same letters, just rearranged → Output: `YES`.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, where `n` is the length of the strings (at most 200).  
- **Space Complexity:** `O(26) = O(1)`, since we only store character counts (constant size for 26 letters).
