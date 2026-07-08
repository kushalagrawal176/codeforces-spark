# Problem Number - 1704B Luke is a Foodie

**Problem Link:** [https://codeforces.com/problemset/problem/1704/B](https://codeforces.com/problemset/problem/1704/B)

---

## Topics
- Greedy
- Implementation
- Math
- Two Pointers

## Constraints
- $1 \le t \le 10^4$ (Number of test cases)
- $1 \le n \le 2 \cdot 10^5$ (Number of food items)
- $1 \le x \le 10^9$ (Maximum absolute difference parameter)
- $1 \le a_i \le 10^9$ (Affinity value of the $i$-th food item)
- Sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum number of times Luke needs to change his integer $v$ so that for every food item $a_i$, the condition $|v - a_i| \le x$ holds. This inequality can be rewritten as a valid range for $v$: $a_i - x \le v \le a_i + x$.
- To minimize the changes to $v$, we should adopt a **greedy strategy**. We track a single continuously overlapping interval $[l, r]$ where $v$ can concurrently satisfy all elements in the current segment.
- For the first element $a_1$, the initial valid range for $v$ is $[a_1 - x, a_1 + x]$.
- For each subsequent element $a_i$, we find the intersection of our current valid range with the new element's range:
  - $l = \max(l, a_i - x)$
  - $r = \min(r, a_i + x)$
- If at any point the intersection becomes invalid ($l > r$), it means no single value of $v$ can satisfy both the previous items in this segment and the current item $a_i$. 
- When this happens, Luke is forced to change $v$. We increment our change counter (`cnt`), and reset our tracking interval $[l, r]$ to the current element's bounds: $[a_i - x, a_i + x]$.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, as we iterate through the array of food items exactly once.
- **Space Complexity:** $\mathcal{O}(1)$ auxiliary space, since we only maintain a few scalar variables (`l`, `r`, `cnt`) to process the elements on the fly.