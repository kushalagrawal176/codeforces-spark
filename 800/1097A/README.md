# Problem Number - 1097A Gennady and a Card Game  

**Problem Link:** [https://codeforces.com/problemset/problem/1097/A](https://codeforces.com/problemset/problem/1097/A)  

---

## Topics  
- Implementation
- String Matching
- Simulation

## Constraints  
- Input consists of 1 card (string of length 2) and 5 other cards (each string of length 2).  
- Each card is represented by two characters:  
  - First character → rank (e.g., `A`, `2`, …, `K`)  
  - Second character → suit (e.g., `S`, `H`, `D`, `C`)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether Gennady can play at least one of his cards by matching either the **rank** or the **suit** of his card with any of the 5 cards on the table.  
- Steps to solve:  
  - Read Gennady’s card.  
  - For each of the 5 cards:  
    - Compare the first character (rank) with Gennady’s card rank.  
    - Compare the second character (suit) with Gennady’s card suit.  
    - If either matches, the answer is `"YES"`.  
  - If no matches are found after checking all 5 cards, the answer is `"NO"`.  

This is a straightforward **string comparison problem** with no complex logic required.  

## Time and Space Complexity  
- **Time Complexity:** `O(1)`, since we only check 5 cards (constant time).  
- **Space Complexity:** `O(1)`, only a few variables are used.  
