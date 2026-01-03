# Problem Number - 1398B Substring Removal Game  
**Problem Link:** [https://codeforces.com/problemset/problem/1398/B](https://codeforces.com/problemset/problem/1398/B)  

---

## Topics  
- Implementation  
- Greedy  
- String Processing  
- Games

## Constraints  
- 1 ≤ `t` ≤ 500  
- 1 ≤ `|s|` ≤ 100  
- String consists only of characters '0' and '1'  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The game involves two players, Alice and Bob, who alternately remove substrings of consecutive '1's.  
- Alice moves first and wants to maximize her score, while Bob tries to minimize Alice’s score.  
- Key observation:  
  - The score is determined by the lengths of the substrings of consecutive '1's.  
  - Alice will always pick the largest available substring first, then Bob picks the next largest, and so on.  
- Approach:  
  - Split the string into segments of consecutive '1's.  
  - Store their lengths in a list.  
  - Sort the list in descending order.  
  - Alice’s score is the sum of lengths at even indices (0, 2, 4, …).  

## Time and Space Complexity  
- **Time Complexity:** `O(n log n)` per test case, due to sorting the segments.  
- **Space Complexity:** `O(n)`, for storing the lengths of segments.  
