# Problem Number - 1876A Helmets in Night Light  
**Problem Link:** [https://codeforces.com/problemset/problem/1876/A](https://codeforces.com/problemset/problem/1876/A)  

---

## Topics  
- Greedy  
- Sorting  
- Implementation  
- Simulation  

---

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 10⁵ (number of helmets)  
- 1 ≤ `p` ≤ 10⁵ (base cost per helmet)  
- 1 ≤ `aᵢ` ≤ 10⁵ (maximum helmets that can be bought from shop i)  
- 1 ≤ `bᵢ` ≤ 10⁵ (cost per helmet in shop i)  
- Sum of n across all test cases ≤ 10⁵  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- You need to buy **n helmets** in total.  
- The first helmet always costs `p`.  
- For the remaining `n - 1` helmets, you can either:  
  - Buy from shops where the cost `aᵢ < r` (cheaper than base cost).  
  - Or pay the base cost `p` if no cheaper option is available.  
- **Strategy:**  
  - Sort shops by their helmet cost `aᵢ`.  
  - Greedily buy as many helmets as possible from the cheapest shops (up to their limit `bᵢ`), but only if `aᵢ < p`.  
  - Once all cheaper options are exhausted, buy the remaining helmets at cost `p`.  
- This ensures the minimum total cost.  

---

## Time and Space Complexity  
- **Sorting:** `O(n log n)`, to sort shops by cost.  
- **Greedy allocation:** `O(n)`, to distribute helmet purchases.  
- **Total Time Complexity:** `O(n log n)` per test case.  
- **Space Complexity:** `O(n)`, for storing shop data.  