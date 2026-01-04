# Problem Number - 1729D Friends and the Restaurant  

**Problem Link:** [https://codeforces.com/problemset/problem/1729/D](https://codeforces.com/problemset/problem/1729/D)  

---

## Topics
- Greedy  
- Sorting  
- Two Pointers  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 10⁵ (number of friends per test case)  
- 1 ≤ `a[i]`, `b[i]` ≤ 10⁹  
- Sum of n across all test cases ≤ 10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Each friend has two values:  
  - `a[i]` = minimum amount they want to spend.  
  - `b[i]` = maximum amount they can afford.  
- A pair of friends `(i, j)` can go to the restaurant if:  
  `a[i] + a[j] ≤ b[i] + b[j]`.  
- Rearranging, this condition becomes:  
  `(b[i] - a[i]) + (b[j] - a[j]) ≥ 0`.  
- Define `diff[i] = b[i] - a[i]`.  
- The problem reduces to finding the maximum number of pairs `(i, j)` such that `diff[i] + diff[j] ≥ 0`.  

### Steps:
1. Compute `diff[i] = b[i] - a[i]` for all friends.  
2. Sort the array `diff`.  
3. Use two pointers:  
   - Start from the smallest (`l`) and largest (`r`).  
   - If `diff[l] + diff[r] ≥ 0`, form a pair and move both pointers inward.  
   - Otherwise, move `l` forward to try with a larger value.  
4. Count the number of valid pairs.  

This greedy approach works because pairing the smallest deficit with the largest surplus maximizes the chance of satisfying the condition.  

## Time and Space Complexity
- **Time Complexity:**  `O(n log n)` per test case (due to sorting).  
- **Space Complexity:**  `O(n)` for storing differences.  