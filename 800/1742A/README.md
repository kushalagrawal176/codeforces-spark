# Problem Number - 1742A Sum 

**Problem Link:** [https://codeforces.com/problemset/problem/1742/A](https://codeforces.com/problemset/problem/1742/A)

---

## Topics
- Implementation
- Math
- Brute Force

## Constraints
- 1 ≤ `t` ≤ 9261 (number of test cases)
- 0 ≤ `a`, `b`, `c` ≤ 20 (values of integers)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether any one of the three integers is equal to the sum of the other two.
- For each test case, we are given three integers `a`, `b`, and `c`.
- We simply check the following conditions:
  - `a == b + c`
  - `b == a + c`
  - `c == a + b`
- If any of these conditions hold true, print `"YES"`. Otherwise, print `"NO"`.
- Example:  
  - Input: `a = 3, b = 7, c = 4`  
  - Check: `7 == 3 + 4` → true → Output: `YES`.

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only three checks are performed.  
- **Space Complexity:** `O(1)`, no extra space required.
