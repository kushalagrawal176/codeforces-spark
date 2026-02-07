# Problem Number - 2188B Seats

**Problem Link:** [https://codeforces.com/problemset/problem/2188/B](https://codeforces.com/problemset/problem/2188/B)

---

## Topics
- Greedy
- Implementation
- Strings

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 ⋅ 10⁵ (length of the string per test case)  
- String consists only of characters `'0'` and `'1'`  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem is about counting the maximum number of people that can be seated given a binary string representation of seats:
  - `'1'` means the seat is already occupied.
  - `'0'` means the seat is empty.
- The rule is that no three consecutive empty seats can remain unused — they can be filled optimally.
- Approach:
  1. Traverse the string while tracking consecutive empty seats (`zero` counter).
  2. Each time we encounter an occupied seat (`'1'`), we:
     - Count it directly.
     - Add `zero / 3` to account for groups of three empty seats before it.
     - Reset the `zero` counter.
  3. After finishing the string, add one more to `zero` (to handle trailing empty seats) and again add `zero / 3`.
- This greedy counting ensures we maximize the number of people seated by grouping empty seats optimally.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the string once.  
- **Space Complexity:** `O(1)`, only constant extra space used for counters.  
