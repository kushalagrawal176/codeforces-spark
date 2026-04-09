# Problem Number - 2143B Discounts  
**Problem Link:** [https://codeforces.com/problemset/problem/2143/B](https://codeforces.com/problemset/problem/2143/B)  

---

## Topics
- Greedy  
- Sorting  
- Implementation 
- Two Pointers

---

## Constraints
- 1 ≤ `t` ≤ 10⁴ 
- 1 ≤ `n`, `k` ≤ 2 × 10⁵  
- 1 ≤ `a[i]` ≤ 10⁹
- 1 ≤ `b[i]` ≤ `n`  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- The problem describes a scenario where you buy `n` items with given prices and have `k` discount coupons.  
- Each coupon allows you to get cheapest item for free if you buy `x` items (where `x` is given in array `b`).  
- The goal is to minimize the total cost after applying coupons optimally.  

### Key Idea:
- Since coupons allow you to get the cheapest item among a group of `x` items for free, the strategy is to maximize the value of the free items.  
- Sort both arrays:
  - `a` (prices) in ascending order.
  - `b` (coupon values) in ascending order.  
- Start from the most expensive items and assign coupons to maximize the free value.  
- For each coupon `x`, you look at the group of `x` items ending at the current pointer and take the cheapest one in that group as free.  
- Keep reducing the pointer and accumulate the free value.  
- Final answer = total sum of all items − sum of free items.  

---

## Time and Space Complexity
- **Time Complexity:**  
  - Sorting arrays `a` and `b`: `O(n log n + k log k)`.  
  - Iterating through coupons: `O(k)`.  
  - Overall: `O(n log n + k log k)`.  

- **Space Complexity:**  
  - `O(n + k)` for storing arrays.  