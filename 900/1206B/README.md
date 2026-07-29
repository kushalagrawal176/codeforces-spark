# Problem Number - 1206B Make Product Equal One

**Problem Link:** [https://codeforces.com/problemset/problem/1206/B](https://codeforces.com/problemset/problem/1206/B)

---

## Topics
- Greedy
- Implementation
- Sortings (or Math)

## Constraints
- 1 ≤ `n` ≤ $10^5$
- $-10^9 \le a_i \le 10^9$
- Time limit per test: 1.0 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The goal is to make the product of all elements equal to $1$ with the minimum number of operations. Each operation allows incrementing or decrementing any number by $1$.
- To minimize the cost for each element:
  - If a number is positive ($a_i > 0$), it is cheapest to convert it to $1$ by subtracting $a_i - 1$.
  - If a number is negative ($a_i < 0$), it is cheapest to convert it to $-1$ by adding $-1 - a_i$.
  - If a number is zero ($a_i = 0$), it takes $1$ operation to change it to either $1$ or $-1$.
- After adjusting all numbers to either $1$ or $-1$, we count how many negative numbers we have:
  - If the count of negative numbers is even, the product is already $1$.
  - If the count of negative numbers is odd, the product is $-1$. If there is at least one zero present, we can change that zero to a $-1$ (or $1$) with $0$ extra net change in operations beyond the initial cost of the zero. If there are **no zeros** available, we must convert one $-1$ to $1$ (or vice versa), which costs an additional $2$ operations.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, since we iterate through the array of size $n$ once.
- **Space Complexity:** $O(1)$, as we only use a few variables for counting and accumulation.