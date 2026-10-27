# Problem Number - 2062B Clockwork

**Problem Link:** [https://codeforces.com/problemset/problem/2062/B](https://codeforces.com/problemset/problem/2062/B)

---

## Topics
- Greedy
- Math
- Implementation

## Constraints
- $1 \le t \le 10^4$ (Number of test cases)
- $2 \le n \le 5 \cdot 10^5$ (Length of the array / number of time clocks)
- $1 \le a_i \le 10^9$ (Values in the clock array)
- Sum of $n$ over all test cases does not exceed $5 \cdot 10^5$.
- Time limit per test: 1.5 seconds
- Memory limit per test: 512 megabytes

## Intuition / Approach
- The problem asks whether it's possible to process/decrement elements of an array under a clockwork rule where each element at index $i$ (0-indexed) decreases by 1 every second, and we can choose any element to reset its value to $a_i$ at each step, while any element reaching $\le 0$ causes failure.
- For an element at index $i$ to never hit 0 or below before we can visit/reset it, its initial value $a_i$ must be strictly greater than the maximum time interval it could be left unattended.
- The maximum distance from index $i$ to either end of the array dictates how long it can go without being visited. Specifically, the worst-case time interval for index $i$ is $\max(2 \times i, 2 \times (n - i - 1))$.
- Therefore, for each element $i$, we check if $a_i > \max(2 \times i, 2 \times (n - i - 1))$. If this holds for all indices, the answer is **YES**; otherwise, it is **NO**.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, as we iterate through the array once to evaluate the condition.
- **Space Complexity:** $\mathcal{O}(1)$ auxiliary space, since we process each element on the fly without storing the entire array.