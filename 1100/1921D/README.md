# Problem Number - 1921D - Very Different Array

**Problem Link:** [https://codeforces.com/problemset/problem/1921/D](https://codeforces.com/problemset/problem/1921/D)

---

## Topics
- Greedy
- Sorting
- Two Pointers
- Math

## Constraints
- $1 \le t \le 100$
- $1 \le n \le m \le 2 \times 10^5$
- $1 \le a_i, b_i \le 10^9$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The goal is to maximize the sum of absolute differences $\sum_{i=1}^{n} |a_i - b_{p_i}|$ by choosing $n$ distinct elements from array $b$ and pairing them with elements from array $a$.
- To maximize the total sum of absolute differences, we want to pair elements that are as far apart as possible on the number line. This means pairing the smallest elements of $a$ with the largest elements of $b$, and vice versa.
- **Step 1:** Sort array $a$ in non-decreasing order and array $b$ in non-decreasing order.
- **Step 2:** Use two pointers for array $a$ (`left_a`, `right_a`) and two pointers for array $b$ (`left_b`, `right_b`) to greedily pick the pair that yields the largest absolute difference.
- **Step 3:** In each of the $n$ iterations, compare two potential pairings:
    1. $|a[left\_a] - b[right\_b]|$ (Smallest of $a$ with Largest of $b$)
    2. $|a[right\_a] - b[left\_b]|$ (Largest of $a$ with Smallest of $b$)
- **Step 4:** Select the pairing that provides the maximum difference, add it to the total, and adjust the respective pointers.

## Time and Space Complexity
- **Time Complexity:** $O(m \log m + n \log n)$, dominated by the sorting of arrays $a$ and $b$. The subsequent greedy selection process takes $O(n)$ time.
- **Space Complexity:** $O(n + m)$ to store the input arrays.