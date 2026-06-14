# Problem Number - 2060B Farmer John's Card Game  
**Problem Link:** [https://codeforces.com/problemset/problem/2060/B](https://codeforces.com/problemset/problem/2060/B)

---

## Topics
- Implementation
- Arrays
- Simulation

---

## Constraints
- 1 ≤ `t` ≤ 400 (number of test cases)  
- 1 ≤ `n ⋅ m` ≤ 2000 (size of deck and number of cards per pile)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

---

## Intuition / Approach
- Farmer John deals `n` piles of cards, each pile containing `m` cards.  
- The key observation is that **all cards in a pile must have the same remainder modulo `n`**.  
- If any pile contains cards with different remainders modulo `n`, the configuration is invalid, and the answer is `-1`.  
- Otherwise, we can assign each pile’s remainder position to the pile index (1-based).  
- Finally, we output the arrangement of piles in order of their modulo positions.

### Steps:
1. Read `t` test cases.  
2. For each test case:
   - Read `n` and `m`.  
   - For each pile, check if all `m` cards have the same remainder modulo `n`.  
   - If mismatch occurs, mark the configuration invalid (`-1`).  
   - Otherwise, store the pile index in the corresponding remainder position.  
3. Print `-1` if invalid, else print the arrangement array.

---

## Time and Space Complexity
- **Time Complexity:** `O(n × m)`, since we check all cards in all piles.  
- **Space Complexity:** `O(n)`, for storing the arrangement of piles.  