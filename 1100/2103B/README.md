# Problem Number - 2103B Binary Typewriter

**Problem Link:** [https://codeforces.com/problemset/problem/2103/B](https://codeforces.com/problemset/problem/2103/B)

---

## Topics
- Strings
- Greedy
- Implementation

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 2 × 10⁵ (length of binary string)
- Sum of `n` across all test cases ≤ 2 × 10⁵
- Time limit per test: 1.5 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- You are given a binary string `s` and a typewriter with two buttons: `0` and `1`. Initially, your finger is on button `0`.
- Operations allowed:
  1. Press the current button (types the character).
  2. Move your finger to the other button.
- The **cost** of typing a string is the minimum number of operations required.
- You may reverse **at most one substring** of `s` before typing to minimize the cost.

### Key Observations:
- Typing without reversal:  
  - Cost = `n` (press each character) + number of transitions between consecutive different characters.  
  - If the string starts with `1`, you need an extra move at the beginning.
- Reversing a substring can reduce the number of transitions:
  - If there are **exactly 2 transitions**, reversal can reduce them to `1`.
  - If there are **more than 2 transitions**, reversal can reduce them by `2`.
- Thus, the formula becomes:  
  **Cost = n + adjusted transitions**,  
  where transitions are reduced based on reversal rules.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the string once to count transitions.  
- **Space Complexity:** `O(1)`, only a few counters are used.