# Problem Number - 1373A Donut Shops

**Problem Link:** [https://codeforces.com/problemset/problem/1373/A](https://codeforces.com/problemset/problem/1373/A)

---

## Topics
- Greedy
- Math
- Implementation

---

## Constraints
- 1 ≤ `t` ≤ 1000 
- 1 ≤ `a`, `c` ≤ 10⁹
- 2 ≤ `b` ≤ 10⁹
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- The problem compares the cost of buying donuts individually versus buying them in a box.  
- **First shop:**  
  - If the price of one donut `a` is strictly less than the price of one box `c`, then buying a single donut is cheaper.  
  - Output `1` in this case, otherwise `-1`.  

- **Second shop:**  
  - If buying `b` donuts individually (`b × a`) costs more than buying one box (`c`), then the box is cheaper.  
  - Output `b` in this case, otherwise `-1`.  

- The solution is straightforward: check these two conditions for each test case and print the results.  

---

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case (just comparisons).  
- **Space Complexity:** `O(1)`, only a few variables are used.  