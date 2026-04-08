# Problem Number - 2156B Strange Machine  
**Problem Link:** [https://codeforces.com/problemset/problem/2156/B](https://codeforces.com/problemset/problem/2156/B)

---

## Topics
- Implementation
- Simulation
- Strings
- Greedy / Preprocessing

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)
- 1 ≤ `n` ≤ 20
- 1 ≤ `q` ≤ 10⁴
- 1 ≤ `a` ≤ 10⁹ (per query)
- `|s|` = `n` (string consists `"A"` or `"B"`)
- Time limit per test: 1.5 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- We are given `n` machines having state either `"A"` or `"B"`.
- We are given `q` queries, each containing an integer
- For each query we perform following operation - 
- We start at machine 1 and move on till machine `n`
- In each second we perform 2 operations, if state of machine `i` is :
    - "A" - decrease the value by **1**
    - "B" - replace number by **floor(number/2)**
    - Move to next machine cyclically
- The process is repeated till number becomes `0`.
- Determine the number of seconds.
- **Key Observation** - 
    - If there are no `"B"`
        - at each second we reduce **number by 1**.
        - Then, number of seconds required to reduce number to 0 is **number** seconds
    - Else
        - brute force as specified in the problem
        - at max **log(number)** operations
        - `"B"` helps to reduce the number to half

## Time and Space Complexity
- **Time Complexity:** `O(q log a)`, due to sorting the array and then scanning it once.
- **Space Complexity:** `O(n)`, for storing the array and its sorted 