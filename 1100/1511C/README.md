# Problem Number - 1511C Yet Another Card Deck  

**Problem Link:** [https://codeforces.com/problemset/problem/1511/C](https://codeforces.com/problemset/problem/1511/C)  

---

## Topics  
- Implementation  
- Simulation  
- Data Structures  

## Constraints  
- 2 ≤ `n` ≤ 3*10^5  
- 1 ≤ `q` ≤ 3*10^5  
- 1 ≤ `a[i]`, `t[j]` ≤ 50  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem describes a deck of cards where each card has a color (represented by an integer).  
- Initially, the deck is given in order. For each query, we are asked to find the position of a card with a given color and then move it to the front of the deck.  
- The key challenge is to efficiently simulate the deck operations while keeping track of positions.  

### Steps:  
1. **Initialization:**  
   - Store the first occurrence position of each card color.  

2. **Processing Queries:**  
   - For each query `t`, output the current position of card `t`.  
   - Move card `t` to the front of the deck.  
   - Update positions of all other cards accordingly (cards before `t` remain unchanged, cards after `t` shift right by one).  

3. **Simulation:**  
   - This can be done using an array or vector to track positions.  
   - After each query, update the positions to reflect the new deck order.  

## Time and Space Complexity  
- **Time Complexity:** `O(n + q)` storing positions and processing queries.  
- **Space Complexity:** `O(51) = O(1)`, for storing positions of cards.  
