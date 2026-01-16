# Problem Number - 706B Interesting Drink  
**Problem Link:** [https://codeforces.com/problemset/problem/706/B](https://codeforces.com/problemset/problem/706/B)  

---

## Topics  
- Prefix Sums  
- Arrays  
- Binary Search  
- Implementation  

---

## Constraints  
- 1 ≤ `n` ≤ 100000 (number of drinks)  
- 1 ≤ `price` ≤ 100000 (price of each drink)  
- 1 ≤ `q` ≤ 100000 (number of queries)  
- 1 ≤ `t` ≤ 10^9 (maximum money Vasya can spend)  
- Time limit per test: 2 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- Vasya wants to know how many drinks he can buy with at most `t` rubles.  
- **Key idea:**  
  - Count how many drinks have price ≤ `t`.  
- To answer efficiently:  
  1. Build a frequency array of drink prices.  
  2. Compute prefix sums so that `a[i]` stores the number of drinks with price ≤ `i`.  
  3. For each query `t`:  
     - If `t` exceeds the maximum possible price, answer is `n`.  
     - Otherwise, answer is `a[t]`.  
- This preprocessing allows each query to be answered in O(1).  

---

## Time and Space Complexity  
- **Preprocessing:** `O(n + MAX)`, where MAX = 100001 (building frequency and prefix sums).  
- **Query Answering:** `O(1)` per query.  
- **Total Time Complexity:** `O(n + q)`.  
- **Space Complexity:** `O(MAX)`, for storing prefix sums.  
