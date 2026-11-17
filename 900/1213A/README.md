# Problem Number - 1213A Chips Moving
**Problem Link:** [https://codeforces.com/problemset/problem/1213/A](https://codeforces.com/problemset/problem/1213/A)

---

## Topics
- Greedy
- Math
- Implementation

## Constraints
- $1 ≤ n ≤ 100$
- Coordinates can be up to $10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum cost to move all chips to the same integer coordinate on a number line.
- Moving a chip by an even distance (such as 2 units) costs 0, while moving it by an odd distance (such as 1 unit) costs 1.
- Because of this rule, all chips located at even coordinates can be moved to any other even coordinate with a total cost of 0. Similarly, all chips at odd coordinates can be moved to any other odd coordinate with a total cost of 0.
- To bring all chips to a single position, we only need to pay a cost of 1 for each chip in the minority parity group to switch their parity and join the majority group.
- Therefore, the minimum total cost is simply the count of elements with the minority parity, which is given by `min(odd_count, even_count)`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, for iterating through the input elements once to count the number of odd and even coordinates.
- **Space Complexity:** $O(1)$, as only a few variables are used to store the counts.