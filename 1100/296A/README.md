# Problem Number - 296A Yaroslav and Permutations

**Problem Link:** [https://codeforces.com/problemset/problem/296/A](https://codeforces.com/problemset/problem/296/A)

---

## Topics
- Implementation
- Greedy
- Sorting

## Constraints
- $1 \le n \le 100$
- Element values: $1 \le a_i \le 1000$
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem requires determining if an array can be rearranged such that no two adjacent elements are equal.
- This is possible if and only if the frequency of the most frequent element does not exceed $\lfloor(n + 1) / 2\rfloor$. If any element appears more than this limit, it is impossible to separate them without placing duplicates adjacent to each other.
- We count the frequency of each element using a frequency array.
- After counting, we sort or find the maximum frequency and check if the condition `max_frequency <= (n + 1) / 2` holds true ("YES" if it does, "NO" otherwise).

## Time and Space Complexity
- **Time Complexity:** $O(n + K \log K)$ (where $K = 1001$ is the range of values, which acts as a constant, making the effective time complexity $O(n)$).
- **Space Complexity:** $O(K)$ for the frequency array storage (where $K = 1001$), which evaluates to $O(1)$ constant space.