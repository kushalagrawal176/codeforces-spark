# Problem Number - 1682B AND Sorting

**Problem Link:** [https://codeforces.com/problemset/problem/1682/B](https://codeforces.com/problemset/problem/1682/B)

---

## Topics
- Bitmasks
- Greedy
- Sortings

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $2 \le n \le 2 \cdot 10^5$ (size of the array)
- Time limit per test: 1 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the maximum possible value of a mask $X$ such that we can sort the given permutation by repeatedly choosing any two indices and swapping them, provided that the bitwise AND of the elements at those positions (or all chosen positions throughout the process) equals $X$, or more simply, we want to find the bitwise AND of all elements that are currently out of place ($a_i \neq i$).
- When an element $a_i$ is not in its correct sorted position ($a_i \neq i$), it must participate in swaps to reach its sorted position. 
- The bitwise operation allowed is AND, which means any bit that is $0$ in the chosen elements will remain $0$ after the operation. Therefore, any value $X$ we pick must be a submask of all elements that are out of place.
- To maximize $X$, we take the bitwise AND of all elements $a_i$ where $a_i \neq i$.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, since we iterate through the array of size $n$ once.
- **Space Complexity:** $O(1)$, as we only use a few variables for accumulation.