# Problem Number - 1370B GCD Compression

**Problem Link:** [https://codeforces.com/problemset/problem/1370/B](https://codeforces.com/problemset/problem/1370/B)

---

## Topics
- Number Theory
- Greedy
- Math

## Constraints
- $1 \le t \le 10$ (Number of test cases)
- $2 \le n \le 1000$ (size of final array)
- $1 \le a_i \le 1000$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array of $2n$ integers and need to select $n-1$ pairs of elements such that the sum of the greatest common divisor (GCD) of all chosen pairs is maximized or at least strictly greater than 1 (which means the sum of each chosen pair must be even). 
- An even sum can be formed by adding either two even numbers or two odd numbers.
- We can separate the indices of the given elements into two lists: one for even numbers and one for odd numbers.
- We then pair up elements from the odd list and elements from the even list in pairs of two. Since we need $n-1$ pairs, we ensure that we always pick a total of $2n - 2$ elements (leaving exactly 2 elements out).
- If the count of odd numbers is odd, we will have one leftover odd and one leftover even, which we simply ignore since we discard two elements anyway.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, as we iterate through the array to classify numbers into odd and even lists and then pair them up.
- **Space Complexity:** $O(n)$ to store the indices of the odd and even numbers.