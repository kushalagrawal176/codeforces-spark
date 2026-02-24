# Problem Number - 2193D Monster Game

**Problem Link:** [https://codeforces.com/problemset/problem/2193/D](https://codeforces.com/problemset/problem/2193/D)

---

## Topics
- Greedy  
- Sorting  
- Implementation  
- Math  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2 × 10⁵ (number of monsters per test case)  
- 1 ≤ `aᵢ` ≤ 10⁹ (monster strengths)  
- 1 ≤ `bᵢ` ≤ `n` (number of monsters consumed in each step)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We are given two arrays:  
  - `a[]` representing monster strengths.  
  - `b[]` representing how many monsters are consumed at each step.  
- The goal is to maximize the score, where the score at step `i` is:  
    $\text{score} = (\text{strength of remaining monster}) \times (\text{step index})$

### Key Observations:
1. Sorting `a[]` ensures we can easily access the strongest remaining monsters.  
2. We maintain a running total `used` of monsters consumed so far.  
3. At each step `i`, if `used ≤ n`, we can still pick a monster. The candidate monster is `a[n - used]` (the strongest among those left).  
4. The score for step `i` is then `a[n - used] * (i + 1)`.  
5. We track the maximum score across all steps.  

### Why this works:
- By sorting, we always consider the largest possible remaining monster strength.  
- Multiplying by the step index accounts for the increasing weight of later steps.  
- The greedy approach ensures we maximize the product at each valid step.  

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting: `O(n log n)`  
  - Iteration: `O(n)`  
  - Total per test case: `O(n log n)`  
- **Space Complexity:** `O(n)`, for storing arrays `a` and `b`.  
