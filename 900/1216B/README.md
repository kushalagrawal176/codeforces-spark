# Problem Number - 1216B Shooting

**Problem Link:** [https://codeforces.com/problemset/problem/1216/B](https://codeforces.com/problemset/problem/1216/B)

---

## Topics
- Greedy
- Sorting

## Constraints
- $1 ≤ n ≤ 1000$
- $1 ≤ a_i ≤ 1000$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find the minimum number of shots required to shoot down all $n$ cans and output the optimal shooting order.
- Each can $i$ has a durability $a_i$. When we shoot a can, it takes $a_i \times (\text{number of previously shot cans}) + 1$ shots to destroy it.
- To minimize the total number of shots, we should use a **greedy approach**: always shoot the cans with the largest durability first. By doing this, cans with higher durability are multiplied by smaller counts of previously shot cans ($0, 1, 2, \dots$).
- First, store the durability values along with their original 1-based indices.
- Sort the cans in descending order based on their durability.
- Iterate through the sorted cans and calculate the total shots using the formula: $\sum_{k=0}^{n-1} (a_{\text{idx}[k]} \times k + 1)$.
- Finally, print the total minimum shots followed by the rearrangement of the original indices.

## Time and Space Complexity
- **Time Complexity:** $O(n \log n)$, due to sorting the cans based on their durability values.
- **Space Complexity:** $O(n)$, to store the array elements and their respective original indices.