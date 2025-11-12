# Problem Number - 4A Watermelon

**Problem Link:** [https://codeforces.com/problemset/problem/4/A](https://codeforces.com/problemset/problem/4/A)

---

## Topics
- Implementation
- Math
- Conditional Statements

## Constraints
- 1 ≤ w ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether a watermelon of weight `w` kilograms can be split into two parts such that:
  - Each part has an **even weight**.
  - Both parts are **positive integers**.
- Key observation:
  - Any even number greater than 2 can be split into two even positive integers.
  - Example: 8 → 4 + 4, 10 → 2 + 8.
  - If `w` is odd, or if `w = 2`, it is **not possible**.
- Therefore, the solution boils down to checking:
  - If `w % 2 == 0` and `w > 2`, print `"YES"`.
  - Otherwise, print `"NO"`.

## Time and Space Complexity
- **Time Complexity:** O(1), only a single condition check.  
- **Space Complexity:** O(1), no extra memory used.  
