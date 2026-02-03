# Problem Number - 1722D Line  

**Problem Link:** [https://codeforces.com/problemset/problem/1722/D](https://codeforces.com/problemset/problem/1722/D)  

---

## Topics
- Greedy  
- Implementation  
- Arrays  
- Sorting

---

## Constraints
- 1 ≤ `n` ≤ 2 × 10⁵  
- 1 ≤ `t` ≤ 100 
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem involves a line of `n` people, each facing either left (`L`) or right (`R`).  
- Each person contributes to the total sum based on their position:
  - If facing `L`, contribution = index `i`.  
  - If facing `R`, contribution = `(n - 1 - i)`.  
- Initially, compute the sum of contributions for the given string.  
- For each position, calculate the potential "gain" if that person were flipped:
  - Gain = new contribution - old contribution.  
  - For `L` at index `i`, gain = `(n - 1 - i) - i`.  
  - For `R` at index `i`, gain = `i - (n - 1 - i)`.  
- Sort all possible gains and apply them greedily from largest to smallest.  
- After each applied gain, update the sum and print the result.  
- This ensures we maximize the sum step by step, producing the required sequence of answers.  

---

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case due to sorting the gains.  
- **Space Complexity:** `O(n)` for storing gains.  