# Problem Number - 1881B Three Threadlets

**Problem Link:** [https://codeforces.com/problemset/problem/1881/B](https://codeforces.com/problemset/problem/1881/B)

---

## Topics
- Math
- Greedy
- Sorting

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le a, b, c \le 10^9$ (lengths of the threadlets)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether we can make three threadlets of equal length by performing at most 3 operations. In one operation, we can cut a threadlet into two parts with positive lengths.
- First, let's sort the three threadlet lengths such that $a \le b \le c$. 
- The smallest threadlet $a$ must be the base length for all final threadlets because we can only decrease lengths by cutting, and any cut we make from $a$ would make pieces even smaller than $a$.
- Therefore, $b$ must be a multiple of $a$ (i.e., $b \% a == 0$) and $c$ must be a multiple of $a$ (i.e., $c \% a == 0$). If not, it's impossible, and we output `NO`.
- Next, we check how many cuts are required:
  - To turn $b$ into parts of length $a$, we need $(b / a) - 1$ cuts.
  - To turn $c$ into parts of length $a$, we need $(c / a) - 1$ cuts.
- The total number of cuts is $(b / a - 1) + (c / a - 1)$. If this total number of cuts is $\le 3$, we output `YES`; otherwise, `NO`.
- There is also a trivial case where all three threadlets are already equal ($a = b = c$), which requires $0$ cuts and is naturally handled since $(a/a - 1) + (a/a - 1) = 0 \le 3$.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, as it only involves sorting 3 elements and basic arithmetic operations.
- **Space Complexity:** $O(1)$, since only a few variables are used.