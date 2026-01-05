# Problem Number - 337A Puzzles  
**Problem Link:** [https://codeforces.com/problemset/problem/337/A](https://codeforces.com/problemset/problem/337/A)  

---

## Topics  
- Greedy  
- Sorting  
- Implementation  

## Constraints  
- 2 ≤ `n` ≤ `m` ≤ 50  
- 4 ≤ `puzzle size` ≤ 1000  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given `m` puzzles, each with a certain number of pieces, and `n` students.  
- The goal is to distribute `n` puzzles to students such that the difference between the largest and smallest puzzle sizes among the chosen puzzles is minimized.  
- Steps:  
  1. Sort the puzzle sizes in ascending order.  
  2. Consider every consecutive group of `n` puzzles in the sorted list.  
  3. For each group, compute the difference between the largest and smallest puzzle sizes.  
  4. The minimum of these differences across all groups is the answer.  

## Time and Space Complexity  
- **Time Complexity:** `O(m log m)`, due to sorting the puzzle sizes.  
- **Space Complexity:** `O(m)`, for storing the puzzle sizes.  
