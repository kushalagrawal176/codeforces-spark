# Problem Number - 381A Sereja and Dima  
**Problem Link:** [https://codeforces.com/problemset/problem/381/A](https://codeforces.com/problemset/problem/381/A)  

---

## Topics
- Greedy  
- Implementation  
- Two Pointers  

## Constraints
- 1 ≤ `n` ≤ 1000  
- 1 ≤ `a[i]` ≤ 1000  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The game involves two players (Sereja and Dima) alternately picking cards from either end of a sequence.  
- Each player always chooses the larger of the two available end cards.  
- To simulate the game:  
  1. Use two pointers (`left` and `right`) to track the ends of the array.  
  2. On each turn, compare `arr[left]` and `arr[right]`.  
  3. The current player takes the larger value, and the pointer is updated accordingly.  
  4. Alternate turns between the two players until all cards are taken.  
- At the end, output the total scores of Sereja and Dima.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, since each card is considered once.  
- **Space Complexity:** `O(1)`, only a few variables are used for tracking scores and pointers.  
