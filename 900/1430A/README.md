# Problem 1430A - Number of Apartments

**Problem Link:** [https://codeforces.com/problemset/problem/1430/A](https://codeforces.com/problemset/problem/1430/A)

---

## Topics
- Math
- Brute Force
- Implementation

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- $1 \le n \le 1000$ (total number of rooms in the building)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the number of apartments with 3, 5, and 7 rooms such that the total sum of rooms equals $n$, meaning we need to find non-negative integers $x, y, z$ such that $3x + 5y + 7z = n$.
- If $n$ is divisible by 3, we can simply take $n/3$ apartments of size 3.
- Similarly, if $n$ is divisible by 5 or 7, we can take apartments of size 5 or 7 exclusively.
- For other cases, we can check if subtracting 5 or 7 leaves a value that is a multiple of 3. If $(n - 5)$ or $(n - 7)$ is divisible by 3 and positive, we can assign one apartment of size 5 or 7 and divide the remainder among apartments of size 3.
- If none of these conditions are met, it's impossible to form $n$ using combinations of 3, 5, and 7, so we output `-1`.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(1)$ per testcase, since it checks a fixed number of conditions using basic arithmetic.
- **Space Complexity:** $\mathcal{O}(1)$, using only constant extra space.