# Problem Number - 978C Letters  
**Problem Link:** [https://codeforces.com/problemset/problem/978/C](https://codeforces.com/problemset/problem/978/C)  

---

## Topics
- Binary Search 
- Prefix Sums
- Implementation 

## Constraints
- 1 ≤ `n`, `m` ≤ 2 × 10⁵  
- 1 ≤ `ai` ≤ 10¹⁰ (size of dorm rooms)  
- 1 ≤ `bj` ≤ sum(`ai`) (letters count)  
- Time limit per test: 4 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes `n` dormitories, each with a certain number of rooms. Letters are delivered sequentially across dorms.  
- For each letter `bj`, we need to determine which dormitory it belongs to and the room number inside that dorm.  
- To solve this efficiently:
  - Compute a **prefix sum array** of dorm room counts. This allows us to quickly know the cumulative number of rooms up to each dorm.  
  - For each letter `bj`, use **binary search** to find the smallest dorm index where the cumulative room count is ≥ `bj`.  
  - The dorm number is this index + 1 (since dorms are 1-indexed).  
  - The room number is `bj - prefix[dorm - 1]` (or simply `bj` if it’s in the first dorm).  

This ensures we can answer each query in **O(log n)** time, making the overall complexity **O(n + m log n)**, which is efficient for the given constraints.

## Time and Space Complexity
- **Time Complexity:**  
  - `O(n)` for building prefix sums.  
  - `O(m log n)` for answering queries using binary search.  
  - Total: `O(n + m log n)`.  

- **Space Complexity:**  
  - `O(n)` for storing prefix sums.  
  - `O(1)` additional space for query processing.  
