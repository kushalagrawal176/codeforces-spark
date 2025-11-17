# Problem Number - 349A Cinema Line  

**Problem Link:** [https://codeforces.com/problemset/problem/349/A](https://codeforces.com/problemset/problem/349/A)  

---

## Topics  
- Greedy  
- Implementation  

## Constraints  
- 1 ≤ n ≤ 100000  
- Each bill is either 25, 50, or 100  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem describes a cinema line where each ticket costs 25 rubles. Customers pay with bills of 25, 50, or 100 rubles.  
- The cashier starts with no money and must give change to each customer immediately.  
- **Key observations:**  
  - If a customer pays with **25**, no change is needed.  
  - If a customer pays with **50**, the cashier must give one **25** as change.  
  - If a customer pays with **100**, the cashier must give **75** as change. The best option is to give one **50** and one **25** (to save smaller bills for later). If that’s not possible, then three **25** bills can be given.  
- The greedy approach works because:  
  - Always prioritize giving a **50 + 25** for a 100 bill instead of three 25s. This preserves smaller bills for future customers.  
- If at any point the cashier cannot provide the required change, the answer is `"NO"`. Otherwise, `"YES"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we process each customer once.  
- **Space Complexity:** `O(1)`, only counters for 25 and 50 ruble bills are maintained.  