# Problem Number - 490A Team Olympiad  
**Problem Link:** [https://codeforces.com/problemset/problem/490/A](https://codeforces.com/problemset/problem/490/A)  

---

## Topics  
- Implementation  
- Greedy  
- Simulation  

## Constraints  
- 1 ≤ `n` ≤ 5000 (number of students)  
- Each student has a skill type: 1, 2, or 3  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach  
- The problem asks us to form the maximum number of teams such that each team consists of exactly three students, one with skill type 1, one with skill type 2, and one with skill type 3.  
- To solve this:  
  1. Read the number of students `n` and their skill types.  
  2. Store the indices of students based on their skill type (three separate lists).  
  3. The maximum number of teams possible is the minimum of the sizes of these three lists.  
  4. Output this number and then print the indices of students forming each team.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we iterate through the list of students once.  
- **Space Complexity:** `O(n)`, for storing indices of students by skill type.  
