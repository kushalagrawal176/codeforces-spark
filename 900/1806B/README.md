# Problem Number - 1806B Mex Master

**Problem Link:** [https://codeforces.com/problemset/problem/1806/B](https://codeforces.com/problemset/problem/1806/B)

---

## Topics
- Greedy
- Constructive Algorithms
- Sortings

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n \le 2 \cdot 10^5$ (sum of $n$ over all test cases does not exceed $2 \cdot 10^5$)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the minimum possible value of the MEX (minimum excluded) of the array after reordering its elements.
- **Case 0:** If the number of zeros (`count0`) is less than or equal to $\lfloor \frac{n + 1}{2} \rfloor$ (i.e., `count0 <= (n - count0) + 1`), we can interleave zeros with other elements such that no two zeros are adjacent and the maximum MEX we are forced to produce is `0`. Thus, the answer is `0`.
- **Case 1:** If zeros are too frequent to avoid being adjacent (`count0 > (n - count0) + 1`), a MEX of `0` is unavoidable if any zeros exist. However, if there are no ones (`count1 == 0`) or if there is at least one element greater than `1` (`n - count0 - count1 >= 1`), we can arrange the elements so that the MEX becomes `1`.
- **Case 2:** If we cannot achieve `0` or `1` (which happens when all non-zero elements are strictly `1`, and zeros are too frequent), the minimum possible MEX we can get is `2`.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, for counting occurrences of elements.
- **Space Complexity:** $\mathcal{O}(1)$ or $\mathcal{O}(n)$ depending on whether elements are stored in an array or processed on the fly.