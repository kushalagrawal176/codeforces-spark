# Problem Number - 1108B Divisors of Two Integers

**Problem Link:** [https://codeforces.com/problemset/problem/1108/B](https://codeforces.com/problemset/problem/1108/B)

---

## Topics
- Implementation
- Number Theory
- Sorting
- Math

## Constraints
- $2 ≤ n ≤ 128$ (Length of the divisor array)
- Elements of the array are divisors of either $x$ or $y$ (where $1 \le x, y \le 10^4$)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given a list of divisors belonging to two unknown integers, $x$ and $y$. 
- The largest element in the given list must be the maximum of the two original integers, let's call it $x$ (i.e., $x = \max(d)$).
- Once we identify $x$, we know all of its divisors. The remaining divisors in the input list must belong to the second integer $y$.
- To find $y$, we can sort the input array in ascending order. The largest element in the array is $x$. The second integer $y$ will be the largest number that either appears as a duplicate (if $x = y$) or does not cleanly divide $x$.
- By iterating backward from the largest element, the first number that violates the divisor property of $x$ (or is a duplicate of $x$) gives us $y$.

## Time and Space Complexity
- **Time Complexity:** $O(n \log n)$ due to sorting the array of size $n$, followed by an $O(n)$ linear scan.
- **Space Complexity:** $O(n)$ to store the elements of the divisor list.