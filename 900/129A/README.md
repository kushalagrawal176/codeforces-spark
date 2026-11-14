# Problem Number - 129A Cookies

**Problem Link:** [https://codeforces.com/problemset/problem/129/A](https://codeforces.com/problemset/problem/129/A)

---

## Topics
- Brute Force
- Implementation
- Number Theory
- Math

## Constraints
- $1 ≤ n ≤ 100$ (Number of bags)
- $1 ≤ a_i ≤ 100$ (Number of cookies in each bag)
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the number of ways to choose a single bag of cookies such that if we remove it, the total sum of the remaining cookies in all bags is **even**.
- First, we calculate the `totalSum` of all cookies across all bags.
- If we remove a bag containing `a[i]` cookies, the new sum becomes `totalSum - a[i]`.
- Mathematically, for the remaining sum to be even, `totalSum - a[i]` must be even. This happens if and only if `totalSum` and `a[i]` have the same parity (i.e., both are even or both are odd), because subtracting two numbers of the same parity results in an even number.
- Thus, we simply iterate through all the bags and count how many bags have a cookie count with the same parity as `totalSum`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, since we iterate through the array twice: once to read the input and compute the sum, and once to count the valid bags.
- **Space Complexity:** $O(n)$ to store the array of cookie counts (which can also be optimized to $O(1)$ if we process on the fly).