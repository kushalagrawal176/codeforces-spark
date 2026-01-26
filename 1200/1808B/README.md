# Problem Number - 1808B Playing in a Casino  
**Problem Link:** [https://codeforces.com/problemset/problem/1808/B](https://codeforces.com/problemset/problem/1808/B)  

---

## Topics  
- Implementation  
- Sorting  
- Greedy  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n * m` ≤ 3 × 10⁵ (players and numbers per card)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- Each test case provides an `n × m` matrix representing the cards of players.  
- The winnings are calculated column by column.  
- For each column:  
  - Extract all values into an array.  
  - Sort the array.  
  - The contribution of each element at index `k` (0-based) is:  `value * (2k - n + 1)`  
  - This formula accounts for the difference between how many times the element contributes positively (as a larger number in pairs) and negatively (as a smaller number in pairs).  
- Summing contributions across all columns gives the total winnings.  
- Sorting ensures we can correctly count contributions without explicitly iterating over all pairs, which would be too slow.  

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(n log n)` per column due to sorting.  
  - Across all columns, `O(m × n log n)`.  
  - With constraints, this is efficient enough.  
- **Space Complexity:** `O(n)` per column, since we only store one column at a time.  
