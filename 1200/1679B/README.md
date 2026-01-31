# Problem Number - 1679B Stone Age Problem  
**Problem Link:** [https://codeforces.com/problemset/problem/1679/B](https://codeforces.com/problemset/problem/1679/B)  

---

## Topics  
- Data Structures  
- Implementation  
- Lazy Updates  

## Constraints  
- 1 ≤ `n`, `q` ≤ 2 × 10⁵  
- 1 ≤ `a[i]`, `x` ≤ 10⁹  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We need to maintain the sum of an array while supporting two operations:  
  1. **Update a single element** to a new value.  
  2. **Set all elements** to a new global value.  

- A naive approach of updating all elements in type 2 queries would take `O(n)`, which is too slow for `q` up to 2 × 10⁵.  

- To optimize:  
  - Keep track of the **current sum** of the array.  
  - Maintain a **global value** and a **timestamp** to know whether an element was updated after the last global assignment.  
  - For type 1 queries, adjust the sum by subtracting the old value (either the element’s last updated value or the global value if it wasn’t updated after the last reset) and adding the new value.  
  - For type 2 queries, set the global value and reset the sum to `n * x`.  

- This way, each query is processed in **O(1)** time.  

## Time and Space Complexity  
- **Time Complexity:** `O(n + q)`  
  - `O(n)` for reading the initial array.  
  - `O(1)` per query for q queries.  
- **Space Complexity:** `O(n)`  
  - Arrays to store last values and timestamps.  
