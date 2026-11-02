# Problem Number - 588A Duff and Meat

**Problem Link:** [https://codeforces.com/problemset/problem/588/A](https://codeforces.com/problemset/problem/588/A)

---

## Topics
- Greedy
- Implementation

## Constraints
- $1 ≤ n ≤ 10^5$ (number of days)
- $1 ≤ a_i ≤ 100$ (meat required on day i)
- $1 ≤ p_i ≤ 100$ (price of meat on day i)
- Time limit per test: 1.0 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Duff needs a certain amount of meat each day, and she can either buy it on that day or store meat bought on previous days.
- To minimize the total cost, we should always buy meat at the **minimum price seen so far** from day 1 up to the current day.
- As we iterate through each day, we update our running minimum price (`minPrice`).
- We then multiply the daily meat requirement (`a`) by this running `minPrice` and add it to our `totalCost`. This guarantees we buy as much meat as needed at the cheapest available historical rate up to that point.

## Time and Space Complexity
- **Time Complexity:** $O(n)$, as we iterate through the `n` days in a single pass.
- **Space Complexity:** $O(1)$, since we only use a few variables to track the running minimum price and total cost.