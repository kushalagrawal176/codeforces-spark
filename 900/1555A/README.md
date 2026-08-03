# Problem Number - 1555A PizzaForces

**Problem Link:** [https://codeforces.com/problemset/problem/1555/A](https://codeforces.com/problemset/problem/1555/A)

---

## Topics
- Math
- Greedy
- Brute Force

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n \le 10^{16}$ (number of pizza slices needed)
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks for the minimum time required to bake at least $n$ pizza slices, given that pizzas come in sizes of 6, 8, and 10 slices, taking 15, 20, and 25 minutes respectively.
- Each slice takes $2.5$ minutes on average for a 10-slice pizza ($25/10 = 2.5$), which is the most optimal rate. However, for small values of $n$, we must ensure we cover at least 15 slices as a baseline minimum.
- By scaling the problem requirements, we can notice that if $n$ is odd, we round it up to the next even number (since pizzas are made of even-sized slices). 
- Alternatively, multiplying $n$ by 5, adjusting for boundary conditions, and dividing by 2 yields the exact minimum time efficiently.
- For $n \le 6$, the minimum time is always 15 minutes.

OR

- Consider we buy `a` 6-slices pizza, `b` 8-slices pizza, `c` 10-slices pizza
- We have to make sure that total slices are at least `n`
- Therefore, $6a + 8b + 10c >= n$ ......$Equation 1$
- Total time is minimum
- Therefore, $15a + 20b + 25c$ has to be minimum ......$Equation 2$
- If we rearrange the second equation, it becomes
    - $5(3a + 4b + 5c)$
    - multiplying and dividing by $2$
    - $2.5(6a + 8b + 10c)$ - we have to minimize this equation (modified equation)
    - From equation 1, $6a + 8b + 10c$ has least value $n$
    - Substitute the value in above modified equation
- Therefore, minimum time required is $2.5 * n$
- We have to make sure that time is within the correct bounds

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per test case, using direct mathematical operations.
- **Space Complexity:** $O(1)$, as only a few variables are used.