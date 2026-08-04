# Problem Number - 1341A Nastya and Rice

**Problem Link:** [https://codeforces.com/problemset/problem/1341/A](https://codeforces.com/problemset/problem/1341/A)

---

## Topics
- Math
- Greedy

## Constraints
- $1 \le t \le 1000$ (number of test cases)
- $1 \le n, a, b, c, d \le 1000$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We have $n$ grains of rice. Each grain weighs between $a - b$ and $a + b$ grams inclusive.
- The total weight of all $n$ grains combined must fall within the range $[c - d, c + d]$.
- The minimum possible total weight for $n$ grains is $n \times (a - b)$, and the maximum possible total weight is $n \times (a + b)$.
- The total weight range given for the package is $[c - d, c + d]$.
- For a valid configuration to exist, the range of possible weights for $n$ grains must overlap with the package's weight range. 
- Overlap fails if the maximum possible weight of $n$ grains is strictly less than the minimum possible package weight ($n \times (a + b) < c - d$), or if the minimum possible weight of $n$ grains is strictly greater than the maximum possible package weight ($n \times (a - b) > c + d$).
- Otherwise, it is possible, and we output "Yes"; otherwise, "No".

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, as it only involves basic arithmetic operations.
- **Space Complexity:** $O(1)$, since only a few variables are used to store the input values.