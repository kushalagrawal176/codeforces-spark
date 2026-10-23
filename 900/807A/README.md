# Problem 807A - Is it rated?

**Problem Link:** [https://codeforces.com/problemset/problem/807/A](https://codeforces.com/problemset/problem/807/A)

---

## Topics
- Implementation
- Sorting

## Constraints
- $2 \le n \le 1000$ (number of participants)
- $1 \le x_i, y_i \le 4126$ (ratings before and after)
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to determine whether a Codeforces round was **rated**, **unrated**, or **maybe**.
- **Rated:** If any participant's rating changes after the contest ($x_i \neq y_i$), it's definitely `"rated"`.
- **Unrated:** If all ratings remain the same ($x_i = y_i$ for all participants), but the participants' initial ratings were not given in non-increasing order (i.e., someone with a strictly lower initial rating appeared before someone with a higher initial rating), then it's definitely `"unrated"`.
- **Maybe:** If all initial ratings are in non-increasing order and no one's rating changed, we cannot be sure, so output `"maybe"`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, since we process each of the $n$ participants once.
- **Space Complexity:** $O(1)$, as we only store a few variables for tracking states and the previous participant's rating.