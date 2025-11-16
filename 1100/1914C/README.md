# Problem Number - 1914C Quests 
**Problem Link:** [https://codeforces.com/problemset/problem/1914/C](https://codeforces.com/problemset/problem/1914/C)  

---

## Topics
- Greedy  
- Dynamic Programming  
- Implementation  

---

## Constraints
- 1 ≤ t ≤ 10⁴ (number of test cases)  
- 1 ≤ n ≤ 2 × 10⁵ (array size)  
- 1 ≤ k ≤ 2 × 10⁵ (maximum number of moves allowed)  
- 1 ≤ a[i], b[i] ≤ 10³  
- Sum of n across all test cases ≤ 2 × 10⁵  
- Time limit per test: 2.5 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- You are given two arrays `a` and `b` of length `n`.  
- You can make at most `k` moves. In each move, you either:  
  1. Take the next element from `a` (adding it to your score).  
  2. Use the maximum element from `b` seen so far for the remaining moves.  

- To solve this:  
  - Maintain a running sum `p` of elements taken from `a`.  
  - Track the maximum value `c` encountered in `b` up to the current index.  
  - At each step, compute the possible score if you stop taking from `a` and instead use `c` for the remaining moves:  
    - **Score = p + c × (remaining moves)**  
  - Keep the maximum score across all possible stopping points.  

- This greedy approach works because:  
  - Taking more from `a` increases the cumulative sum.  
  - Waiting longer may increase the maximum `b` value.  
  - At each step, you evaluate the trade-off and update the best answer.  

---

## Time and Space Complexity
- **Time Complexity:** O(n) per test case; overall O(Σn) across all test cases (≤ 2 × 10⁵).  
- **Space Complexity:** O(n) for arrays `a` and `b`, and O(1) extra space for variables (`p`, `c`, `d`).  
