# Problem Number - 379A New Year Candles  
**Problem Link:** [https://codeforces.com/problemset/problem/379/A](https://codeforces.com/problemset/problem/379/A)  

---

## Topics  
- Simulation  
- Implementation  
- Greedy  

## Constraints  
- 1 ≤ `a` ≤ 1000 (initial candles)  
- 2 ≤ `b` ≤ 1000 (exchange rate: number of stubs needed for a new candle)  
- Time limit per test: 1 seconds  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- You start with `a` candles. Each candle burned leaves one stub.  
- For every `b` stubs, you can make one new candle.  
- The process continues until you no longer have enough stubs to make a new candle.  
- Simulation approach:  
  - Burn all initial candles and count them.  
  - While the number of stubs is at least `b`, exchange them for new candles.  
  - Add the new candles to the total burned count.  
  - Update the number of stubs as the sum of leftover stubs and newly burned candles.  
- The final count is the total number of candles burned.  

## Time and Space Complexity  
- **Time Complexity:** `O(a)`, since in the worst case you simulate burning each candle.  
- **Space Complexity:** `O(1)`, only a few variables are used.  
