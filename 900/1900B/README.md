# Problem Number - 1900B Laura and Operations

**Problem Link:** [https://codeforces.com/problemset/problem/1900/B](https://codeforces.com/problemset/problem/1900/B)

---

## Topics
- Math
- Number Theory
- Parity / Game Theory

## Constraints
- $1 \le t \le 10^5$ (number of test cases)
- $1 \le a, b, c \le 100$ (or typical constraints for such operations)
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given three types of elements with counts $a$, $b$, and $c$. In one operation, we can choose two different types of elements and decrease their counts by 1 while increasing the count of the third type by 1 (which maintains the parity of the differences between the counts).
- Specifically, an element type can be left alone at the end if and only if the difference between the counts of the other two types is even. 
- For example, to leave only element type 1 (`a`) at the end, the difference between the counts of element type 2 (`b`) and element type 3 (`c`) must be even (`(b - c) % 2 == 0`).
- By checking this parity condition for each of the three choices independently, we can determine whether it's possible to end up with only type 1, only type 2, or only type 3.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(1)$ per test case, as it only involves a few basic arithmetic and modulo operations.
- **Space Complexity:** $\mathcal{O}(1)$, as it only requires a few integer variables to store the inputs and results.