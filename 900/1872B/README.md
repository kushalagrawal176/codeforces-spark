# Problem Number - 1872B The Corridor or There and Back Again

**Problem Link:** [https://codeforces.com/problemset/problem/1872/B](https://codeforces.com/problemset/problem/1872/B)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)
- 1 ≤ `n` ≤ 100 (number of traps)
- 1 ≤ `d` ≤ 200 (room position)
- 1 ≤ `s` ≤ 200 (trap countdown timer)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the maximum room number $k$ we can safely go to and return from without getting trapped.
- For each trap located at room $d$ with countdown timer $s$, once we step on or past room $d$, the trap triggers and starts counting down. We must turn back before it activates.
- The maximum room number we can reach before this specific trap blocks our return is $d + \lfloor \frac{s - 1}{2} \rfloor$.
- Since we must avoid *all* traps along the way, we need to find the minimum threshold across all given traps. 
- Iterating through each trap, we compute the maximum safe limit it imposes and keep track of the minimum value overall.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, where $n$ is the number of traps, for processing all trap inputs in a single pass.
- **Space Complexity:** $O(1)$, as only a few variables are used to maintain the minimum threshold.