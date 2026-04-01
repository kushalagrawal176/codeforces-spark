# Problem Number - 2107B Apples in Boxes  

**Problem Link:** [https://codeforces.com/problemset/problem/2107/B](https://codeforces.com/problemset/problem/2107/B)  

---

## Topics
- Game Theory  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 10⁵ (number of boxes)  
- 1 ≤ `k` ≤ 10⁹ (allowed difference between max and min apples)  
- 1 ≤ `aᵢ` ≤ 10⁹ (apples in each box)  
- Sum of `n` across all test cases ≤ 10⁵  
- **Time limit per test:** 1 second  
- **Memory limit:** 256 megabytes  

## Intuition / Approach
- Tom and Jerry take turns removing **exactly one apple** from any non-empty box.  
- A player **loses immediately** if:
  1. No box has apples left.  
  2. After their move, the difference between the maximum and minimum apples across boxes exceeds `k`.  

- **Key Observations:**
  - The game is essentially about parity and balance.  
  - If the total number of apples (`sum`) is **even**, Jerry wins (since Tom starts first, and Jerry gets the last move and then Tom has none to pick).  
  - If the total number of apples is **odd**, Tom has a chance to win, but only if the difference between the largest and smallest box after his move does not exceed `k`.  
  - Thus, the winner depends on both **parity of sum** and **range constraint (max - min ≤ k)**.  

- **Strategy:**
  - Compute the sum of apples.  
  - Sort the array to easily check `max - min`.  
  - Simulate Tom’s first move by reducing the largest box by 1.  
  - If after this move the difference exceeds `k` or the sum is even → **Jerry wins**.  
  - Otherwise → **Tom wins**.  

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting each test case: `O(n log n)`.  
  - Since total n across all test cases ≤ 10⁵, this is efficient.  

- **Space Complexity:**  
  - `O(n)` for storing apples in each test case.  