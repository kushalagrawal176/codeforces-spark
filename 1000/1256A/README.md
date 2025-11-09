# Problem Number - 1256A Payment Without Change  
**Problem Link:** [https://codeforces.com/problemset/problem/1256/A](https://codeforces.com/problemset/problem/1256/A)

---

## Topics

- Greedy  
- Math  
- Implementation

## Constraints

- 1 ≤ t ≤ 10000  
- 1 ≤ a, b ≤ 10⁹  
- 1 ≤ n ≤ 10⁹  
- 1 ≤ s ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes

## Intuition / Approach

- The problem asks whether it's possible to pay exactly `s` units using `a` coins of denomination `n` and `b` coins of denomination `1`.
- The greedy approach is to use as many `n`-denomination coins as possible without exceeding `s`, and then check if the remaining amount can be covered by `b` coins of denomination `1`.
- Let `max_n_coins = min(a, s / n)` be the maximum number of `n`-coins we can use.
- The remaining amount to be paid is `s - max_n_coins * n`.
- If this remainder is less than or equal to `b`, then the payment is possible.
- Alternatively, the condition can be simplified to:  
    `s % n <= b && a * n + b >= s`

## Time and Space Complexity

- **Time Complexity:**  O(1), constant time per test case.
- **Space Complexity:** O(1), no extra space used.
