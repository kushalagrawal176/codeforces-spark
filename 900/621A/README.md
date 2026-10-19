# Problem Number - 621A Wet Shark and Odd and Even

**Problem Link:** [https://codeforces.com/problemset/problem/621/A](https://codeforces.com/problemset/problem/621/A)

---

## Topics
- Greedy
- Math
- Sorting

## Constraints
- $1 \le n \le 10^5$
- $1 \le a_i \le 10^9$
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the maximum possible even sum of a subset of the given numbers.
- We can start by taking the sum of all the elements in the array.
- The sum of an even number of odd numbers is even, and the sum of an odd number of odd numbers is odd. (Even numbers added to the sum never change its parity).
- Therefore, if the total count of odd numbers is even, the total sum of all elements will already be even, and we can include all of them.
- If the total count of odd numbers is odd, the total sum will be odd. To make it the maximum possible even sum, we must exclude the smallest odd number from our sum.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, since we iterate through the array of size $n$ once.
- **Space Complexity:** $O(1)$, as we only use a few variables for tracking the sum, count of odd numbers, and the minimum odd number.