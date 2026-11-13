# Problem Number - 205A Little Elephant and Rozdil

**Problem Link:** [https://codeforces.com/problemset/problem/205/A](https://codeforces.com/problemset/problem/205/A)

---

## Topics
- Implementation
- Brute Force

## Constraints
- $1 ≤ n ≤ 10⁵$ (Number of cities/travel times)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the city with the minimum travel time to Rozdil.
- We need to process the travel times of all `n` cities in a single pass to maintain an $O(n)$ time complexity.
- As we iterate through each city from index `1` to `n`:
  - If we find a travel time strictly smaller than our current minimum (`min_val`), we update `min_val`, set our city index (`idx`) to the current position, and reset our counter (`cnt`) to `1`.
  - If we find a travel time equal to the current minimum, we increment `cnt`.
- After checking all cities:
  - If `cnt > 1`, it means there are multiple cities with the same minimum travel time, so we output `"Still Rozdil"`.
  - Otherwise, we output the unique city index (`idx`).

## Time and Space Complexity
- **Time Complexity:** $O(n)$, since we iterate through the list of `n` elements exactly once.
- **Space Complexity:** $O(1)$, as we only use a few scalar variables (`min_val`, `idx`, `cnt`) to keep track of the minimum.