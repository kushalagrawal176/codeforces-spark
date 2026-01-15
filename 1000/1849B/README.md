# Problem Number - 1849B Monsters  

**Problem Link:** [https://codeforces.com/problemset/problem/1849/B](https://codeforces.com/problemset/problem/1849/B)  

---

## Topics  
- Implementation  
- Sorting  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 3 × 10⁵ (number of monsters)  
- 1 ≤ `k` ≤ 10⁹  
- 1 ≤ `health of each monster` ≤ 10⁹  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- Each monster has a health value `x`. The player attacks with strength `k`.  
- The key observation is that the order in which monsters are defeated depends on the remainder when dividing their health by `k`.  
- If `x % k == 0`, the monster requires exactly `x / k` hits, but for ordering purposes we treat its remainder as `k`.  
- Otherwise, the remainder `x % k` determines how "late" the monster will be defeated compared to others.  
- Thus, we assign each monster a value:  
  - `val = (x % k == 0 ? k : x % k)`  
  - Along with its index (1-based).  
- Sort all monsters in descending order of `val`. If two monsters have the same `val`, the one with the smaller index comes first.  
- Output the indices in this sorted order.  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)` per test case, due to sorting.  
- **Space Complexity:** `O(n)`, for storing the monster values and indices.  
