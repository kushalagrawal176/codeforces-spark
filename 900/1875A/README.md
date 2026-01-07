# Problem Number - 1875A Jellyfish and Undertale  
**Problem Link:** [https://codeforces.com/problemset/problem/1875/A](https://codeforces.com/problemset/problem/1875/A)  

---

## Topics
- Greedy  
- Math  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 2000 (number of test cases)  
- 1 ≤ `b` ≤ `a` ≤ 10⁹  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `x[i]` ≤ 10⁹ (values of the array)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We start with an initial value `b`.  
- For each of the `n` integers given, we add `min(x_i, a - 1)` to the answer.  
- Why?  
  - Because the jellyfish can only absorb up to `a - 1` from each monster.  
  - If the monster’s value is smaller, we take that instead.  
- Therefore, the final answer is:  `ans = b + Σ(min(x_i, a-1)),  i = 1..n`

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we process each monster once.  
- **Space Complexity:** `O(1)`, only a running total is maintained.  
