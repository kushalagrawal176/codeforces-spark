# Problem Number - 1472D Even-Odd Game  

**Problem Link:** [https://codeforces.com/problemset/problem/1472/D](https://codeforces.com/problemset/problem/1472/D)  

---

## Topics
- Greedy  
- Sorting  
- Game Theory  

## Constraints
- 1 ≤ `t` ≤ 10⁴
- 1 ≤ `n` ≤ 2 ⋅ 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Alice and Bob take turns picking numbers from the array, starting with Alice.  
- Alice scores points only when she picks an **even** number, while Bob scores points only when he picks an **odd** number.  
- To maximize their chances, both players will always pick the **largest remaining number**.  
- Therefore, the strategy is:
  1. Sort the array in ascending order.  
  2. Iterate from the largest element downwards, alternating turns.  
  3. On Alice’s turn, add the number to her score if it is even.  
  4. On Bob’s turn, add the number to his score if it is odd.  
- After all numbers are picked, compare Alice’s and Bob’s scores:
  - If Alice’s score > Bob’s score → `"Alice"`  
  - If Bob’s score > Alice’s score → `"Bob"`  
  - Otherwise → `"Tie"`  

This greedy approach works because the order of picking is fixed (largest first), and each player only benefits from numbers of their preferred parity.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)`, due to sorting the array.  
- **Space Complexity:** `O(n)`, for storing the array.  
