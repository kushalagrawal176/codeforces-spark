# Problem Number - 2104A Three Decks  

**Problem Link:** [https://codeforces.com/problemset/problem/2104/A](https://codeforces.com/problemset/problem/2104/A)  

---

## Topics
- Greedy  
- Implementation  
- Arithmetic  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `a`, `b`, `c` ≤ 10⁸  
- Time limit per test: 2 second  
- Memory limit: 512 megabytes  

## Intuition / Approach
- We are given three integers `a`, `b`, and `c` representing the number of cards in three decks.  
- The goal is to check if it is possible to redistribute the cards so that all three decks have the same number of cards.  

### Key Observations:
1. The total number of cards `sum = a + b + c` must be divisible by 3, otherwise equal distribution is impossible.  
2. If divisible, the target average per deck is `avg = sum / 3`.  
3. Since redistribution is allowed, we must ensure that no deck exceeds the average in a way that makes balancing impossible.  
   - Specifically, if either `a > avg` or `b > avg`, then redistribution cannot balance the decks.  
   - Otherwise, it is possible, and the answer is `"YES"`.  

### Steps:
1. Compute the total sum of cards.  
2. Check divisibility by 3. If not divisible, output `"NO"`.  
3. Otherwise, compute the average.  
4. If `a > avg` or `b > avg`, output `"NO"`.  
5. Else, output `"YES"`.  

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only arithmetic checks are performed.  
- **Space Complexity:** `O(1)`, as only a few variables are used.  