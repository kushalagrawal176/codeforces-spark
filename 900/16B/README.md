# Problem Number - 16B Burglar and Matches

**Problem Link:** [https://codeforces.com/problemset/problem/16/B](https://codeforces.com/problemset/problem/16/B)

---

## Topics
- Greedy
- Sorting
- Implementation

## Constraints
- $1 \le n \le 2 \times 10^8$ (capacity of the knapsack)
- $1 \le m \le 20$ (number of matchboxes containers)
- Time limit per test: 0.5 seconds
- Memory limit per test: 64 megabytes

## Intuition / Approach
- The problem asks us to find the maximum number of matches a burglar can carry away, given a knapsack capacity $n$ and $m$ types of matchboxes, where each type contains a certain number of matchboxes and each box of that type contains a specific number of matches.
- Since we want to maximize the total number of matches, this is a classic **Greedy** problem (similar to the Fractional Knapsack problem, but we take whole containers).
- **Step 1:** Store the matchboxes by their value (matches per box) in descending order so that the containers with the most matches are prioritized.
- **Step 2:** Iterate through the sorted matchbox types. For each type, take as many boxes as possible without exceeding the remaining capacity $n$.
- **Step 3:** Add the matches obtained from the chosen boxes to the total answer and decrease the remaining capacity $n$. Break early if the capacity becomes 0.

## Time and Space Complexity
- **Time Complexity:** $O(m \log m)$ due to sorting the $m$ container types (since $m \le 20$, sorting is negligible).
- **Space Complexity:** $O(m)$ to store the matchbox data entries.