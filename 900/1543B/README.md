# Problem Number - 1543B Customising the Track

**Problem Link:** [https://codeforces.com/problemset/problem/1543/B](https://codeforces.com/problemset/problem/1543/B)

---

## Topics
- Math
- Greedy
- Number Theory

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n \le 2 \cdot 10^5$
- $0 \le a_i \le 10^9$
- Sum of $n$ over all test cases does not exceed $2 \cdot 10^5$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given an array of $n$ elements representing the number of cars on each track. We can move cars between tracks to minimize the "inconvenience" (sum of absolute differences between all pairs of tracks).
- To minimize the inconvenience, we want the number of cars on each track to be as close to each other as possible. Specifically, the total sum of cars $S$ can be distributed such that $S \pmod n$ tracks have $\lfloor S/n \rfloor + 1$ cars, and the remaining $n - (S \pmod n)$ tracks have $\lfloor S/n \rfloor$ cars.
- Let $k = S \pmod n$ be the remainder. These $k$ extra cars must be distributed to $k$ different tracks. 
- Each of these $k$ tracks will differ by $1$ car from the remaining $n - k$ tracks. Each of the $k$ tracks paired with each of the $n - k$ tracks will contribute $1$ to the total inconvenience sum.
- Therefore, the total minimum inconvenience is given by $k \times (n - k)$, where $k = (\sum a_i) \pmod n$.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, to read the input and compute the sum of elements.
- **Space Complexity:** $O(1)$, since we can process each element on the fly without storing the entire array.