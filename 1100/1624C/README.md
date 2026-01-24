# Problem Number - 1624C Division by Two and Permutation  

**Problem Link:** [https://codeforces.com/problemset/problem/1624/C](https://codeforces.com/problemset/problem/1624/C)  

---

## Topics  
- Greedy  
- Sorting  
- Implementation  
- Number Theory  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 50 (array size)  
- 1 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 3 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We need to check if the given array can be transformed into a permutation of numbers from 1 to n by repeatedly dividing elements by 2.  
- Key observation:  
  - Each number can be reduced by dividing until it fits within `[1..n]`.  
  - Larger numbers are harder to place, so we should handle them first.  
- Steps:  
  1. Sort the array in descending order.  
  2. For each number, keep dividing by 2 until it is ≤ n and not already assigned.  
  3. If we can assign all numbers uniquely to positions `[1..n]`, output **YES**.  
  4. Otherwise, output **NO**.  

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(n log n)` per test case (due to sorting and division steps).  
- **Space Complexity:**  
  - `O(n)` for tracking assigned positions.  