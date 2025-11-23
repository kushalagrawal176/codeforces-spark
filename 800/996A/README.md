# Problem Number - 996A Hit the Lottery  
**Problem Link:** [https://codeforces.com/problemset/problem/996/A](https://codeforces.com/problemset/problem/996/A)  

---

## Topics
- Greedy
- Implementation

## Constraints
- 1 ≤ `n` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of banknotes needed to represent a given amount of money `n`.  
- Available denominations are: 1, 5, 10, 20, and 100.  
- To minimize the number of notes, we should always use the **largest possible denomination first** (classic greedy approach).  
- Steps:
  1. Divide `n` by 100 to use as many 100-value notes as possible.  
  2. Take the remainder and divide by 20, then by 10, then by 5.  
  3. Finally, whatever remains is covered by 1-value notes.  
- This works because the denominations are multiples of each other, so greedy choice always leads to the optimal solution.

## Time and Space Complexity
- **Time Complexity:** `O(1)`, since we only perform a fixed number of divisions and modulus operations.  
- **Space Complexity:** `O(1)`, only constant space used for counters.
