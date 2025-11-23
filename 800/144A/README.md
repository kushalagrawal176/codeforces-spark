# Problem Number - 144A Arrival of the General  
**Problem Link:** [https://codeforces.com/problemset/problem/144/A](https://codeforces.com/problemset/problem/144/A)  

---

## Topics
- Implementation
- Greedy
- Simulation

## Constraints
- 2 ≤ `n` ≤ 100  
- 1 ≤ `ai` ≤ 100 (height of each soldier)  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the minimum number of swaps needed to bring:
  - The **tallest soldier** to the **front** of the line.
  - The **shortest soldier** to the **end** of the line.
- Each swap can only be performed between adjacent soldiers.
- Key observations:
  - We need the **leftmost occurrence** of the tallest soldier (so it reaches the front fastest).
  - We need the **rightmost occurrence** of the shortest soldier (so it reaches the end fastest).
- Steps:
  1. Traverse the array to find:
     - Index `p` of the leftmost tallest soldier.
     - Index `q` of the rightmost shortest soldier.
  2. Calculate swaps:
     - Tallest soldier → front requires `p` swaps.
     - Shortest soldier → end requires `(n - 1 - q)` swaps.
  3. If `p > q`, then after moving the tallest soldier, the shortest soldier shifts left by 1, so subtract 1.
- Formula:
  - If `p > q`: total swaps = `p + (n - 1 - q) - 1`
  - Else: total swaps = `p + (n - 1 - q)`

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for scanning the array once.  
- **Space Complexity:** `O(1)`, only constant extra space used.
